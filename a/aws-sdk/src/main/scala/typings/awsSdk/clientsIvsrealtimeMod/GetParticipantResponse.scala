package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParticipantResponse extends StObject {
  
  /**
    * The participant that is returned.
    */
  var participant: js.UndefOr[Participant] = js.undefined
}
object GetParticipantResponse {
  
  inline def apply(): GetParticipantResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParticipantResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParticipantResponse] (val x: Self) extends AnyVal {
    
    inline def setParticipant(value: Participant): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    inline def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
  }
}
