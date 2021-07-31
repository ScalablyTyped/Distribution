package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzedResourceSummary extends StObject {
  
  /**
    * The ARN of the analyzed resource.
    */
  var resourceArn: ResourceArn
  
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String
  
  /**
    * The type of resource that was analyzed.
    */
  var resourceType: ResourceType
}
object AnalyzedResourceSummary {
  
  @scala.inline
  def apply(resourceArn: ResourceArn, resourceOwnerAccount: String, resourceType: ResourceType): AnalyzedResourceSummary = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResourceSummary]
  }
  
  @scala.inline
  implicit class AnalyzedResourceSummaryMutableBuilder[Self <: AnalyzedResourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
