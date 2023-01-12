package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncResponseDetails extends StObject {
  
  /**
    * Error details for an asynchronous request.
    */
  var ErrorDetails: js.UndefOr[AsyncErrorDetails] = js.undefined
  
  /**
    * The details for the Multi-Region Access Point.
    */
  var MultiRegionAccessPointDetails: js.UndefOr[MultiRegionAccessPointsAsyncResponse] = js.undefined
}
object AsyncResponseDetails {
  
  inline def apply(): AsyncResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(value: AsyncErrorDetails): Self = StObject.set(x, "ErrorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "ErrorDetails", js.undefined)
    
    inline def setMultiRegionAccessPointDetails(value: MultiRegionAccessPointsAsyncResponse): Self = StObject.set(x, "MultiRegionAccessPointDetails", value.asInstanceOf[js.Any])
    
    inline def setMultiRegionAccessPointDetailsUndefined: Self = StObject.set(x, "MultiRegionAccessPointDetails", js.undefined)
  }
}
