package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScope
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.RemoteScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcComponentScopeMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/component_scope", "CompoundComponentScopeReader")
  @js.native
  open class CompoundComponentScopeReader protected ()
    extends StObject
       with ComponentScopeReader {
    def this(readers: js.Array[ComponentScopeReader]) = this()
    
    /**
      * Get the `RemoteScope` required for this component, if any.
      *
      * If the component requires remote scoping, then retrieve the directives/pipes registered for
      * that component. If remote scoping is not required (the common case), returns `null`.
      */
    /* CompleteClass */
    override def getRemoteScope(clazz: ClassDeclarationDeclarati): RemoteScope | Null = js.native
    
    /* CompleteClass */
    override def getScopeForComponent(clazz: ClassDeclarationDeclarati): ComponentScope | Null = js.native
    
    /* private */ var readers: Any = js.native
  }
}
