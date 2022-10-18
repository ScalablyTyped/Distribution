package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPolicyVersionsRequest extends StObject {
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM policy for which you want the versions. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var PolicyArn: arnType
}
object ListPolicyVersionsRequest {
  
  inline def apply(PolicyArn: arnType): ListPolicyVersionsRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPolicyVersionsRequest]
  }
  
  extension [Self <: ListPolicyVersionsRequest](x: Self) {
    
    inline def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: maxItemsType): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setPolicyArn(value: arnType): Self = StObject.set(x, "PolicyArn", value.asInstanceOf[js.Any])
  }
}
