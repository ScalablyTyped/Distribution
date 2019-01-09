package typings
package adoneLib.adoneNs.archiveNs.zipNs.unpackNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipFile[StringType]
  extends adoneLib.adoneNs.eventNs.Emitter {
  /**
    * Always decoded with CP437 per the spec
    */
  var comment: StringType = js.native
  /**
    * Total number of central directory records
    */
  var entryCount: scala.Double = js.native
  /**
    * true until close() is called; then it's false
    */
  var isOpen: scala.Boolean = js.native
  /**
    * Causes all future calls to openReadStream() to fail,
    * and closes the fd after all streams created by openReadStream() have emitted their end events
    */
  def close(): scala.Unit = js.native
  /**
    * Emitted after the fd is actually closed
    */
  @JSName("on")
  def on_close(event: adoneLib.adoneLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted after the last entry event has been emitted
    */
  @JSName("on")
  def on_end(event: adoneLib.adoneLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted for each entry.
    *
    * If decodeStrings is true, entries emitted via this event have already passed file name validation
    *
    * If validateEntrySizes is true and this entry's compressionMethod is 0 (stored without compression),
    * this entry has already passed entry size validation
    */
  @JSName("on")
  def on_entry(
    event: adoneLib.adoneLibStrings.entry,
    listener: js.Function1[/* entry */ Entry[StringType], scala.Unit]
  ): this.type = js.native
  /**
    * Emitted in the case of errors with reading the zip file
    */
  @JSName("on")
  def on_error(event: adoneLib.adoneLibStrings.error, listener: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Emitted after the fd is actually closed
    */
  @JSName("once")
  def once_close(event: adoneLib.adoneLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted after the last entry event has been emitted
    */
  @JSName("once")
  def once_end(event: adoneLib.adoneLibStrings.end, listener: js.Function0[scala.Unit]): this.type = js.native
  /**
    * Emitted for each entry.
    *
    * If decodeStrings is true, entries emitted via this event have already passed file name validation
    *
    * If validateEntrySizes is true and this entry's compressionMethod is 0 (stored without compression),
    * this entry has already passed entry size validation
    */
  @JSName("once")
  def once_entry(
    event: adoneLib.adoneLibStrings.entry,
    listener: js.Function1[/* entry */ Entry[StringType], scala.Unit]
  ): this.type = js.native
  /**
    * Emitted in the case of errors with reading the zip file
    */
  @JSName("once")
  def once_error(event: adoneLib.adoneLibStrings.error, listener: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
  /**
    * Opens a read stream for the given entry
    */
  def openReadStream(entry: Entry[StringType]): js.Promise[nodeLib.streamMod.Readable] = js.native
  def openReadStream(entry: Entry[StringType], options: adoneLib.Anon_Decompress): js.Promise[nodeLib.streamMod.Readable] = js.native
  def readEntry(): js.Promise[scala.Unit] = js.native
}

