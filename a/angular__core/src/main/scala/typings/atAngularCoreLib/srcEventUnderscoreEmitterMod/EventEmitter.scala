package typings
package atAngularCoreLib.srcEventUnderscoreEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/event_emitter", "EventEmitter")
@js.native
class EventEmitter[T] ()
  extends rxjsLib.rxjsMod.Subject[T] {
  /**
       * Creates an instance of this class that can
       * deliver events synchronously or asynchronously.
       *
       * @param isAsync When true, deliver events asynchronously.
       *
       */
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
  /**
       * Emits an event containing a given value.
       * @param value The value to emit.
       */
  def emit(value: T): scala.Unit = js.native
  /**
       * Registers handlers for events emitted by this instance.
       * @param generatorOrNext When supplied, a custom handler for emitted events.
       * @param error When supplied, a custom handler for an error notification
       * from this emitter.
       * @param complete When supplied, a custom handler for a completion
       * notification from this emitter.
       */
  def subscribe(generatorOrNext: js.Any): js.Any = js.native
  /**
       * Registers handlers for events emitted by this instance.
       * @param generatorOrNext When supplied, a custom handler for emitted events.
       * @param error When supplied, a custom handler for an error notification
       * from this emitter.
       * @param complete When supplied, a custom handler for a completion
       * notification from this emitter.
       */
  def subscribe(generatorOrNext: js.Any, error: js.Any): js.Any = js.native
  /**
       * Registers handlers for events emitted by this instance.
       * @param generatorOrNext When supplied, a custom handler for emitted events.
       * @param error When supplied, a custom handler for an error notification
       * from this emitter.
       * @param complete When supplied, a custom handler for a completion
       * notification from this emitter.
       */
  def subscribe(generatorOrNext: js.Any, error: js.Any, complete: js.Any): js.Any = js.native
}

