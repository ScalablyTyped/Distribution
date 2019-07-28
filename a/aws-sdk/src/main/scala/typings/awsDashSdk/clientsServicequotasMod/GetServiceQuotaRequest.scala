package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaRequest extends js.Object {
  /**
    * Identifies the service quota you want to select.
    */
  var QuotaCode: typings.awsDashSdk.clientsServicequotasMod.QuotaCode
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsDashSdk.clientsServicequotasMod.ServiceCode
}

object GetServiceQuotaRequest {
  @scala.inline
  def apply(QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaRequest = {
    val __obj = js.Dynamic.literal(QuotaCode = QuotaCode, ServiceCode = ServiceCode)
  
    __obj.asInstanceOf[GetServiceQuotaRequest]
  }
}

