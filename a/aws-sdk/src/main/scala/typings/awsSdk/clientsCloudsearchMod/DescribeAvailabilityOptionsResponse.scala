package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityOptionsResponse extends StObject {
  
  /**
    * The availability options configured for the domain. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
}
object DescribeAvailabilityOptionsResponse {
  
  inline def apply(): DescribeAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityOptionsResponse]
  }
  
  extension [Self <: DescribeAvailabilityOptionsResponse](x: Self) {
    
    inline def setAvailabilityOptions(value: AvailabilityOptionsStatus): Self = StObject.set(x, "AvailabilityOptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityOptionsUndefined: Self = StObject.set(x, "AvailabilityOptions", js.undefined)
  }
}
