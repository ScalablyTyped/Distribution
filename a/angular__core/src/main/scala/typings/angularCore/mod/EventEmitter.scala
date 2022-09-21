package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<T> * / any */ @js.native
trait EventEmitter[T]
  extends StObject
     with /**
  * Creates an instance of this class that can
  * deliver events synchronously or asynchronously.
  *
  * @param [isAsync=false] When true, deliver events asynchronously.
  *
  */
Instantiable0[EventEmitter[T]]
     with Instantiable1[/* isAsync */ Boolean, EventEmitter[T]] {
  
  /**
    * Emits an event containing a given value.
    * @param value The value to emit.
    */
  def emit(): Unit = js.native
  def emit(value: T): Unit = js.native
  
  /**
    * Registers handlers for events emitted by this instance.
    * @param next When supplied, a custom handler for emitted events.
    * @param error When supplied, a custom handler for an error notification from this emitter.
    * @param complete When supplied, a custom handler for a completion notification from this
    *     emitter.
    */
  def subscribe(): Any = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): Any = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): Any = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ Any, Unit],
    complete: js.Function0[Unit]
  ): Any = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Any = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit]): Any = js.native
  def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Any = js.native
  def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Any = js.native
  def subscribe(observerOrNext: Any): Any = js.native
  def subscribe(observerOrNext: Any, error: Any): Any = js.native
  def subscribe(observerOrNext: Any, error: Any, complete: Any): Any = js.native
  def subscribe(observerOrNext: Any, error: Unit, complete: Any): Any = js.native
  def subscribe(observerOrNext: Unit, error: Any): Any = js.native
  def subscribe(observerOrNext: Unit, error: Any, complete: Any): Any = js.native
  def subscribe(observerOrNext: Unit, error: Unit, complete: Any): Any = js.native
}
