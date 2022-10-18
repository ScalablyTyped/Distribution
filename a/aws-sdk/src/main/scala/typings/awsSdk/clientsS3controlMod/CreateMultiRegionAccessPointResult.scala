package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiRegionAccessPointResult extends StObject {
  
  /**
    * The request token associated with the request. You can use this token with DescribeMultiRegionAccessPointOperation to determine the status of asynchronous requests.
    */
  var RequestTokenARN: js.UndefOr[AsyncRequestTokenARN] = js.undefined
}
object CreateMultiRegionAccessPointResult {
  
  inline def apply(): CreateMultiRegionAccessPointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiRegionAccessPointResult]
  }
  
  extension [Self <: CreateMultiRegionAccessPointResult](x: Self) {
    
    inline def setRequestTokenARN(value: AsyncRequestTokenARN): Self = StObject.set(x, "RequestTokenARN", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenARNUndefined: Self = StObject.set(x, "RequestTokenARN", js.undefined)
  }
}
