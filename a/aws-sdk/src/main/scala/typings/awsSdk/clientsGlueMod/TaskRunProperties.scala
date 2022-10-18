package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRunProperties extends StObject {
  
  /**
    * The configuration properties for an exporting labels task run.
    */
  var ExportLabelsTaskRunProperties: js.UndefOr[typings.awsSdk.clientsGlueMod.ExportLabelsTaskRunProperties] = js.undefined
  
  /**
    * The configuration properties for a find matches task run.
    */
  var FindMatchesTaskRunProperties: js.UndefOr[typings.awsSdk.clientsGlueMod.FindMatchesTaskRunProperties] = js.undefined
  
  /**
    * The configuration properties for an importing labels task run.
    */
  var ImportLabelsTaskRunProperties: js.UndefOr[typings.awsSdk.clientsGlueMod.ImportLabelsTaskRunProperties] = js.undefined
  
  /**
    * The configuration properties for a labeling set generation task run.
    */
  var LabelingSetGenerationTaskRunProperties: js.UndefOr[typings.awsSdk.clientsGlueMod.LabelingSetGenerationTaskRunProperties] = js.undefined
  
  /**
    * The type of task run.
    */
  var TaskType: js.UndefOr[typings.awsSdk.clientsGlueMod.TaskType] = js.undefined
}
object TaskRunProperties {
  
  inline def apply(): TaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunProperties]
  }
  
  extension [Self <: TaskRunProperties](x: Self) {
    
    inline def setExportLabelsTaskRunProperties(value: ExportLabelsTaskRunProperties): Self = StObject.set(x, "ExportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    inline def setExportLabelsTaskRunPropertiesUndefined: Self = StObject.set(x, "ExportLabelsTaskRunProperties", js.undefined)
    
    inline def setFindMatchesTaskRunProperties(value: FindMatchesTaskRunProperties): Self = StObject.set(x, "FindMatchesTaskRunProperties", value.asInstanceOf[js.Any])
    
    inline def setFindMatchesTaskRunPropertiesUndefined: Self = StObject.set(x, "FindMatchesTaskRunProperties", js.undefined)
    
    inline def setImportLabelsTaskRunProperties(value: ImportLabelsTaskRunProperties): Self = StObject.set(x, "ImportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    inline def setImportLabelsTaskRunPropertiesUndefined: Self = StObject.set(x, "ImportLabelsTaskRunProperties", js.undefined)
    
    inline def setLabelingSetGenerationTaskRunProperties(value: LabelingSetGenerationTaskRunProperties): Self = StObject.set(x, "LabelingSetGenerationTaskRunProperties", value.asInstanceOf[js.Any])
    
    inline def setLabelingSetGenerationTaskRunPropertiesUndefined: Self = StObject.set(x, "LabelingSetGenerationTaskRunProperties", js.undefined)
    
    inline def setTaskType(value: TaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    inline def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
  }
}
