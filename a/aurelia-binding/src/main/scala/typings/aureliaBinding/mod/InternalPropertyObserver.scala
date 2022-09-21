package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalPropertyObserver extends StObject {
  
  /**
    * Gets the property value.
    */
  def getValue(): Any = js.native
  
  /**
    * Sets the property value.
    */
  def setValue(newValue: Any): Unit = js.native
  
  /**
    * Subscribe to property changes with a callback function.
    */
  def subscribe(callback: js.Function2[/* newValue */ Any, /* oldValue */ Any, Unit]): Unit = js.native
  /**
    * Subscribe a callable object to property changes.
    * @param context A value to be passed to the callable object's call function when a property change occurs.
    * @param callable A callable object.
    */
  def subscribe(context: Any, callable: Callable): Unit = js.native
  
  /**
    * Unsubscribes a callback function from property changes.
    */
  def unsubscribe(callback: js.Function2[/* newValue */ Any, /* oldValue */ Any, Unit]): Unit = js.native
  /**
    * Unsubscribes a callable object from property changes.
    * @param context A value to be passed to the callable object's call function when a property change occurs.
    * @param callable A callable object.
    */
  def unsubscribe(context: Any, callable: Callable): Unit = js.native
}
