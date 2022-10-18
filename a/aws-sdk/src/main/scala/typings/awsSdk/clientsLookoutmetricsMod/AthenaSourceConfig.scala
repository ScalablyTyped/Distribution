package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AthenaSourceConfig extends StObject {
  
  /**
    * Settings for backtest mode.
    */
  var BackTestConfiguration: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.BackTestConfiguration] = js.undefined
  
  /**
    * The database's data catalog.
    */
  var DataCatalog: js.UndefOr[AthenaDataCatalog] = js.undefined
  
  /**
    * The database's name.
    */
  var DatabaseName: js.UndefOr[AthenaDatabaseName] = js.undefined
  
  /**
    * An IAM role that gives Amazon Lookout for Metrics permission to access the data.
    */
  var RoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The database's results path.
    */
  var S3ResultsPath: js.UndefOr[AthenaS3ResultsPath] = js.undefined
  
  /**
    * The database's table name.
    */
  var TableName: js.UndefOr[AthenaTableName] = js.undefined
  
  /**
    * The database's work group name.
    */
  var WorkGroupName: js.UndefOr[AthenaWorkGroupName] = js.undefined
}
object AthenaSourceConfig {
  
  inline def apply(): AthenaSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AthenaSourceConfig]
  }
  
  extension [Self <: AthenaSourceConfig](x: Self) {
    
    inline def setBackTestConfiguration(value: BackTestConfiguration): Self = StObject.set(x, "BackTestConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBackTestConfigurationUndefined: Self = StObject.set(x, "BackTestConfiguration", js.undefined)
    
    inline def setDataCatalog(value: AthenaDataCatalog): Self = StObject.set(x, "DataCatalog", value.asInstanceOf[js.Any])
    
    inline def setDataCatalogUndefined: Self = StObject.set(x, "DataCatalog", js.undefined)
    
    inline def setDatabaseName(value: AthenaDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setS3ResultsPath(value: AthenaS3ResultsPath): Self = StObject.set(x, "S3ResultsPath", value.asInstanceOf[js.Any])
    
    inline def setS3ResultsPathUndefined: Self = StObject.set(x, "S3ResultsPath", js.undefined)
    
    inline def setTableName(value: AthenaTableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setWorkGroupName(value: AthenaWorkGroupName): Self = StObject.set(x, "WorkGroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupNameUndefined: Self = StObject.set(x, "WorkGroupName", js.undefined)
  }
}
