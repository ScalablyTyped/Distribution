package typings.angularCore.mod

import typings.angularCore.anon.SIGNAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped (): T */ @js.native
trait WritableSignal[T]
  extends StObject
     with SIGNAL {
  
  /**
    * Returns a readonly version of this signal. Readonly signals can be accessed to read their value
    * but can't be changed using set, update or mutate methods. The readonly signals do _not_ have
    * any built-in mechanism that would prevent deep-mutation of their value.
    */
  def asReadonly(): Signal_[T] = js.native
  
  /**
    * Update the current value by mutating it in-place, and
    * notify any dependents.
    */
  def mutate(mutatorFn: js.Function1[/* value */ T, Unit]): Unit = js.native
  
  /**
    * Directly set the signal to a new value, and notify any dependents.
    */
  def set(value: T): Unit = js.native
  
  /**
    * Update the value of the signal based on its current value, and
    * notify any dependents.
    */
  def update(updateFn: js.Function1[/* value */ T, T]): Unit = js.native
}
