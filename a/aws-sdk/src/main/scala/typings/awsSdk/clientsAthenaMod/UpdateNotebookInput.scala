package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotebookInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only once).  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the notebook to update.
    */
  var NotebookId: typings.awsSdk.clientsAthenaMod.NotebookId
  
  /**
    * The updated content for the notebook.
    */
  var Payload: typings.awsSdk.clientsAthenaMod.Payload
  
  /**
    * The active notebook session ID. Required if the notebook has an active session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
  
  /**
    * The notebook content type. Currently, the only valid type is IPYNB.
    */
  var Type: NotebookType
}
object UpdateNotebookInput {
  
  inline def apply(NotebookId: NotebookId, Payload: Payload, Type: NotebookType): UpdateNotebookInput = {
    val __obj = js.Dynamic.literal(NotebookId = NotebookId.asInstanceOf[js.Any], Payload = Payload.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNotebookInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setType(value: NotebookType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
