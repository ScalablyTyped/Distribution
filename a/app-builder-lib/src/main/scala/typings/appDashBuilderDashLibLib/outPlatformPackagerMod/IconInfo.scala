package typings
package appDashBuilderDashLibLib.outPlatformPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconInfo extends js.Object {
  var file: java.lang.String
  var size: scala.Double
}

object IconInfo {
  @scala.inline
  def apply(file: java.lang.String, size: scala.Double): IconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IconInfo]
  }
}

