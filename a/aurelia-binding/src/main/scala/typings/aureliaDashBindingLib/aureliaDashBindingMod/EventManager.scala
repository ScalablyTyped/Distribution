package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "EventManager")
@js.native
class EventManager () extends js.Object {
  def addEventListener(
    target: stdLib.EventTarget,
    targetEvent: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    delegate: delegationStrategy
  ): js.Function0[scala.Unit] = js.native
  /**
    * Subscribes to specified event on the target element.
    * @param target Target element.
    * @param targetEvent Name of event to subscribe.
    * @param callback Event listener callback.
    * @param delegate True to use event delegation mechanism.
    * @param disposable True to return a disposable object with dispose() method instead of a function
    * @returns function which removes event listener.
    */
  def addEventListener(
    target: stdLib.EventTarget,
    targetEvent: java.lang.String,
    callback: stdLib.EventListenerOrEventListenerObject,
    delegate: delegationStrategy,
    disposable: aureliaDashBindingLib.aureliaDashBindingLibNumbers.`true`
  ): Disposable = js.native
  def registerElementConfig(config: aureliaDashBindingLib.Anon_Properties): scala.Unit = js.native
}

