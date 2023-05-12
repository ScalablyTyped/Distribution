package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotebookInput extends StObject {
  
  /**
    * A unique case-sensitive string used to ensure the request to create the notebook is idempotent (executes only once).  This token is listed as not required because Amazon Web Services SDKs (for example the Amazon Web Services SDK for Java) auto-generate the token for you. If you are not using the Amazon Web Services SDK or the Amazon Web Services CLI, you must provide this token or the action will fail. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAthenaMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the ipynb file to be created in the Spark workgroup, without the .ipynb extension.
    */
  var Name: NotebookName
  
  /**
    * The name of the Spark enabled workgroup in which the notebook will be created.
    */
  var WorkGroup: WorkGroupName
}
object CreateNotebookInput {
  
  inline def apply(Name: NotebookName, WorkGroup: WorkGroupName): CreateNotebookInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotebookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotebookInput] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: NotebookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
