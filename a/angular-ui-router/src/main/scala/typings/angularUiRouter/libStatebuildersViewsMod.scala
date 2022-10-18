package typings.angularUiRouter

import org.scalablytyped.runtime.StringDictionary
import typings.angularUiRouter.libInterfaceMod.Ng1ViewDeclaration
import typings.angularUiRouter.libTemplateFactoryMod.TemplateFactory
import typings.uirouterCore.libCommonCommonMod.IInjectable
import typings.uirouterCore.libStateInterfaceMod.ViewDeclaration
import typings.uirouterCore.libViewInterfaceMod.ViewConfig
import typings.uirouterCore.libViewViewMod.ViewConfigFactory
import typings.uirouterCore.mod.PathNode
import typings.uirouterCore.mod.ResolveContext
import typings.uirouterCore.mod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatebuildersViewsMod {
  
  @JSImport("angular-ui-router/lib/statebuilders/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("angular-ui-router/lib/statebuilders/views", "Ng1ViewConfig")
  @js.native
  open class Ng1ViewConfig protected ()
    extends StObject
       with ViewConfig {
    def this(path: js.Array[PathNode], viewDecl: Ng1ViewDeclaration, factory: TemplateFactory) = this()
    
    /* CompleteClass */
    @JSName("$id")
    var $id: Double = js.native
    
    var component: String = js.native
    
    var controller: js.Function = js.native
    
    var factory: TemplateFactory = js.native
    
    /**
      * Gets the controller for a view configuration.
      *
      * @returns {Function|Promise.<Function>} Returns a controller, or a promise that resolves to a controller.
      */
    def getController(context: ResolveContext): IInjectable | String | (js.Promise[IInjectable | String]) = js.native
    
    def getTemplate(uiView: Any, context: ResolveContext): String = js.native
    
    /** Fetches templates, runs dynamic (controller|template)Provider code, lazy loads Components, etc */
    /* CompleteClass */
    override def load(): js.Promise[ViewConfig] = js.native
    
    /* CompleteClass */
    var loaded: Boolean = js.native
    
    var locals: Any = js.native
    
    /** The node the ViewConfig is bound to */
    /* CompleteClass */
    var path: js.Array[typings.uirouterCore.libPathPathNodeMod.PathNode] = js.native
    @JSName("path")
    var path_Ng1ViewConfig: js.Array[PathNode] = js.native
    
    var template: String = js.native
    
    /** The normalized view declaration from [[State.views]] */
    /* CompleteClass */
    var viewDecl: ViewDeclaration = js.native
    @JSName("viewDecl")
    var viewDecl_Ng1ViewConfig: Ng1ViewDeclaration = js.native
  }
  
  inline def getNg1ViewConfigFactory(): ViewConfigFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("getNg1ViewConfigFactory")().asInstanceOf[ViewConfigFactory]
  
  inline def ng1ViewsBuilder(state: StateObject): StringDictionary[Ng1ViewDeclaration] = ^.asInstanceOf[js.Dynamic].applyDynamic("ng1ViewsBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Ng1ViewDeclaration]]
}
