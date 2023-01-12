package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetDescription extends StObject {
  
  /**
    * The Unix timestamp for the time and date that the dataset was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of the dataset. The value train represents a training dataset or single dataset project. The value test represents a test dataset.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.DatasetType] = js.undefined
  
  /**
    * Statistics about the images in a dataset.
    */
  var ImageStats: js.UndefOr[DatasetImageStats] = js.undefined
  
  /**
    * The Unix timestamp for the date and time that the dataset was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the project that contains the dataset.
    */
  var ProjectName: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.ProjectName] = js.undefined
  
  /**
    * The status of the dataset.
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
  
  /**
    * The status message for the dataset. 
    */
  var StatusMessage: js.UndefOr[DatasetStatusMessage] = js.undefined
}
object DatasetDescription {
  
  inline def apply(): DatasetDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetDescription] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setImageStats(value: DatasetImageStats): Self = StObject.set(x, "ImageStats", value.asInstanceOf[js.Any])
    
    inline def setImageStatsUndefined: Self = StObject.set(x, "ImageStats", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "ProjectName", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: DatasetStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
