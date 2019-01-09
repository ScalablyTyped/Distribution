package typings
package adoneLib.adoneNs.fastNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.fast")
@js.native
object fastNsMembers extends js.Object {
  val File: adoneLib.adoneNs.fastNs.INs.FileConstructor = js.native
  val LocalStream: adoneLib.adoneNs.fastNs.INs.LocalStreamConstructor = js.native
  def map(mappings: adoneLib.adoneNs.fastNs.INs.MapSource): adoneLib.adoneNs.fastNs.INs.LocalMapStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  /**
    * The same as fast.src, but source and dest paths are defined in one place
    */
  def map(
    mappings: adoneLib.adoneNs.fastNs.INs.MapSource,
    options: (adoneLib.adoneNs.fastNs.INs.MapOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.MapOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalMapStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
  def src(globs: java.lang.String): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  /**
    * @param globs Source file/files
    */
  def src(
    globs: java.lang.String,
    options: (adoneLib.adoneNs.fastNs.INs.SrcOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.SrcOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
  def src(globs: js.Array[java.lang.String]): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  def src(
    globs: js.Array[java.lang.String],
    options: (adoneLib.adoneNs.fastNs.INs.SrcOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.SrcOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
  def watch(globs: java.lang.String): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  /**
    * @param globs Source file/files
    */
  def watch(
    globs: java.lang.String,
    options: (adoneLib.adoneNs.fastNs.INs.WatchOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.WatchOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
  def watch(globs: js.Array[java.lang.String]): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  def watch(
    globs: js.Array[java.lang.String],
    options: (adoneLib.adoneNs.fastNs.INs.WatchOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.WatchOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
  def watchMap(mappings: adoneLib.adoneNs.fastNs.INs.MapSource): adoneLib.adoneNs.fastNs.INs.LocalMapStream[adoneLib.adoneNs.fastNs.INs.BufferFile] = js.native
  def watchMap(
    mappings: adoneLib.adoneNs.fastNs.INs.MapSource,
    options: (adoneLib.adoneNs.fastNs.INs.WatchMapOptions with (adoneLib.Anon_False | adoneLib.Anon_Stream)) | adoneLib.adoneNs.fastNs.INs.WatchMapOptions
  ): adoneLib.adoneNs.fastNs.INs.LocalMapStream[adoneLib.adoneNs.fastNs.INs.NullFile] = js.native
}

