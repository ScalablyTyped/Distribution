package typings.angularUiRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typings.angularUiRouter.libStateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typings.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    inline def apply(
      stateProvider: typings.angularUiRouter.libStateProviderMod.StateProvider,
      urlRouterProvider: typings.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider
    ): typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    extension [Self <: typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter](x: Self) {
      
      inline def setStateProvider(value: typings.angularUiRouter.libStateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      inline def setUrlRouterProvider(value: typings.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
