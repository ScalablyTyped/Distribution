package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLogEventsResponse extends StObject {
  
  /**
    * The next sequence token.  This field has been deprecated. The sequence token is now ignored in PutLogEvents actions. PutLogEvents actions are always accepted even if the sequence token is not valid. You can use parallel PutLogEvents actions on the same log stream and you do not need to wait for the response of a previous PutLogEvents action to obtain the nextSequenceToken value. 
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined
  
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
}
object PutLogEventsResponse {
  
  inline def apply(): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutLogEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutLogEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextSequenceToken(value: SequenceToken): Self = StObject.set(x, "nextSequenceToken", value.asInstanceOf[js.Any])
    
    inline def setNextSequenceTokenUndefined: Self = StObject.set(x, "nextSequenceToken", js.undefined)
    
    inline def setRejectedLogEventsInfo(value: RejectedLogEventsInfo): Self = StObject.set(x, "rejectedLogEventsInfo", value.asInstanceOf[js.Any])
    
    inline def setRejectedLogEventsInfoUndefined: Self = StObject.set(x, "rejectedLogEventsInfo", js.undefined)
  }
}
