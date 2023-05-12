package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNotebookMetadataInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only once).  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientRequestToken] = js.undefined
  
  /**
    * The name to update the notebook to.
    */
  var Name: NotebookName
  
  /**
    * The ID of the notebook to update the metadata for.
    */
  var NotebookId: typings.awsSdk.clientsAthenaMod.NotebookId
}
object UpdateNotebookMetadataInput {
  
  inline def apply(Name: NotebookName, NotebookId: NotebookId): UpdateNotebookMetadataInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], NotebookId = NotebookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotebookMetadataInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNotebookMetadataInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: NotebookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
  }
}
