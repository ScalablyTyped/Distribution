package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceDataSourceUpdate extends StObject {
  
  /**
    * The ID of the reference data source that is being updated. You can use the DescribeApplication operation to get this value.
    */
  var ReferenceId: Id
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream. 
    */
  var ReferenceSchemaUpdate: js.UndefOr[SourceSchema] = js.undefined
  
  /**
    * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf and populate the in-application reference table.
    */
  var S3ReferenceDataSourceUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.S3ReferenceDataSourceUpdate] = js.undefined
  
  /**
    * The in-application table name that is created by this update.
    */
  var TableNameUpdate: js.UndefOr[InAppTableName] = js.undefined
}
object ReferenceDataSourceUpdate {
  
  inline def apply(ReferenceId: Id): ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal(ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSourceUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReferenceDataSourceUpdate] (val x: Self) extends AnyVal {
    
    inline def setReferenceId(value: Id): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
    
    inline def setReferenceSchemaUpdate(value: SourceSchema): Self = StObject.set(x, "ReferenceSchemaUpdate", value.asInstanceOf[js.Any])
    
    inline def setReferenceSchemaUpdateUndefined: Self = StObject.set(x, "ReferenceSchemaUpdate", js.undefined)
    
    inline def setS3ReferenceDataSourceUpdate(value: S3ReferenceDataSourceUpdate): Self = StObject.set(x, "S3ReferenceDataSourceUpdate", value.asInstanceOf[js.Any])
    
    inline def setS3ReferenceDataSourceUpdateUndefined: Self = StObject.set(x, "S3ReferenceDataSourceUpdate", js.undefined)
    
    inline def setTableNameUpdate(value: InAppTableName): Self = StObject.set(x, "TableNameUpdate", value.asInstanceOf[js.Any])
    
    inline def setTableNameUpdateUndefined: Self = StObject.set(x, "TableNameUpdate", js.undefined)
  }
}
