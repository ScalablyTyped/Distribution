package typings
package adoneLib.adoneNs.archiveNs.tarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a raw tar unpack stream
  */
@JSGlobal("adone.archive.tar.RawPackStream")
@js.native
class RawPackStream ()
  extends nodeLib.streamMod.Readable {
  def destroy(err: js.Any): scala.Unit = js.native
  def entry(header: adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader with adoneLib.Anon_Symlink): adoneLib.adoneNs.archiveNs.tarNs.INs.LinkSink = js.native
  def entry(
    header: adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader with adoneLib.Anon_Symlink,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): adoneLib.adoneNs.archiveNs.tarNs.INs.LinkSink = js.native
  def entry(header: adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader, buffer: nodeLib.Buffer): adoneLib.adoneNs.archiveNs.tarNs.INs.Writable = js.native
  def entry(
    header: adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader,
    buffer: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): adoneLib.adoneNs.archiveNs.tarNs.INs.Writable = js.native
  @JSName("entry")
  def entry_Writable(
    header: (adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader with adoneLib.Anon_Linkname) | adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader
  ): adoneLib.adoneNs.archiveNs.tarNs.INs.Writable = js.native
  @JSName("entry")
  def entry_Writable(
    header: (adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader with adoneLib.Anon_Linkname) | adoneLib.adoneNs.archiveNs.tarNs.INs.OptionalHeader,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): adoneLib.adoneNs.archiveNs.tarNs.INs.Writable = js.native
}

