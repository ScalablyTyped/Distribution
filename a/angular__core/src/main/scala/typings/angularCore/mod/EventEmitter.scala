package typings.angularCore.mod

import typings.rxjs.mod.Subject
import typings.rxjs.mod.Subscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
trait EventEmitter[T] extends Subject[T] {
  
  /**
    * Emits an event containing a given value.
    * @param value The value to emit.
    */
  def emit(): Unit = js.native
  def emit(value: T): Unit = js.native
  
  def subscribe(observerOrNext: Any): Subscription = js.native
  def subscribe(observerOrNext: Any, error: Any): Subscription = js.native
  def subscribe(observerOrNext: Any, error: Any, complete: Any): Subscription = js.native
  def subscribe(observerOrNext: Any, error: Unit, complete: Any): Subscription = js.native
  def subscribe(observerOrNext: Unit, error: Any): Subscription = js.native
  def subscribe(observerOrNext: Unit, error: Any, complete: Any): Subscription = js.native
  def subscribe(observerOrNext: Unit, error: Unit, complete: Any): Subscription = js.native
}
