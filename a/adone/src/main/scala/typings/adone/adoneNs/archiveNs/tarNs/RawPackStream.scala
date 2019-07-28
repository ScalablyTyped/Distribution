package typings.adone.adoneNs.archiveNs.tarNs

import typings.adone.Anon_Linkname
import typings.adone.Anon_Symlink
import typings.adone.adoneNs.archiveNs.tarNs.INs.LinkSink
import typings.adone.adoneNs.archiveNs.tarNs.INs.OptionalHeader
import typings.adone.adoneNs.archiveNs.tarNs.INs.Writable
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw tar unpack stream
  */
@JSGlobal("adone.archive.tar.RawPackStream")
@js.native
class RawPackStream () extends Readable {
  def destroy(err: js.Any): Unit = js.native
  def entry(header: OptionalHeader with Anon_Symlink): LinkSink = js.native
  def entry(header: OptionalHeader with Anon_Symlink, callback: js.Function1[/* err */ js.Any, Unit]): LinkSink = js.native
  def entry(header: OptionalHeader, buffer: Buffer): Writable = js.native
  def entry(header: OptionalHeader, buffer: Buffer, callback: js.Function1[/* err */ js.Any, Unit]): Writable = js.native
  @JSName("entry")
  def entry_Writable(header: (OptionalHeader with Anon_Linkname) | OptionalHeader): Writable = js.native
  @JSName("entry")
  def entry_Writable(
    header: (OptionalHeader with Anon_Linkname) | OptionalHeader,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Writable = js.native
}

