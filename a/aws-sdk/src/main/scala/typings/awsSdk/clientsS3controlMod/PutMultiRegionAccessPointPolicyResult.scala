package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMultiRegionAccessPointPolicyResult extends StObject {
  
  /**
    * The request token associated with the request. You can use this token with DescribeMultiRegionAccessPointOperation to determine the status of asynchronous requests.
    */
  var RequestTokenARN: js.UndefOr[AsyncRequestTokenARN] = js.undefined
}
object PutMultiRegionAccessPointPolicyResult {
  
  inline def apply(): PutMultiRegionAccessPointPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutMultiRegionAccessPointPolicyResult]
  }
  
  extension [Self <: PutMultiRegionAccessPointPolicyResult](x: Self) {
    
    inline def setRequestTokenARN(value: AsyncRequestTokenARN): Self = StObject.set(x, "RequestTokenARN", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenARNUndefined: Self = StObject.set(x, "RequestTokenARN", js.undefined)
  }
}
