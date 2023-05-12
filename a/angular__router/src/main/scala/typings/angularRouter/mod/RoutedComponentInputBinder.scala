package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Injectable used as a tree-shakable provider for opting in to binding router data to component
  * inputs.
  *
  * The RouterOutlet registers itself with this service when an `ActivatedRoute` is attached or
  * activated. When this happens, the service subscribes to the `ActivatedRoute` observables (params,
  * queryParams, data) and sets the inputs of the component using `ComponentRef.setInput`.
  * Importantly, when an input does not have an item in the route data with a matching key, this
  * input is set to `undefined`. If it were not done this way, the previous information would be
  * retained if the data got removed from the route (i.e. if a query parameter is removed).
  *
  * The `RouterOutlet` should unregister itself when destroyed via `unsubscribeFromRouteData` so that
  * the subscriptions are cleaned up.
  */
trait RoutedComponentInputBinder extends StObject {
  
  def bindActivatedRouteToOutletComponent(outlet: RouterOutlet): Unit
  
  /* private */ var outletDataSubscriptions: Any
  
  /* private */ var subscribeToRouteData: Any
  
  def unsubscribeFromRouteData(outlet: RouterOutlet): Unit
}
object RoutedComponentInputBinder {
  
  inline def apply(
    bindActivatedRouteToOutletComponent: RouterOutlet => Unit,
    outletDataSubscriptions: Any,
    subscribeToRouteData: Any,
    unsubscribeFromRouteData: RouterOutlet => Unit
  ): RoutedComponentInputBinder = {
    val __obj = js.Dynamic.literal(bindActivatedRouteToOutletComponent = js.Any.fromFunction1(bindActivatedRouteToOutletComponent), outletDataSubscriptions = outletDataSubscriptions.asInstanceOf[js.Any], subscribeToRouteData = subscribeToRouteData.asInstanceOf[js.Any], unsubscribeFromRouteData = js.Any.fromFunction1(unsubscribeFromRouteData))
    __obj.asInstanceOf[RoutedComponentInputBinder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoutedComponentInputBinder] (val x: Self) extends AnyVal {
    
    inline def setBindActivatedRouteToOutletComponent(value: RouterOutlet => Unit): Self = StObject.set(x, "bindActivatedRouteToOutletComponent", js.Any.fromFunction1(value))
    
    inline def setOutletDataSubscriptions(value: Any): Self = StObject.set(x, "outletDataSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscribeToRouteData(value: Any): Self = StObject.set(x, "subscribeToRouteData", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribeFromRouteData(value: RouterOutlet => Unit): Self = StObject.set(x, "unsubscribeFromRouteData", js.Any.fromFunction1(value))
  }
}
