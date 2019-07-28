package typings.appDashBuilderDashLib.outOptionsMacOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.dir
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.file
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DmgContent extends js.Object {
  /**
    * The name of the file within the DMG. Defaults to basename of `path`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The path of the file within the DMG.
    */
  var path: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[link | file | dir] = js.undefined
  var x: Double
  var y: Double
}

object DmgContent {
  @scala.inline
  def apply(x: Double, y: Double, name: String = null, path: String = null, `type`: link | file | dir = null): DmgContent = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgContent]
  }
}

