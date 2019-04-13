package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrincipalIdFormat extends js.Object {
  /**
    * PrincipalIdFormatARN description
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * PrincipalIdFormatStatuses description
    */
  var Statuses: js.UndefOr[IdFormatList] = js.undefined
}

object PrincipalIdFormat {
  @scala.inline
  def apply(Arn: String = null, Statuses: IdFormatList = null): PrincipalIdFormat = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Statuses != null) __obj.updateDynamic("Statuses")(Statuses)
    __obj.asInstanceOf[PrincipalIdFormat]
  }
}

