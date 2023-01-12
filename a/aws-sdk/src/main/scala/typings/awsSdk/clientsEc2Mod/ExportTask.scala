package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTask extends StObject {
  
  /**
    * A description of the resource being exported.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the export task.
    */
  var ExportTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the export task.
    */
  var ExportToS3Task: js.UndefOr[typings.awsSdk.clientsEc2Mod.ExportToS3Task] = js.undefined
  
  /**
    * Information about the instance to export.
    */
  var InstanceExportDetails: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceExportDetails] = js.undefined
  
  /**
    * The state of the export task.
    */
  var State: js.UndefOr[ExportTaskState] = js.undefined
  
  /**
    * The status message related to the export task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The tags for the export task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ExportTask {
  
  inline def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTask] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExportTaskId(value: String): Self = StObject.set(x, "ExportTaskId", value.asInstanceOf[js.Any])
    
    inline def setExportTaskIdUndefined: Self = StObject.set(x, "ExportTaskId", js.undefined)
    
    inline def setExportToS3Task(value: ExportToS3Task): Self = StObject.set(x, "ExportToS3Task", value.asInstanceOf[js.Any])
    
    inline def setExportToS3TaskUndefined: Self = StObject.set(x, "ExportToS3Task", js.undefined)
    
    inline def setInstanceExportDetails(value: InstanceExportDetails): Self = StObject.set(x, "InstanceExportDetails", value.asInstanceOf[js.Any])
    
    inline def setInstanceExportDetailsUndefined: Self = StObject.set(x, "InstanceExportDetails", js.undefined)
    
    inline def setState(value: ExportTaskState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
