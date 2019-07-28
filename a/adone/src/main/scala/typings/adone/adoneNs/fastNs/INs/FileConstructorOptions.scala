package typings.adone.adoneNs.fastNs.INs

import typings.adone.adoneNs.fsNs.INs.Stats
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConstructorOptions extends js.Object {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[String] = js.undefined
  /**
    * File contents
    */
  var contents: js.UndefOr[Null | Buffer | Readable] = js.undefined
  /**
    * The current workring directory of the file. Default: process.cwd()
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Stores the path history
    */
  var history: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Full path to the file
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The result of a fs.Stat call
    */
  var stat: js.UndefOr[Stats] = js.undefined
  var symlink: js.UndefOr[String] = js.undefined
}

object FileConstructorOptions {
  @scala.inline
  def apply(
    base: String = null,
    contents: Buffer | Readable = null,
    cwd: String = null,
    history: js.Array[String] = null,
    path: String = null,
    stat: Stats = null,
    symlink: String = null
  ): FileConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (history != null) __obj.updateDynamic("history")(history)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    if (symlink != null) __obj.updateDynamic("symlink")(symlink)
    __obj.asInstanceOf[FileConstructorOptions]
  }
}

