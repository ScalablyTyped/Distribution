package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter
  extends adoneLib.adoneNs.eventNs.Emitter {
  def on(
    event: EndHookEvent | StartHookEvent,
    listener: js.Function1[
      (/* event */ adoneLib.Anon_Hook) | (/* event */ adoneLib.Anon_HookBlock), 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_done(event: adoneLib.adoneLibStrings.done, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_end test`(
    event: adoneLib.adoneLibStrings.`end test`,
    listener: js.Function1[/* event */ adoneLib.Anon_BlockMeta, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_enter block`(
    event: adoneLib.adoneLibStrings.`enter block`,
    listener: js.Function1[/* event */ adoneLib.Anon_Block, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: adoneLib.adoneLibStrings.error, listener: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def `on_exit block`(
    event: adoneLib.adoneLibStrings.`exit block`,
    listener: js.Function1[/* event */ adoneLib.Anon_Block, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_skip test`(
    event: adoneLib.adoneLibStrings.`skip test`,
    listener: js.Function1[/* event */ adoneLib.Anon_BlockRuntime, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_start test`(
    event: adoneLib.adoneLibStrings.`start test`,
    listener: js.Function1[/* event */ adoneLib.Anon_BlockTest, scala.Unit]
  ): this.type = js.native
  /**
    * Stops testing
    */
  def stop(): scala.Unit = js.native
}

