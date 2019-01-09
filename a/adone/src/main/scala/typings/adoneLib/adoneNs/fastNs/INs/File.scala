package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * Gets and sets base directory. Used for relative pathing (typically where a glob starts).
    */
  var base: java.lang.String = js.native
  /**
    * Gets and sets the basename of `file.path`.
    */
  var basename: java.lang.String = js.native
  /**
    * Gets and sets the contents of the file
    */
  var contents: scala.Null | nodeLib.Buffer | nodeLib.streamMod.Readable = js.native
  /**
    * Gets and sets current working directory. Will always be normalized and have trailing separators removed.
    */
  var cwd: java.lang.String = js.native
  /**
    * Gets and sets the dirname of `file.path`. Will always be normalized and have trailing
    * separators removed.
    */
  var dirname: java.lang.String = js.native
  /**
    * Gets and sets extname of `file.path`.
    */
  var extname: java.lang.String = js.native
  /**
    * Array of `file.path` values the file has had, from `file.history[0]` (original)
    * through `file.history[file.history.length - 1]` (current). `file.history` and its elements
    * should normally be treated as read-only and only altered indirectly by setting `file.path`.
    */
  val history: js.Array[java.lang.String] = js.native
  /**
    * Gets and sets the absolute pathname string or `undefined`. Setting to a different value
    * appends the new path to `file.history`. If set to the same value as the current path, it
    * is ignored. All new values are normalized and have trailing separators removed.
    */
  var path: java.lang.String = js.native
  /**
    * Gets the result of `path.relative(file.base, file.path)`. Or sets a new relative path for file.base
    */
  var relative: java.lang.String = js.native
  var stat: adoneLib.adoneNs.fsNs.INs.Stats = js.native
  /**
    * Gets and sets stem (filename without suffix) of `file.path`.
    */
  var stem: java.lang.String = js.native
  /**
    * Gets and sets the path where the file points to if it's a symbolic link. Will always
    * be normalized and have trailing separators removed.
    */
  var symlink: java.lang.String = js.native
  /**
    * Returns a new File object with all attributes cloned.
    */
  def clone(options: FileCloneOptions with adoneLib.Anon_ContentsTrue): this.type = js.native
  @JSName("clone")
  def clone_File(options: FileCloneOptions): File = js.native
  def isBuffer(): scala.Boolean = js.native
  def isDirectory(): scala.Boolean = js.native
  def isNull(): scala.Boolean = js.native
  def isStream(): scala.Boolean = js.native
  def isSymbolic(): scala.Boolean = js.native
}

