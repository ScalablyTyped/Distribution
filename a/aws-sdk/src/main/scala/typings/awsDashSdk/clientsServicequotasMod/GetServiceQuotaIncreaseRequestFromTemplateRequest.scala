package typings.awsDashSdk.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to use.
    */
  var AwsRegion: typings.awsDashSdk.clientsServicequotasMod.AwsRegion
  /**
    * Specifies the quota you want.
    */
  var QuotaCode: typings.awsDashSdk.clientsServicequotasMod.QuotaCode
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: typings.awsDashSdk.clientsServicequotasMod.ServiceCode
}

object GetServiceQuotaIncreaseRequestFromTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): GetServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion, QuotaCode = QuotaCode, ServiceCode = ServiceCode)
  
    __obj.asInstanceOf[GetServiceQuotaIncreaseRequestFromTemplateRequest]
  }
}

