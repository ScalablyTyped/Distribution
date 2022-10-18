package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContinuousExportResponse extends StObject {
  
  /**
    * The type of data collector used to gather this data (currently only offered for AGENT).
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  
  /**
    * The unique ID assigned to this export.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
  
  /**
    * The name of the s3 bucket where the export data parquet files are stored.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  
  /**
    * A dictionary which describes how the data is stored.    databaseName - the name of the Glue database used to store the schema.  
    */
  var schemaStorageConfig: js.UndefOr[SchemaStorageConfig] = js.undefined
  
  /**
    * The timestamp representing when the continuous export was started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object StartContinuousExportResponse {
  
  inline def apply(): StartContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartContinuousExportResponse]
  }
  
  extension [Self <: StartContinuousExportResponse](x: Self) {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExportId(value: ConfigurationsExportId): Self = StObject.set(x, "exportId", value.asInstanceOf[js.Any])
    
    inline def setExportIdUndefined: Self = StObject.set(x, "exportId", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setSchemaStorageConfig(value: SchemaStorageConfig): Self = StObject.set(x, "schemaStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setSchemaStorageConfigUndefined: Self = StObject.set(x, "schemaStorageConfig", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
