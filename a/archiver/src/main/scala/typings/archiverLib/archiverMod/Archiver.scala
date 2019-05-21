package typings
package archiverLib.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archiver
  extends nodeLib.streamMod.Transform {
  def abort(): this.type = js.native
  def append(source: java.lang.String): this.type = js.native
  def append(source: java.lang.String, name: EntryData): this.type = js.native
  def append(source: nodeLib.Buffer): this.type = js.native
  def append(source: nodeLib.Buffer, name: EntryData): this.type = js.native
  def append(source: nodeLib.streamMod.Readable): this.type = js.native
  def append(source: nodeLib.streamMod.Readable, name: EntryData): this.type = js.native
  /** if false is passed for destpath, the path of a chunk of data in the archive is set to the root */
  def directory(dirpath: java.lang.String, destpath: archiverLib.archiverLibNumbers.`false`): this.type = js.native
  def directory(dirpath: java.lang.String, destpath: archiverLib.archiverLibNumbers.`false`, data: EntryData): this.type = js.native
  def directory(
    dirpath: java.lang.String,
    destpath: archiverLib.archiverLibNumbers.`false`,
    data: EntryDataFunction
  ): this.type = js.native
  def directory(dirpath: java.lang.String, destpath: java.lang.String): this.type = js.native
  def directory(dirpath: java.lang.String, destpath: java.lang.String, data: EntryData): this.type = js.native
  def directory(dirpath: java.lang.String, destpath: java.lang.String, data: EntryDataFunction): this.type = js.native
  def file(filename: java.lang.String, data: EntryData): this.type = js.native
  def glob(pattern: java.lang.String): this.type = js.native
  def glob(pattern: java.lang.String, options: globLib.globMod.IOptions): this.type = js.native
  def glob(pattern: java.lang.String, options: globLib.globMod.IOptions, data: EntryData): this.type = js.native
  @JSName("on")
  def on_close(event: archiverLib.archiverLibStrings.close, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_data(
    event: archiverLib.archiverLibStrings.data,
    listener: js.Function1[/* data */ EntryData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_drain(event: archiverLib.archiverLibStrings.drain, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_entry(
    event: archiverLib.archiverLibStrings.entry,
    listener: js.Function1[/* entry */ EntryData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: archiverLib.archiverLibStrings.error,
    listener: js.Function1[/* error */ ArchiverError, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_finish(event: archiverLib.archiverLibStrings.finish, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(
    event: archiverLib.archiverLibStrings.pipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: archiverLib.archiverLibStrings.progress,
    listener: js.Function1[/* progress */ ProgressData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unpipe(
    event: archiverLib.archiverLibStrings.unpipe,
    listener: js.Function1[/* src */ nodeLib.streamMod.Readable, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_warning(
    event: archiverLib.archiverLibStrings.warning,
    listener: js.Function1[/* error */ ArchiverError, scala.Unit]
  ): this.type = js.native
  def pointer(): scala.Double = js.native
  def setFormat(format: java.lang.String): this.type = js.native
  def setModule(module: js.Function): this.type = js.native
  def symlink(filepath: java.lang.String, target: java.lang.String): this.type = js.native
  def use(plugin: js.Function): this.type = js.native
}

