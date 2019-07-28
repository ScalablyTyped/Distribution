package typings.adone.adoneNs.archiveNs.zipNs.unpackNs.INs

import typings.adone.Anon_Decompress
import typings.adone.adoneNs.eventNs.Emitter
import typings.adone.adoneStrings.close
import typings.adone.adoneStrings.end
import typings.adone.adoneStrings.entry
import typings.adone.adoneStrings.error
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZipFile[StringType] extends Emitter {
  /**
    * Always decoded with CP437 per the spec
    */
  var comment: StringType = js.native
  /**
    * Total number of central directory records
    */
  var entryCount: Double = js.native
  /**
    * true until close() is called; then it's false
    */
  var isOpen: Boolean = js.native
  /**
    * Causes all future calls to openReadStream() to fail,
    * and closes the fd after all streams created by openReadStream() have emitted their end events
    */
  def close(): Unit = js.native
  /**
    * Emitted after the fd is actually closed
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted after the last entry event has been emitted
    */
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted for each entry.
    *
    * If decodeStrings is true, entries emitted via this event have already passed file name validation
    *
    * If validateEntrySizes is true and this entry's compressionMethod is 0 (stored without compression),
    * this entry has already passed entry size validation
    */
  @JSName("on")
  def on_entry(event: entry, listener: js.Function1[/* entry */ Entry[StringType], Unit]): this.type = js.native
  /**
    * Emitted in the case of errors with reading the zip file
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted after the fd is actually closed
    */
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted after the last entry event has been emitted
    */
  @JSName("once")
  def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted for each entry.
    *
    * If decodeStrings is true, entries emitted via this event have already passed file name validation
    *
    * If validateEntrySizes is true and this entry's compressionMethod is 0 (stored without compression),
    * this entry has already passed entry size validation
    */
  @JSName("once")
  def once_entry(event: entry, listener: js.Function1[/* entry */ Entry[StringType], Unit]): this.type = js.native
  /**
    * Emitted in the case of errors with reading the zip file
    */
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Opens a read stream for the given entry
    */
  def openReadStream(entry: Entry[StringType]): js.Promise[Readable] = js.native
  def openReadStream(entry: Entry[StringType], options: Anon_Decompress): js.Promise[Readable] = js.native
  def readEntry(): js.Promise[Unit] = js.native
}

