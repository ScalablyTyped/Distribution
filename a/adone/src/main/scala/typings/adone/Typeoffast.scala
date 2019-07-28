package typings.adone

import typings.adone.adoneNs.fastNs.INs.BufferFile
import typings.adone.adoneNs.fastNs.INs.FileConstructor
import typings.adone.adoneNs.fastNs.INs.LocalMapStream
import typings.adone.adoneNs.fastNs.INs.LocalStreamConstructor
import typings.adone.adoneNs.fastNs.INs.MapOptions
import typings.adone.adoneNs.fastNs.INs.MapSource
import typings.adone.adoneNs.fastNs.INs.NullFile
import typings.adone.adoneNs.fastNs.INs.SrcOptions
import typings.adone.adoneNs.fastNs.INs.WatchMapOptions
import typings.adone.adoneNs.fastNs.INs.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoffast extends js.Object {
  val File: FileConstructor = js.native
  // File is based on vinyl typings
  // https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/vinyl/index.d.ts
  // plugins
  val INs: TypeofIPlugin = js.native
  val LocalStream: LocalStreamConstructor = js.native
  val pluginNs: TypeofpluginNotify = js.native
  def map(mappings: MapSource): LocalMapStream[BufferFile] = js.native
  /**
    * The same as fast.src, but source and dest paths are defined in one place
    */
  def map(mappings: MapSource, options: (MapOptions with (Anon_False | Anon_Stream)) | MapOptions): LocalMapStream[NullFile] = js.native
  def src(globs: String): typings.adone.adoneNs.fastNs.INs.LocalStream[BufferFile] = js.native
  /**
    * @param globs Source file/files
    */
  def src(globs: String, options: (SrcOptions with (Anon_False | Anon_Stream)) | SrcOptions): typings.adone.adoneNs.fastNs.INs.LocalStream[NullFile] = js.native
  def src(globs: js.Array[String]): typings.adone.adoneNs.fastNs.INs.LocalStream[BufferFile] = js.native
  def src(globs: js.Array[String], options: (SrcOptions with (Anon_False | Anon_Stream)) | SrcOptions): typings.adone.adoneNs.fastNs.INs.LocalStream[NullFile] = js.native
  def watch(globs: String): typings.adone.adoneNs.fastNs.INs.LocalStream[BufferFile] = js.native
  /**
    * @param globs Source file/files
    */
  def watch(globs: String, options: (WatchOptions with (Anon_False | Anon_Stream)) | WatchOptions): typings.adone.adoneNs.fastNs.INs.LocalStream[NullFile] = js.native
  def watch(globs: js.Array[String]): typings.adone.adoneNs.fastNs.INs.LocalStream[BufferFile] = js.native
  def watch(globs: js.Array[String], options: (WatchOptions with (Anon_False | Anon_Stream)) | WatchOptions): typings.adone.adoneNs.fastNs.INs.LocalStream[NullFile] = js.native
  def watchMap(mappings: MapSource): LocalMapStream[BufferFile] = js.native
  def watchMap(mappings: MapSource, options: (WatchMapOptions with (Anon_False | Anon_Stream)) | WatchMapOptions): LocalMapStream[NullFile] = js.native
}

