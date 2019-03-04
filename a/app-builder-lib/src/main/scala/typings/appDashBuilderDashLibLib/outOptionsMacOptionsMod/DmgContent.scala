package typings
package appDashBuilderDashLibLib.outOptionsMacOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DmgContent extends js.Object {
  /**
    * The name of the file within the DMG. Defaults to basename of `path`.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path of the file within the DMG.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.link | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.file | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.dir
  ] = js.undefined
  var x: scala.Double
  var y: scala.Double
}

object DmgContent {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    name: java.lang.String = null,
    path: java.lang.String = null,
    `type`: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.link | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.file | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.dir = null
  ): DmgContent = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DmgContent]
  }
}

