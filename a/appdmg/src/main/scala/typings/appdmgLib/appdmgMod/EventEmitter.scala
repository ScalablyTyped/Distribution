package typings
package appdmgLib.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends nodeLib.NodeJSNs.EventEmitter {
  @JSName("on")
  def on_error(event: appdmgLib.appdmgLibStrings.error, listener: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: appdmgLib.appdmgLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: appdmgLib.appdmgLibStrings.progress,
    listener: js.Function1[/* info */ Progress, scala.Unit]
  ): this.type = js.native
}

