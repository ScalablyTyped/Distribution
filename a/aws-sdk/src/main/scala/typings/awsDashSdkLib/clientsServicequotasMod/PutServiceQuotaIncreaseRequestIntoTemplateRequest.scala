package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutServiceQuotaIncreaseRequestIntoTemplateRequest extends js.Object {
  /**
    * Specifies the AWS Region for the quota. 
    */
  var AwsRegion: awsDashSdkLib.clientsServicequotasMod.AwsRegion
  /**
    * Specifies the new, increased value for the quota. 
    */
  var DesiredValue: QuotaValue
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: awsDashSdkLib.clientsServicequotasMod.QuotaCode
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: awsDashSdkLib.clientsServicequotasMod.ServiceCode
}

object PutServiceQuotaIncreaseRequestIntoTemplateRequest {
  @scala.inline
  def apply(AwsRegion: AwsRegion, DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): PutServiceQuotaIncreaseRequestIntoTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsRegion = AwsRegion, DesiredValue = DesiredValue, QuotaCode = QuotaCode, ServiceCode = ServiceCode)
  
    __obj.asInstanceOf[PutServiceQuotaIncreaseRequestIntoTemplateRequest]
  }
}

