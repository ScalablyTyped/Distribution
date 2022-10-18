package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableStatistics extends StObject {
  
  /**
    * The data definition language (DDL) used to build and modify the structure of your tables.
    */
  var Ddls: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of delete actions performed on a table.
    */
  var Deletes: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows that failed conditional checks during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadCondtnlChkFailedRows: js.UndefOr[Long] = js.undefined
  
  /**
    * The time when the full load operation completed.
    */
  var FullLoadEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of rows that failed to load during the full load operation (valid only for migrations where DynamoDB is the target).
    */
  var FullLoadErrorRows: js.UndefOr[Long] = js.undefined
  
  /**
    * A value that indicates if the table was reloaded (true) or loaded as part of a new full load operation (false).
    */
  var FullLoadReloaded: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The number of rows added during the full load operation.
    */
  var FullLoadRows: js.UndefOr[Long] = js.undefined
  
  /**
    * The time when the full load operation started.
    */
  var FullLoadStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of insert actions performed on a table.
    */
  var Inserts: js.UndefOr[Long] = js.undefined
  
  /**
    * The last time a table was updated.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The schema name.
    */
  var SchemaName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the tables described. Valid states: Table does not exist | Before load | Full load | Table completed | Table cancelled | Table error | Table is being reloaded
    */
  var TableState: js.UndefOr[String] = js.undefined
  
  /**
    * The number of update actions performed on a table.
    */
  var Updates: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of records that failed validation.
    */
  var ValidationFailedRecords: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of records that have yet to be validated.
    */
  var ValidationPendingRecords: js.UndefOr[Long] = js.undefined
  
  /**
    * The validation state of the table. This parameter can have the following values:   Not enabled – Validation isn't enabled for the table in the migration task.   Pending records – Some records in the table are waiting for validation.   Mismatched records – Some records in the table don't match between the source and target.   Suspended records – Some records in the table couldn't be validated.   No primary key –The table couldn't be validated because it has no primary key.   Table error – The table wasn't validated because it's in an error state and some data wasn't migrated.   Validated – All rows in the table are validated. If the table is updated, the status can change from Validated.   Error – The table couldn't be validated because of an unexpected error.   Pending validation – The table is waiting validation.   Preparing table – Preparing the table enabled in the migration task for validation.   Pending revalidation – All rows in the table are pending validation after the table was updated.  
    */
  var ValidationState: js.UndefOr[String] = js.undefined
  
  /**
    * Additional details about the state of validation.
    */
  var ValidationStateDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The number of records that couldn't be validated.
    */
  var ValidationSuspendedRecords: js.UndefOr[Long] = js.undefined
}
object TableStatistics {
  
  inline def apply(): TableStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableStatistics]
  }
  
  extension [Self <: TableStatistics](x: Self) {
    
    inline def setDdls(value: Long): Self = StObject.set(x, "Ddls", value.asInstanceOf[js.Any])
    
    inline def setDdlsUndefined: Self = StObject.set(x, "Ddls", js.undefined)
    
    inline def setDeletes(value: Long): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    inline def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
    
    inline def setFullLoadCondtnlChkFailedRows(value: Long): Self = StObject.set(x, "FullLoadCondtnlChkFailedRows", value.asInstanceOf[js.Any])
    
    inline def setFullLoadCondtnlChkFailedRowsUndefined: Self = StObject.set(x, "FullLoadCondtnlChkFailedRows", js.undefined)
    
    inline def setFullLoadEndTime(value: js.Date): Self = StObject.set(x, "FullLoadEndTime", value.asInstanceOf[js.Any])
    
    inline def setFullLoadEndTimeUndefined: Self = StObject.set(x, "FullLoadEndTime", js.undefined)
    
    inline def setFullLoadErrorRows(value: Long): Self = StObject.set(x, "FullLoadErrorRows", value.asInstanceOf[js.Any])
    
    inline def setFullLoadErrorRowsUndefined: Self = StObject.set(x, "FullLoadErrorRows", js.undefined)
    
    inline def setFullLoadReloaded(value: BooleanOptional): Self = StObject.set(x, "FullLoadReloaded", value.asInstanceOf[js.Any])
    
    inline def setFullLoadReloadedUndefined: Self = StObject.set(x, "FullLoadReloaded", js.undefined)
    
    inline def setFullLoadRows(value: Long): Self = StObject.set(x, "FullLoadRows", value.asInstanceOf[js.Any])
    
    inline def setFullLoadRowsUndefined: Self = StObject.set(x, "FullLoadRows", js.undefined)
    
    inline def setFullLoadStartTime(value: js.Date): Self = StObject.set(x, "FullLoadStartTime", value.asInstanceOf[js.Any])
    
    inline def setFullLoadStartTimeUndefined: Self = StObject.set(x, "FullLoadStartTime", js.undefined)
    
    inline def setInserts(value: Long): Self = StObject.set(x, "Inserts", value.asInstanceOf[js.Any])
    
    inline def setInsertsUndefined: Self = StObject.set(x, "Inserts", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
    
    inline def setSchemaNameUndefined: Self = StObject.set(x, "SchemaName", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTableState(value: String): Self = StObject.set(x, "TableState", value.asInstanceOf[js.Any])
    
    inline def setTableStateUndefined: Self = StObject.set(x, "TableState", js.undefined)
    
    inline def setUpdates(value: Long): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "Updates", js.undefined)
    
    inline def setValidationFailedRecords(value: Long): Self = StObject.set(x, "ValidationFailedRecords", value.asInstanceOf[js.Any])
    
    inline def setValidationFailedRecordsUndefined: Self = StObject.set(x, "ValidationFailedRecords", js.undefined)
    
    inline def setValidationPendingRecords(value: Long): Self = StObject.set(x, "ValidationPendingRecords", value.asInstanceOf[js.Any])
    
    inline def setValidationPendingRecordsUndefined: Self = StObject.set(x, "ValidationPendingRecords", js.undefined)
    
    inline def setValidationState(value: String): Self = StObject.set(x, "ValidationState", value.asInstanceOf[js.Any])
    
    inline def setValidationStateDetails(value: String): Self = StObject.set(x, "ValidationStateDetails", value.asInstanceOf[js.Any])
    
    inline def setValidationStateDetailsUndefined: Self = StObject.set(x, "ValidationStateDetails", js.undefined)
    
    inline def setValidationStateUndefined: Self = StObject.set(x, "ValidationState", js.undefined)
    
    inline def setValidationSuspendedRecords(value: Long): Self = StObject.set(x, "ValidationSuspendedRecords", value.asInstanceOf[js.Any])
    
    inline def setValidationSuspendedRecordsUndefined: Self = StObject.set(x, "ValidationSuspendedRecords", js.undefined)
  }
}
