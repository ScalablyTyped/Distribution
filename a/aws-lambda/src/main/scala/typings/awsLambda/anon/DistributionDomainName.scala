package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`origin-request`
import typings.awsLambda.awsLambdaStrings.`origin-response`
import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionDomainName extends js.Object {
  
  val distributionDomainName: String = js.native
  
  val distributionId: String = js.native
  
  val eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response` = js.native
  
  val requestId: String = js.native
}
object DistributionDomainName {
  
  @scala.inline
  def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`,
    requestId: String
  ): DistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDomainName]
  }
  
  @scala.inline
  implicit class DistributionDomainNameOps[Self <: DistributionDomainName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistributionDomainName(value: String): Self = this.set("distributionDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionId(value: String): Self = this.set("distributionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}
