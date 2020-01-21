package typings.a11yDialog.mod

import typings.std.Element
import typings.std.Event_
import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yDialog extends js.Object {
  /**
    * Bind click listeners to dialog openers and closers.
    */
  def create(): Unit = js.native
  def create(el: Null, containers: String): Unit = js.native
  def create(el: Null, containers: Element): Unit = js.native
  def create(el: Null, containers: NodeList): Unit = js.native
  def create(el: Element): Unit = js.native
  def create(el: Element, containers: String): Unit = js.native
  def create(el: Element, containers: Element): Unit = js.native
  def create(el: Element, containers: NodeList): Unit = js.native
  /**
    * Unbind click listeners from dialog openers and closers and remove all bound custom event listeners registered with `.on()`
    */
  def destroy(): Unit = js.native
  /**
    * Hides the dialog.
    */
  def hide(): Unit = js.native
  def off(evt: DialogEvents, callback: js.Function2[/* dialogElement */ js.Any, /* event */ Event_, Unit]): Unit = js.native
  def on(evt: DialogEvents, callback: js.Function2[/* dialogElement */ js.Any, /* event */ Event_, Unit]): Unit = js.native
  /**
    * Shows the dialog.
    */
  def show(): Unit = js.native
}

