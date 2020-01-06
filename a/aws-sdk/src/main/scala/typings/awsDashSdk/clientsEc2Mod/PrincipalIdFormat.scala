package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalIdFormat extends js.Object {
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.native
}

object PrincipalIdFormat {
  @scala.inline
  def apply(Arn: String = null, Statuses: IdFormatList = null): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrincipalIdFormat]
  }
}

