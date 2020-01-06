package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssociationForServiceQuotaTemplateResponse extends js.Object {
  /**
    * Specifies whether the template is ASSOCIATED or DISASSOCIATED. If the template is ASSOCIATED, then it requests service quota increases for all new accounts created in your organization. 
    */
  var ServiceQuotaTemplateAssociationStatus: js.UndefOr[typings.awsDashSdk.clientsServicequotasMod.ServiceQuotaTemplateAssociationStatus] = js.native
}

object GetAssociationForServiceQuotaTemplateResponse {
  @scala.inline
  def apply(ServiceQuotaTemplateAssociationStatus: ServiceQuotaTemplateAssociationStatus = null): GetAssociationForServiceQuotaTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServiceQuotaTemplateAssociationStatus != null) __obj.updateDynamic("ServiceQuotaTemplateAssociationStatus")(ServiceQuotaTemplateAssociationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssociationForServiceQuotaTemplateResponse]
  }
}

