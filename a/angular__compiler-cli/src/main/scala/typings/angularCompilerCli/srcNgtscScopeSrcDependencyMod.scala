package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscImportsSrcAliasMod.AliasingHost
import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ExportScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcDependencyMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/dependency", "MetadataDtsModuleScopeResolver")
  @js.native
  open class MetadataDtsModuleScopeResolver protected ()
    extends StObject
       with DtsModuleScopeResolver {
    /**
      * @param dtsMetaReader a `MetadataReader` which can read metadata from `.d.ts` files.
      */
    def this(dtsMetaReader: MetadataReader) = this()
    def this(dtsMetaReader: MetadataReader, aliasingHost: AliasingHost) = this()
    
    /* private */ var aliasingHost: Any = js.native
    
    /**
      * Cache which holds fully resolved scopes for NgModule classes from .d.ts files.
      */
    /* private */ var cache: Any = js.native
    
    /* private */ var dtsMetaReader: Any = js.native
    
    /* private */ var maybeAlias: Any = js.native
    
    /* CompleteClass */
    override def resolve(ref: Reference[ClassDeclaration[DeclarationNode]]): ExportScope | Null = js.native
  }
  
  trait DtsModuleScopeResolver extends StObject {
    
    def resolve(ref: Reference[ClassDeclaration[DeclarationNode]]): ExportScope | Null
  }
  object DtsModuleScopeResolver {
    
    inline def apply(resolve: Reference[ClassDeclaration[DeclarationNode]] => ExportScope | Null): DtsModuleScopeResolver = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[DtsModuleScopeResolver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DtsModuleScopeResolver] (val x: Self) extends AnyVal {
      
      inline def setResolve(value: Reference[ClassDeclaration[DeclarationNode]] => ExportScope | Null): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
