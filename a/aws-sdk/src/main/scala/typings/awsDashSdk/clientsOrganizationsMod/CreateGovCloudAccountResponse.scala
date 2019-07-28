package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGovCloudAccountResponse extends js.Object {
  var CreateAccountStatus: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.CreateAccountStatus] = js.undefined
}

object CreateGovCloudAccountResponse {
  @scala.inline
  def apply(CreateAccountStatus: CreateAccountStatus = null): CreateGovCloudAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatus != null) __obj.updateDynamic("CreateAccountStatus")(CreateAccountStatus)
    __obj.asInstanceOf[CreateGovCloudAccountResponse]
  }
}

