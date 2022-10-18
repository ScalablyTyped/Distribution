package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscAnnotationsCommonSrcReferencesRegistryMod.ReferencesRegistry
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
import typings.std.Map
import typings.typescript.mod.Declaration
import typings.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcAnalysisNgccReferencesRegistryMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/ngcc_references_registry", "NgccReferencesRegistry")
  @js.native
  open class NgccReferencesRegistry protected ()
    extends StObject
       with ReferencesRegistry {
    def this(host: ReflectionHost) = this()
    
    /**
      * Register one or more references in the registry.
      * @param references A collection of references to register.
      */
    /* CompleteClass */
    override def add(source: DeclarationNode, references: Reference[DeclarationNode]*): Unit = js.native
    
    /**
      * Create and return a mapping for the registered resolved references.
      * @returns A map of reference identifiers to reference declarations.
      */
    def getDeclarationMap(): Map[
        Identifier, 
        typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.Declaration[Declaration]
      ] = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var map: Any = js.native
  }
}
