package typings.adone.adoneNs.fastNs.INs

import typings.adone.Anon_ContentsTrue
import typings.adone.adoneNs.fsNs.INs.Stats
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  /**
    * Gets and sets base directory. Used for relative pathing (typically where a glob starts).
    */
  var base: String = js.native
  /**
    * Gets and sets the basename of `file.path`.
    */
  var basename: String = js.native
  /**
    * Gets and sets the contents of the file
    */
  var contents: Null | Buffer | Readable = js.native
  /**
    * Gets and sets current working directory. Will always be normalized and have trailing separators removed.
    */
  var cwd: String = js.native
  /**
    * Gets and sets the dirname of `file.path`. Will always be normalized and have trailing
    * separators removed.
    */
  var dirname: String = js.native
  /**
    * Gets and sets extname of `file.path`.
    */
  var extname: String = js.native
  /**
    * Array of `file.path` values the file has had, from `file.history[0]` (original)
    * through `file.history[file.history.length - 1]` (current). `file.history` and its elements
    * should normally be treated as read-only and only altered indirectly by setting `file.path`.
    */
  val history: js.Array[String] = js.native
  /**
    * Gets and sets the absolute pathname string or `undefined`. Setting to a different value
    * appends the new path to `file.history`. If set to the same value as the current path, it
    * is ignored. All new values are normalized and have trailing separators removed.
    */
  var path: String = js.native
  /**
    * Gets the result of `path.relative(file.base, file.path)`. Or sets a new relative path for file.base
    */
  var relative: String = js.native
  var stat: Stats = js.native
  /**
    * Gets and sets stem (filename without suffix) of `file.path`.
    */
  var stem: String = js.native
  /**
    * Gets and sets the path where the file points to if it's a symbolic link. Will always
    * be normalized and have trailing separators removed.
    */
  var symlink: String = js.native
  def clone(options: FileCloneOptions): typings.adone.adoneNs.fastNs.INs.File = js.native
  /**
    * Returns a new File object with all attributes cloned.
    */
  @JSName("clone")
  def clone_This(options: FileCloneOptions with Anon_ContentsTrue): this.type = js.native
  def isBuffer(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isNull(): Boolean = js.native
  def isStream(): Boolean = js.native
  def isSymbolic(): Boolean = js.native
}

