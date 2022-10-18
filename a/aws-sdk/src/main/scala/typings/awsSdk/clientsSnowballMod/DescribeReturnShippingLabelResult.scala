package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReturnShippingLabelResult extends StObject {
  
  /**
    * The expiration date of the current return shipping label.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The pre-signed Amazon S3 URI used to download the return shipping label.
    */
  var ReturnShippingLabelURI: js.UndefOr[String] = js.undefined
  
  /**
    * The status information of the task on a Snow device that is being returned to Amazon Web Services.
    */
  var Status: js.UndefOr[ShippingLabelStatus] = js.undefined
}
object DescribeReturnShippingLabelResult {
  
  inline def apply(): DescribeReturnShippingLabelResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReturnShippingLabelResult]
  }
  
  extension [Self <: DescribeReturnShippingLabelResult](x: Self) {
    
    inline def setExpirationDate(value: js.Date): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "ExpirationDate", js.undefined)
    
    inline def setReturnShippingLabelURI(value: String): Self = StObject.set(x, "ReturnShippingLabelURI", value.asInstanceOf[js.Any])
    
    inline def setReturnShippingLabelURIUndefined: Self = StObject.set(x, "ReturnShippingLabelURI", js.undefined)
    
    inline def setStatus(value: ShippingLabelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
