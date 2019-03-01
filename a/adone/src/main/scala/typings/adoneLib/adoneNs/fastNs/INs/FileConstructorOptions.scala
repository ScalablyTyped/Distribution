package typings
package adoneLib.adoneNs.fastNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileConstructorOptions extends js.Object {
  /**
    * Used for relative pathing. Typically where a glob starts. Default: options.cwd
    */
  var base: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File contents
    */
  var contents: js.UndefOr[scala.Null | nodeLib.Buffer | nodeLib.streamMod.Readable] = js.undefined
  /**
    * The current workring directory of the file. Default: process.cwd()
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Stores the path history
    */
  var history: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Full path to the file
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The result of a fs.Stat call
    */
  var stat: js.UndefOr[adoneLib.adoneNs.fsNs.INs.Stats] = js.undefined
  var symlink: js.UndefOr[java.lang.String] = js.undefined
}

object FileConstructorOptions {
  @scala.inline
  def apply(
    base: java.lang.String = null,
    contents: nodeLib.Buffer | nodeLib.streamMod.Readable = null,
    cwd: java.lang.String = null,
    history: js.Array[java.lang.String] = null,
    path: java.lang.String = null,
    stat: adoneLib.adoneNs.fsNs.INs.Stats = null,
    symlink: java.lang.String = null
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

