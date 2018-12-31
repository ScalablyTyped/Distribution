package typings
package atAngularCoreLib.srcEventUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/event_emitter", "EventEmitter")
@js.native
/**
  * Creates an instance of this class that can
  * deliver events synchronously or asynchronously.
  *
  * @param isAsync When true, deliver events asynchronously.
  *
  */
class EventEmitter[T] ()
  extends rxjsLib.rxjsMod.Subject[T] {
  def this(isAsync: scala.Boolean) = this()
  /**
    * Internal
    */
  var __isAsync: scala.Boolean = js.native
  /**
    * Emits an event containing a given value.
    * @param value The value to emit.
    */
  def emit(): scala.Unit = js.native
  def emit(value: T): scala.Unit = js.native
  def subscribe(generatorOrNext: js.Any): js.Any = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any): js.Any = js.native
  def subscribe(generatorOrNext: js.Any, error: js.Any, complete: js.Any): js.Any = js.native
}

