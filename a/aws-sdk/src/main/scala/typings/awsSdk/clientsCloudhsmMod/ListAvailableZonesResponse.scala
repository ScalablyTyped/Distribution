package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableZonesResponse extends StObject {
  
  /**
    * The list of Availability Zones that have available AWS CloudHSM capacity.
    */
  var AZList: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.AZList] = js.undefined
}
object ListAvailableZonesResponse {
  
  inline def apply(): ListAvailableZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableZonesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAvailableZonesResponse] (val x: Self) extends AnyVal {
    
    inline def setAZList(value: AZList): Self = StObject.set(x, "AZList", value.asInstanceOf[js.Any])
    
    inline def setAZListUndefined: Self = StObject.set(x, "AZList", js.undefined)
    
    inline def setAZListVarargs(value: AZ*): Self = StObject.set(x, "AZList", js.Array(value*))
  }
}
