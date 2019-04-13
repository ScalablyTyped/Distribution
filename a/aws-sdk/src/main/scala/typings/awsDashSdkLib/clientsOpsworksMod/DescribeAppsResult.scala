package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAppsResult extends js.Object {
  /**
    * An array of App objects that describe the specified apps. 
    */
  var Apps: js.UndefOr[Apps] = js.undefined
}

object DescribeAppsResult {
  @scala.inline
  def apply(Apps: Apps = null): DescribeAppsResult = {
    val __obj = js.Dynamic.literal()
    if (Apps != null) __obj.updateDynamic("Apps")(Apps)
    __obj.asInstanceOf[DescribeAppsResult]
  }
}

