package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * A value that indicates if the dataset has column level permission configured.
    */
  var ColumnLevelPermissionRulesApplied: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time that this dataset was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A value that indicates whether you want to import the data into SPICE.
    */
  var ImportMode: js.UndefOr[DataSetImportMode] = js.undefined
  
  /**
    * The last time that this dataset was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A display name for the dataset.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The row-level security configuration for the dataset.
    */
  var RowLevelPermissionDataSet: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RowLevelPermissionDataSet] = js.undefined
  
  /**
    * Whether or not the row level permission tags are applied.
    */
  var RowLevelPermissionTagConfigurationApplied: js.UndefOr[Boolean] = js.undefined
}
object DataSetSummary {
  
  inline def apply(): DataSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSetSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setColumnLevelPermissionRulesApplied(value: Boolean): Self = StObject.set(x, "ColumnLevelPermissionRulesApplied", value.asInstanceOf[js.Any])
    
    inline def setColumnLevelPermissionRulesAppliedUndefined: Self = StObject.set(x, "ColumnLevelPermissionRulesApplied", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdUndefined: Self = StObject.set(x, "DataSetId", js.undefined)
    
    inline def setImportMode(value: DataSetImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "ImportMode", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRowLevelPermissionDataSet(value: RowLevelPermissionDataSet): Self = StObject.set(x, "RowLevelPermissionDataSet", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionDataSetUndefined: Self = StObject.set(x, "RowLevelPermissionDataSet", js.undefined)
    
    inline def setRowLevelPermissionTagConfigurationApplied(value: Boolean): Self = StObject.set(x, "RowLevelPermissionTagConfigurationApplied", value.asInstanceOf[js.Any])
    
    inline def setRowLevelPermissionTagConfigurationAppliedUndefined: Self = StObject.set(x, "RowLevelPermissionTagConfigurationApplied", js.undefined)
  }
}
