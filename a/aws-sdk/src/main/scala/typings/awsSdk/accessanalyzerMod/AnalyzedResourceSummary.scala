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
    * The Amazon Web Services account ID that owns the resource.
    */
  var resourceOwnerAccount: String
  
  /**
    * The type of resource that was analyzed.
    */
  var resourceType: ResourceType
}
object AnalyzedResourceSummary {
  
  inline def apply(resourceArn: ResourceArn, resourceOwnerAccount: String, resourceType: ResourceType): AnalyzedResourceSummary = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResourceSummary]
  }
  
  extension [Self <: AnalyzedResourceSummary](x: Self) {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerAccount(value: String): Self = StObject.set(x, "resourceOwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
