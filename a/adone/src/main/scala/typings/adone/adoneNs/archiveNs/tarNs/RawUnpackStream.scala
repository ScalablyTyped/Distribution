package typings.adone.adoneNs.archiveNs.tarNs

import typings.adone.adoneNs.archiveNs.tarNs.INs.Header
import typings.adone.adoneNs.archiveNs.tarNs.INs.UnpackSourceStream
import typings.adone.adoneStrings.close
import typings.adone.adoneStrings.drain
import typings.adone.adoneStrings.entry
import typings.adone.adoneStrings.error
import typings.adone.adoneStrings.finish
import typings.adone.adoneStrings.pipe
import typings.adone.adoneStrings.unpipe
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw writable unpack stream
  */
@JSGlobal("adone.archive.tar.RawUnpackStream")
@js.native
class RawUnpackStream () extends Writable {
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_entry(
    event: entry,
    listener: js.Function3[
      /* header */ Header, 
      /* stream */ UnpackSourceStream, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_entry(
    event: entry,
    listener: js.Function3[
      /* header */ Header, 
      /* stream */ UnpackSourceStream, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
}

