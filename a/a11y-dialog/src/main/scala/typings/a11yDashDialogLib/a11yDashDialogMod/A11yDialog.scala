package typings
package a11yDashDialogLib.a11yDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A11yDialog extends js.Object {
  /**
    * Bind click listeners to dialog openers and closers.
    */
  def create(): scala.Unit = js.native
  def create(el: scala.Null, containers: java.lang.String): scala.Unit = js.native
  def create(el: scala.Null, containers: stdLib.Element): scala.Unit = js.native
  def create(el: scala.Null, containers: stdLib.NodeList): scala.Unit = js.native
  def create(el: stdLib.Element): scala.Unit = js.native
  def create(el: stdLib.Element, containers: java.lang.String): scala.Unit = js.native
  def create(el: stdLib.Element, containers: stdLib.Element): scala.Unit = js.native
  def create(el: stdLib.Element, containers: stdLib.NodeList): scala.Unit = js.native
  /**
    * Unbind click listeners from dialog openers and closers and remove all bound custom event listeners registered with `.on()`
    */
  def destroy(): scala.Unit = js.native
  /**
    * Hides the dialog.
    */
  def hide(): scala.Unit = js.native
  def off(
    evt: a11yDashDialogLib.DialogEvents,
    callback: js.Function2[/* dialogElement */ js.Any, /* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  def on(
    evt: a11yDashDialogLib.DialogEvents,
    callback: js.Function2[/* dialogElement */ js.Any, /* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Shows the dialog.
    */
  def show(): scala.Unit = js.native
}

