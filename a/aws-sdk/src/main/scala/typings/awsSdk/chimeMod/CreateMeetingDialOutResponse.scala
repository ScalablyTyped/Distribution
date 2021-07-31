package typings.awsSdk.chimeMod

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
  
  @scala.inline
  def apply(): CreateMeetingDialOutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingDialOutResponse]
  }
  
  @scala.inline
  implicit class CreateMeetingDialOutResponseMutableBuilder[Self <: CreateMeetingDialOutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransactionId(value: GuidString): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "TransactionId", js.undefined)
  }
}
