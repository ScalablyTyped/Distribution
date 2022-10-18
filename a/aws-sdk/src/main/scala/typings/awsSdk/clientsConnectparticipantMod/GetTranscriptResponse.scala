package typings.awsSdk.clientsConnectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTranscriptResponse extends StObject {
  
  /**
    * The initial contact ID for the contact. 
    */
  var InitialContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * The pagination token. Use the value returned previously in the next subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.NextToken] = js.undefined
  
  /**
    * The list of messages in the session.
    */
  var Transcript: js.UndefOr[typings.awsSdk.clientsConnectparticipantMod.Transcript] = js.undefined
}
object GetTranscriptResponse {
  
  inline def apply(): GetTranscriptResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTranscriptResponse]
  }
  
  extension [Self <: GetTranscriptResponse](x: Self) {
    
    inline def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInitialContactIdUndefined: Self = StObject.set(x, "InitialContactId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
    
    inline def setTranscriptVarargs(value: Item*): Self = StObject.set(x, "Transcript", js.Array(value*))
  }
}
