package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a list of trail and event data store ARNs whose tags will be listed. The list has a limit of 20 ARNs.
    */
  var ResourceIdList: typings.awsSdk.clientsCloudtrailMod.ResourceIdList
}
object ListTagsRequest {
  
  inline def apply(ResourceIdList: ResourceIdList): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceIdList = ResourceIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  extension [Self <: ListTagsRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceIdList(value: ResourceIdList): Self = StObject.set(x, "ResourceIdList", value.asInstanceOf[js.Any])
    
    inline def setResourceIdListVarargs(value: String*): Self = StObject.set(x, "ResourceIdList", js.Array(value*))
  }
}
