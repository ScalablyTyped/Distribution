package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LFTagPolicyDetails extends StObject {
  
  /**
    * The identifier for the AWS Glue Data Catalog.
    */
  var CatalogId: AwsAccountId
  
  /**
    * Details for the Lake Formation Resources included in the LF-tag policy.
    */
  var ResourceDetails: LFResourceDetails
  
  /**
    * The resource type for which the LF-tag policy applies.
    */
  var ResourceType: LFResourceType
}
object LFTagPolicyDetails {
  
  inline def apply(CatalogId: AwsAccountId, ResourceDetails: LFResourceDetails, ResourceType: LFResourceType): LFTagPolicyDetails = {
    val __obj = js.Dynamic.literal(CatalogId = CatalogId.asInstanceOf[js.Any], ResourceDetails = ResourceDetails.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LFTagPolicyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LFTagPolicyDetails] (val x: Self) extends AnyVal {
    
    inline def setCatalogId(value: AwsAccountId): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setResourceDetails(value: LFResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: LFResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
