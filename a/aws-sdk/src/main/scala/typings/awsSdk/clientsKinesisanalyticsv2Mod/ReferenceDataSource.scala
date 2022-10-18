package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceDataSource extends StObject {
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns created in the in-application stream.
    */
  var ReferenceSchema: SourceSchema
  
  /**
    * Identifies the S3 bucket and object that contains the reference data. A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the UpdateApplication operation to trigger reloading of data into your application. 
    */
  var S3ReferenceDataSource: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.S3ReferenceDataSource] = js.undefined
  
  /**
    * The name of the in-application table to create.
    */
  var TableName: InAppTableName
}
object ReferenceDataSource {
  
  inline def apply(ReferenceSchema: SourceSchema, TableName: InAppTableName): ReferenceDataSource = {
    val __obj = js.Dynamic.literal(ReferenceSchema = ReferenceSchema.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceDataSource]
  }
  
  extension [Self <: ReferenceDataSource](x: Self) {
    
    inline def setReferenceSchema(value: SourceSchema): Self = StObject.set(x, "ReferenceSchema", value.asInstanceOf[js.Any])
    
    inline def setS3ReferenceDataSource(value: S3ReferenceDataSource): Self = StObject.set(x, "S3ReferenceDataSource", value.asInstanceOf[js.Any])
    
    inline def setS3ReferenceDataSourceUndefined: Self = StObject.set(x, "S3ReferenceDataSource", js.undefined)
    
    inline def setTableName(value: InAppTableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
