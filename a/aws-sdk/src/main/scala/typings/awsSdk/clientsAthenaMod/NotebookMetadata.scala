package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookMetadata extends StObject {
  
  /**
    * The time when the notebook was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the notebook was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the notebook.
    */
  var Name: js.UndefOr[NotebookName] = js.undefined
  
  /**
    * The notebook ID.
    */
  var NotebookId: js.UndefOr[typings.awsSdk.clientsAthenaMod.NotebookId] = js.undefined
  
  /**
    * The type of notebook. Currently, the only valid type is IPYNB.
    */
  var Type: js.UndefOr[NotebookType] = js.undefined
  
  /**
    * The name of the Spark enabled workgroup to which the notebook belongs.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object NotebookMetadata {
  
  inline def apply(): NotebookMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: NotebookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotebookId(value: NotebookId): Self = StObject.set(x, "NotebookId", value.asInstanceOf[js.Any])
    
    inline def setNotebookIdUndefined: Self = StObject.set(x, "NotebookId", js.undefined)
    
    inline def setType(value: NotebookType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
