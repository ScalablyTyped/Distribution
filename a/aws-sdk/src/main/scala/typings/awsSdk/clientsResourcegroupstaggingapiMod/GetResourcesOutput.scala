package typings.awsSdk.clientsResourcegroupstaggingapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcesOutput extends StObject {
  
  /**
    * A string that indicates that there is more data available than this response contains. To receive the next part of the response, specify this response value as the PaginationToken value in the request for the next page.
    */
  var PaginationToken: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.undefined
  
  /**
    * A list of resource ARNs and the tags (keys and values) associated with each.
    */
  var ResourceTagMappingList: js.UndefOr[typings.awsSdk.clientsResourcegroupstaggingapiMod.ResourceTagMappingList] = js.undefined
}
object GetResourcesOutput {
  
  inline def apply(): GetResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcesOutput]
  }
  
  extension [Self <: GetResourcesOutput](x: Self) {
    
    inline def setPaginationToken(value: PaginationToken): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setResourceTagMappingList(value: ResourceTagMappingList): Self = StObject.set(x, "ResourceTagMappingList", value.asInstanceOf[js.Any])
    
    inline def setResourceTagMappingListUndefined: Self = StObject.set(x, "ResourceTagMappingList", js.undefined)
    
    inline def setResourceTagMappingListVarargs(value: ResourceTagMapping*): Self = StObject.set(x, "ResourceTagMappingList", js.Array(value*))
  }
}
