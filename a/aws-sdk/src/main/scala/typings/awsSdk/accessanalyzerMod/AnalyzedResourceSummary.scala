package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzedResourceSummary extends js.Object {
  
  /**
    * The ARN of the analyzed resource.
    */
  var resourceArn: ResourceArn = js.native
  
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  
  /**
    * The type of resource that was analyzed.
    */
  var resourceType: ResourceType = js.native
}
object AnalyzedResourceSummary {
  
  @scala.inline
  def apply(resourceArn: ResourceArn, resourceOwnerAccount: String, resourceType: ResourceType): AnalyzedResourceSummary = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResourceSummary]
  }
  
  @scala.inline
  implicit class AnalyzedResourceSummaryOps[Self <: AnalyzedResourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = this.set("resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
}
