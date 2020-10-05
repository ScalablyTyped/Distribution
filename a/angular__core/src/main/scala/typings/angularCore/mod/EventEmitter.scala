package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.rxjs.mod.Subject
import typings.rxjs.mod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter[T]
  extends Subject[T]
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
  def subscribe(generatorOrNext: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.UndefOr[scala.Nothing], error: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.UndefOr[scala.Nothing], error: js.Any, complete: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any, error: js.UndefOr[scala.Nothing], complete: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any, complete: js.Any): Subscription = js.native
}

@JSImport("@angular/core", "EventEmitter")
@js.native
object EventEmitter
  extends Instantiable0[EventEmitter[js.Any | js.Object]]
     with Instantiable1[/* isAsync */ Boolean, EventEmitter[js.Any | js.Object]]

