package typings.appDashBuilderDashLib.outUtilYarnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DesktopFrameworkInfo extends js.Object {
  var useCustomDist: Boolean
  var version: String
}

object DesktopFrameworkInfo {
  @scala.inline
  def apply(useCustomDist: Boolean, version: String): DesktopFrameworkInfo = {
    val __obj = js.Dynamic.literal(useCustomDist = useCustomDist.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DesktopFrameworkInfo]
  }
}

