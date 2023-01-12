package typings.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAvailabilityOptionsResponse extends StObject {
  
  /**
    * The newly-configured availability options. Indicates whether Multi-AZ is enabled for the domain. 
    */
  var AvailabilityOptions: js.UndefOr[AvailabilityOptionsStatus] = js.undefined
}
object UpdateAvailabilityOptionsResponse {
  
  inline def apply(): UpdateAvailabilityOptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAvailabilityOptionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAvailabilityOptionsResponse] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityOptions(value: AvailabilityOptionsStatus): Self = StObject.set(x, "AvailabilityOptions", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityOptionsUndefined: Self = StObject.set(x, "AvailabilityOptions", js.undefined)
  }
}
