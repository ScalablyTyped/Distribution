package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardSourceEntity extends js.Object {
  /**
    * Source template.
    */
  var SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.native
}

object DashboardSourceEntity {
  @scala.inline
  def apply(SourceTemplate: DashboardSourceTemplate = null): DashboardSourceEntity = {
    val __obj = js.Dynamic.literal()
    if (SourceTemplate != null) __obj.updateDynamic("SourceTemplate")(SourceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSourceEntity]
  }
}

