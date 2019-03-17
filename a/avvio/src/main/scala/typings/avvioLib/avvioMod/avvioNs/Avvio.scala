package typings
package avvioLib.avvioMod.avvioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Avvio[I]
  extends nodeLib.eventsMod.EventEmitter
     with Server[I] {
  var booted: scala.Boolean = js.native
  var started: scala.Boolean = js.native
  @JSName("on")
  def on_close(event: avvioLib.avvioLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_preReady(event: avvioLib.avvioLibStrings.preReady, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: avvioLib.avvioLibStrings.start, listener: js.Function0[scala.Unit]): this.type = js.native
  def `override`(server: context[I], fn: Plugin[_, I], options: js.Any): context[I] = js.native
  def prettyPrint(): java.lang.String = js.native
  def start(): this.type = js.native
  def toJSON(): js.Object = js.native
}

