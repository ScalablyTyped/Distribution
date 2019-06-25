package typings
package awsDashSdkLib.clientsServicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestServiceQuotaIncreaseRequest extends js.Object {
  /**
    * Specifies the value submitted in the service quota increase request. 
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

object RequestServiceQuotaIncreaseRequest {
  @scala.inline
  def apply(DesiredValue: QuotaValue, QuotaCode: QuotaCode, ServiceCode: ServiceCode): RequestServiceQuotaIncreaseRequest = {
    val __obj = js.Dynamic.literal(DesiredValue = DesiredValue, QuotaCode = QuotaCode, ServiceCode = ServiceCode)
  
    __obj.asInstanceOf[RequestServiceQuotaIncreaseRequest]
  }
}

