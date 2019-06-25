package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceQuotaIncreaseRequestFromTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota that you want to delete.
    */
  var AwsRegion: awsDashSdkLib.clientsServicequotasMod.AwsRegion
  /**
    * Specifies the code for the quota that you want to delete.
    */
  var QuotaCode: awsDashSdkLib.clientsServicequotasMod.QuotaCode
  /**
    * Specifies the code for the service that you want to delete.
    */
  var ServiceCode: awsDashSdkLib.clientsServicequotasMod.ServiceCode
}

object DeleteServiceQuotaIncreaseRequestFromTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, QuotaCode: QuotaCode, ServiceCode: ServiceCode): DeleteServiceQuotaIncreaseRequestFromTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion, QuotaCode = QuotaCode, ServiceCode = ServiceCode)
  
    __obj.asInstanceOf[DeleteServiceQuotaIncreaseRequestFromTemplateRequest]
  }
}

