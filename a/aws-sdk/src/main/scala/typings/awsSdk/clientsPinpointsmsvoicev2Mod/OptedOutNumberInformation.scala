package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptedOutNumberInformation extends StObject {
  
  /**
    * This is set to true if it was the end recipient that opted out.
    */
  var EndUserOptedOut: PrimitiveBoolean
  
  /**
    * The phone number that is opted out.
    */
  var OptedOutNumber: PhoneNumber
  
  /**
    * The time that the op tout occurred, in UNIX epoch time format.
    */
  var OptedOutTimestamp: js.Date
}
object OptedOutNumberInformation {
  
  inline def apply(EndUserOptedOut: PrimitiveBoolean, OptedOutNumber: PhoneNumber, OptedOutTimestamp: js.Date): OptedOutNumberInformation = {
    val __obj = js.Dynamic.literal(EndUserOptedOut = EndUserOptedOut.asInstanceOf[js.Any], OptedOutNumber = OptedOutNumber.asInstanceOf[js.Any], OptedOutTimestamp = OptedOutTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptedOutNumberInformation]
  }
  
  extension [Self <: OptedOutNumberInformation](x: Self) {
    
    inline def setEndUserOptedOut(value: PrimitiveBoolean): Self = StObject.set(x, "EndUserOptedOut", value.asInstanceOf[js.Any])
    
    inline def setOptedOutNumber(value: PhoneNumber): Self = StObject.set(x, "OptedOutNumber", value.asInstanceOf[js.Any])
    
    inline def setOptedOutTimestamp(value: js.Date): Self = StObject.set(x, "OptedOutTimestamp", value.asInstanceOf[js.Any])
  }
}
