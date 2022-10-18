package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceTagsResponse extends StObject {
  
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request. Do not assume or infer any information from this value.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * A list of tags. Each tag consists of a tag key and a tag value.  Tagging or untagging a KMS key can allow or deny permission to the KMS key. For details, see ABAC in KMS in the Key Management Service Developer Guide. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}
object ListResourceTagsResponse {
  
  inline def apply(): ListResourceTagsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTagsResponse]
  }
  
  extension [Self <: ListResourceTagsResponse](x: Self) {
    
    inline def setNextMarker(value: MarkerType): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTruncated(value: BooleanType): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
