package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoursOfOperationSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the hours of operation.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the hours of operation.
    */
  var Id: js.UndefOr[HoursOfOperationId] = js.native
  /**
    * The name of the hours of operation.
    */
  var Name: js.UndefOr[HoursOfOperationName] = js.native
}

object HoursOfOperationSummary {
  @scala.inline
  def apply(Arn: ARN = null, Id: HoursOfOperationId = null, Name: HoursOfOperationName = null): HoursOfOperationSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoursOfOperationSummary]
  }
}

