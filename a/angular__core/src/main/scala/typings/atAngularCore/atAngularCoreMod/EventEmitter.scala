package typings.atAngularCore.atAngularCoreMod

import typings.rxjs.rxjsMod.Subject
import typings.rxjs.rxjsMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "EventEmitter")
@js.native
/**
  * Creates an instance of this class that can
  * deliver events synchronously or asynchronously.
  *
  * @param isAsync When true, deliver events asynchronously.
  *
  */
class EventEmitter[T /* <: js.Any */] () extends Subject[T] {
  def this(isAsync: Boolean) = this()
  /**
    * Emits an event containing a given value.
    * @param value The value to emit.
    */
  def emit(): Unit = js.native
  def emit(value: T): Unit = js.native
  def subscribe(generatorOrNext: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any): Subscription = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any, complete: js.Any): Subscription = js.native
}

