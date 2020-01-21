package typings.angularPlatformBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerInstance extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function): Unit = js.native
  def on(eventName: String): Unit = js.native
  def on(eventName: String, callback: js.Function): Unit = js.native
}

