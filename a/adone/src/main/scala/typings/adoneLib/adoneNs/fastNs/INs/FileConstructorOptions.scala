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

