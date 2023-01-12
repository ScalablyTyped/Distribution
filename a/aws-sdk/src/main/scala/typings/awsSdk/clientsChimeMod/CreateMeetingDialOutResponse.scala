package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingDialOutResponse extends StObject {
  
  /**
    * Unique ID that tracks API calls.
    */
  var TransactionId: js.UndefOr[GuidString] = js.undefined
}
object CreateMeetingDialOutResponse {
  
  inline def apply(): CreateMeetingDialOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingDialOutResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMeetingDialOutResponse] (val x: Self) extends AnyVal {
    
    inline def setTransactionId(value: GuidString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
