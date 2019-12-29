package typings.archiver.archiverMod

import typings.archiver.archiverBooleans.`false`
import typings.archiver.archiverStrings.close
import typings.archiver.archiverStrings.data
import typings.archiver.archiverStrings.drain
import typings.archiver.archiverStrings.entry
import typings.archiver.archiverStrings.error
import typings.archiver.archiverStrings.finish
import typings.archiver.archiverStrings.pipe
import typings.archiver.archiverStrings.progress
import typings.archiver.archiverStrings.unpipe
import typings.archiver.archiverStrings.warning
import typings.glob.globMod.IOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Archiver extends Transform {
  def abort(): this.type = js.native
  def append(source: String): this.type = js.native
  def append(source: String, name: EntryData): this.type = js.native
  def append(source: Buffer): this.type = js.native
  def append(source: Buffer, name: EntryData): this.type = js.native
  def append(source: Readable): this.type = js.native
  def append(source: Readable, name: EntryData): this.type = js.native
  def directory(dirpath: String, destpath: String): this.type = js.native
  def directory(dirpath: String, destpath: String, data: EntryData): this.type = js.native
  def directory(dirpath: String, destpath: String, data: EntryDataFunction): this.type = js.native
  /** if false is passed for destpath, the path of a chunk of data in the archive is set to the root */
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`): this.type = js.native
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`, data: EntryData): this.type = js.native
  @JSName("directory")
  def directory_false(dirpath: String, destpath: `false`, data: EntryDataFunction): this.type = js.native
  def file(filename: String, data: EntryData): this.type = js.native
  def glob(pattern: String): this.type = js.native
  def glob(pattern: String, options: IOptions): this.type = js.native
  def glob(pattern: String, options: IOptions, data: EntryData): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ EntryData, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_entry(event: entry, listener: js.Function1[/* entry */ EntryData, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* progress */ ProgressData, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* error */ ArchiverError, Unit]): this.type = js.native
  def pointer(): Double = js.native
  def setFormat(format: String): this.type = js.native
  def setModule(module: js.Function): this.type = js.native
  def symlink(filepath: String, target: String): this.type = js.native
  def use(plugin: js.Function): this.type = js.native
}

