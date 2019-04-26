package typings
package architectLib.architectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Architect
  extends nodeLib.eventsMod.EventEmitter {
  def getService(name: java.lang.String): js.Any = js.native
  @JSName("on")
  def on_error(
    event: architectLib.architectLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_plugin(
    event: architectLib.architectLibStrings.plugin,
    listener: js.Function1[/* plugin */ Plugin, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: architectLib.architectLibStrings.ready,
    listener: js.Function1[/* app */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_service(
    event: architectLib.architectLibStrings.service,
    listener: js.Function3[/* name */ java.lang.String, /* service */ Service, /* plugin */ Plugin, scala.Unit]
  ): this.type = js.native
}

