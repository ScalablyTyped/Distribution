package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRetirableGrantsRequest extends StObject {
  
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, KMS does not return more than the specified number of items, but it might return fewer. This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a value, it defaults to 50.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * The retiring principal for which to list grants. Enter a principal in your Amazon Web Services account. To specify the retiring principal, use the Amazon Resource Name (ARN) of an Amazon Web Services principal. Valid principals include Amazon Web Services accounts, IAM users, IAM roles, federated users, and assumed role users. For help with the ARN syntax for a principal, see IAM ARNs in the  Identity and Access Management User Guide .
    */
  var RetiringPrincipal: PrincipalIdType
}
object ListRetirableGrantsRequest {
  
  inline def apply(RetiringPrincipal: PrincipalIdType): ListRetirableGrantsRequest = {
    val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRetirableGrantsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRetirableGrantsRequest] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setRetiringPrincipal(value: PrincipalIdType): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
  }
}
