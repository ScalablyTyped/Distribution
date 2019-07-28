package typings.adone.adoneNs.shaniNs.INs

import typings.adone.Anon_Block
import typings.adone.Anon_BlockHook
import typings.adone.Anon_BlockHookMeta
import typings.adone.Anon_BlockMeta
import typings.adone.Anon_BlockRuntime
import typings.adone.Anon_BlockTest
import typings.adone.adoneStrings.`end test`
import typings.adone.adoneStrings.`enter block`
import typings.adone.adoneStrings.`exit block`
import typings.adone.adoneStrings.`skip test`
import typings.adone.adoneStrings.`start test`
import typings.adone.adoneStrings.done
import typings.adone.adoneStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emitter
  extends typings.adone.adoneNs.eventNs.Emitter {
  def on(event: EndHookEvent, listener: js.Function1[/* event */ Anon_BlockHookMeta, Unit]): this.type = js.native
  def on(event: StartHookEvent, listener: js.Function1[/* event */ Anon_BlockHook, Unit]): this.type = js.native
  @JSName("on")
  def on_done(event: done, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_endtest(event: `end test`, listener: js.Function1[/* event */ Anon_BlockMeta, Unit]): this.type = js.native
  @JSName("on")
  def on_enterblock(event: `enter block`, listener: js.Function1[/* event */ Anon_Block, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_exitblock(event: `exit block`, listener: js.Function1[/* event */ Anon_Block, Unit]): this.type = js.native
  @JSName("on")
  def on_skiptest(event: `skip test`, listener: js.Function1[/* event */ Anon_BlockRuntime, Unit]): this.type = js.native
  @JSName("on")
  def on_starttest(event: `start test`, listener: js.Function1[/* event */ Anon_BlockTest, Unit]): this.type = js.native
  /**
    * Stops testing
    */
  def stop(): Unit = js.native
}

