package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportNotebookInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to import the notebook is idempotent (executes only once).  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the notebook to import.
    */
  var Name: NotebookName
  
  /**
    * The notebook content to be imported.
    */
  var Payload: typings.awsSdk.clientsAthenaMod.Payload
  
  /**
    * The notebook content type. Currently, the only valid type is IPYNB.
    */
  var Type: NotebookType
  
  /**
    * The name of the Spark enabled workgroup to import the notebook to.
    */
  var WorkGroup: WorkGroupName
}
object ImportNotebookInput {
  
  inline def apply(Name: NotebookName, Payload: Payload, Type: NotebookType, WorkGroup: WorkGroupName): ImportNotebookInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Payload = Payload.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportNotebookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportNotebookInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: NotebookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Payload): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: NotebookType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
