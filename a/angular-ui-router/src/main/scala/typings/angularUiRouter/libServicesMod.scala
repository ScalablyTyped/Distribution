package typings.angularUiRouter

import typings.angular.mod.IRootScopeService
import typings.angularUiRouter.libStateProviderMod.StateProvider
import typings.angularUiRouter.libUrlRouterProviderMod.UrlRouterProvider
import typings.uirouterCore.libCommonCommonMod.TypedMap
import typings.uirouterCore.mod.ResolveContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesMod {
  
  @JSImport("angular-ui-router/lib/services", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocals(ctx: ResolveContext): TypedMap[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocals")(ctx.asInstanceOf[js.Any]).asInstanceOf[TypedMap[Any]]
  
  object watchDigests {
    
    inline def apply($rootScope: IRootScopeService): Unit = ^.asInstanceOf[js.Dynamic].apply($rootScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("angular-ui-router/lib/services", "watchDigests")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("angular-ui-router/lib/services", "watchDigests.$inject")
    @js.native
    def inject: js.Array[String] = js.native
    
    inline def inject_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("$inject")(x.asInstanceOf[js.Any])
  }
  
  /* augmented module */
  object uirouterCoreLibRouterAugmentingMod {
    
    trait UIRouter extends StObject {
      
      /** @hidden */
      var stateProvider: StateProvider
      
      /** @hidden */
      var urlRouterProvider: UrlRouterProvider
    }
    object UIRouter {
      
      inline def apply(stateProvider: StateProvider, urlRouterProvider: UrlRouterProvider): UIRouter = {
        val __obj = js.Dynamic.literal(stateProvider = stateProvider.asInstanceOf[js.Any], urlRouterProvider = urlRouterProvider.asInstanceOf[js.Any])
        __obj.asInstanceOf[UIRouter]
      }
      
      extension [Self <: UIRouter](x: Self) {
        
        inline def setStateProvider(value: StateProvider): Self = StObject.set(x, "stateProvider", value.asInstanceOf[js.Any])
        
        inline def setUrlRouterProvider(value: UrlRouterProvider): Self = StObject.set(x, "urlRouterProvider", value.asInstanceOf[js.Any])
      }
    }
  }
}
