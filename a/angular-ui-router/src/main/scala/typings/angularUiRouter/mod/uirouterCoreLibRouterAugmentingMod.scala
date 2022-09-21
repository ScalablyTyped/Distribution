package typings.angularUiRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreLibRouterAugmentingMod {
  
  trait UIRouter extends StObject {
    
    /** @hidden */
    var stateProvider: typings.angularUiRouter.stateProviderMod.StateProvider
    
    /** @hidden */
    var urlRouterProvider: typings.angularUiRouter.urlRouterProviderMod.UrlRouterProvider
  }
  object UIRouter {
    
    inline def apply(
      stateProvider: typings.angularUiRouter.stateProviderMod.StateProvider,
      urlRouterProvider: typings.angularUiRouter.urlRouterProviderMod.UrlRouterProvider
    ): typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter = {
      val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter]
    }
    
    extension [Self <: typings.angularUiRouter.mod.uirouterCoreLibRouterAugmentingMod.UIRouter](x: Self) {
      
      inline def setStateProvider(value: typings.angularUiRouter.stateProviderMod.StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
      
      inline def setUrlRouterProvider(value: typings.angularUiRouter.urlRouterProviderMod.UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
    }
  }
}
