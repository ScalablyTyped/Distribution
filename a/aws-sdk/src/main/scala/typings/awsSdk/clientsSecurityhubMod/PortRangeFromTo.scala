package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRangeFromTo extends StObject {
  
  /**
    * The first port in the port range.
    */
  var From: js.UndefOr[Integer] = js.undefined
  
  /**
    * The last port in the port range.
    */
  var To: js.UndefOr[Integer] = js.undefined
}
object PortRangeFromTo {
  
  inline def apply(): PortRangeFromTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRangeFromTo]
  }
  
  extension [Self <: PortRangeFromTo](x: Self) {
    
    inline def setFrom(value: Integer): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setTo(value: Integer): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
