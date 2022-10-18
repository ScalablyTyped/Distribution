package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSnapshotTask extends StObject {
  
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * Describes an import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsSdk.clientsEc2Mod.SnapshotTaskDetail] = js.undefined
  
  /**
    * The tags for the import snapshot task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportSnapshotTask {
  
  inline def apply(): ImportSnapshotTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotTask]
  }
  
  extension [Self <: ImportSnapshotTask](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    inline def setSnapshotTaskDetail(value: SnapshotTaskDetail): Self = StObject.set(x, "SnapshotTaskDetail", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTaskDetailUndefined: Self = StObject.set(x, "SnapshotTaskDetail", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
