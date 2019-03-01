package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dirs extends js.Object {
  var dirs: js.UndefOr[scala.Boolean] = js.undefined
  var files: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Dirs {
  @scala.inline
  def apply(dirs: js.UndefOr[scala.Boolean] = js.undefined, files: js.UndefOr[scala.Boolean] = js.undefined): Anon_Dirs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dirs)) __obj.updateDynamic("dirs")(dirs)
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Anon_Dirs]
  }
}

