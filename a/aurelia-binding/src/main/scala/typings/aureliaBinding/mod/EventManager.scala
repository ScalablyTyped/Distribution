package typings.aureliaBinding.mod

import typings.aureliaBinding.anon.Properties
import typings.aureliaBinding.aureliaBindingBooleans.`true`
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-binding", "EventManager")
@js.native
class EventManager () extends js.Object {
  def this(escapeShadowRoot: Boolean) = this()
  
  def addEventListener(
    target: EventTarget,
    targetEvent: String,
    callback: EventListenerOrEventListenerObject,
    delegate: delegationStrategy
  ): js.Function0[Unit] = js.native
  /**
    * Subscribes to specified event on the target element.
    * @param target Target element.
    * @param targetEvent Name of event to subscribe.
    * @param callback Event listener callback.
    * @param delegate True to use event delegation mechanism.
    * @param disposable True to return a disposable object with dispose() method instead of a function
    * @returns function which removes event listener.
    */
  @JSName("addEventListener")
  def addEventListener_true(
    target: EventTarget,
    targetEvent: String,
    callback: EventListenerOrEventListenerObject,
    delegate: delegationStrategy,
    disposable: `true`
  ): Disposable = js.native
  
  var escapeShadowRoot: Boolean = js.native
  
  def registerElementConfig(config: Properties): Unit = js.native
}
