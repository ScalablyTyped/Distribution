package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactFlowSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the contact flow.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The type of contact flow.
    */
  var ContactFlowType: js.UndefOr[typings.awsDashSdk.clientsConnectMod.ContactFlowType] = js.native
  /**
    * The identifier of the contact flow.
    */
  var Id: js.UndefOr[ContactFlowId] = js.native
  /**
    * The name of the contact flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.native
}

object ContactFlowSummary {
  @scala.inline
  def apply(
    Arn: ARN = null,
    ContactFlowType: ContactFlowType = null,
    Id: ContactFlowId = null,
    Name: ContactFlowName = null
  ): ContactFlowSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ContactFlowType != null) __obj.updateDynamic("ContactFlowType")(ContactFlowType.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactFlowSummary]
  }
}

