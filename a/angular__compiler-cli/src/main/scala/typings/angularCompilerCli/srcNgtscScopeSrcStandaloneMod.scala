package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscMetadataSrcApiMod.MetadataReader
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScope
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.RemoteScope
import typings.angularCompilerCli.srcNgtscScopeSrcDependencyMod.DtsModuleScopeResolver
import typings.angularCompilerCli.srcNgtscScopeSrcLocalMod.LocalModuleScopeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcStandaloneMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/standalone", "StandaloneComponentScopeReader")
  @js.native
  open class StandaloneComponentScopeReader protected ()
    extends StObject
       with ComponentScopeReader {
    def this(
      metaReader: MetadataReader,
      localModuleReader: LocalModuleScopeRegistry,
      dtsModuleReader: DtsModuleScopeResolver
    ) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var dtsModuleReader: Any = js.native
    
    def getRemoteScope(): Null = js.native
    /**
      * Get the `RemoteScope` required for this component, if any.
      *
      * If the component requires remote scoping, then retrieve the directives/pipes registered for
      * that component. If remote scoping is not required (the common case), returns `null`.
      */
    /* CompleteClass */
    override def getRemoteScope(clazz: ClassDeclaration[DeclarationNode]): RemoteScope | Null = js.native
    
    /* CompleteClass */
    override def getScopeForComponent(clazz: ClassDeclaration[DeclarationNode]): ComponentScope | Null = js.native
    
    /* private */ var localModuleReader: Any = js.native
    
    /* private */ var metaReader: Any = js.native
  }
}
