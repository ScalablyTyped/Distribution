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
  /**
    * The device-independent pixel offset from the left of the window to the **center** of the icon.
    */
  var x: Double
  /**
    * The device-independent pixel offset from the top of the window to the **center** of the icon.
    */
  var y: Double
}

object DmgContent {
  @scala.inline
  def apply(x: Double, y: Double, name: String = null, path: String = null, `type`: link | file | dir = null): DmgContent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgContent]
  }
}

