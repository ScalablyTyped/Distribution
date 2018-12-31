package typings
package adoneLib.adoneNs.archiveNs.tarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw writable unpack stream
  */
@JSGlobal("adone.archive.tar.RawUnpackStream")
@js.native
class RawUnpackStream ()
  extends nodeLib.streamMod.Writable {
  @JSName("on")
  def on_close(event: adoneLib.adoneLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: adoneLib.adoneLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_entry(
    event: adoneLib.adoneLibStrings.entry,
    listener: js.Function3[
      /* header */ adoneLib.adoneNs.archiveNs.tarNs.INs.Header, 
      /* stream */ adoneLib.adoneNs.archiveNs.tarNs.INs.UnpackSourceStream, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: adoneLib.adoneLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: adoneLib.adoneLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: adoneLib.adoneLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: adoneLib.adoneLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(event: adoneLib.adoneLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: adoneLib.adoneLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_entry(
    event: adoneLib.adoneLibStrings.entry,
    listener: js.Function3[
      /* header */ adoneLib.adoneNs.archiveNs.tarNs.INs.Header, 
      /* stream */ adoneLib.adoneNs.archiveNs.tarNs.INs.UnpackSourceStream, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: adoneLib.adoneLibStrings.error, listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: adoneLib.adoneLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(
    event: adoneLib.adoneLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unpipe(
    event: adoneLib.adoneLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
}

