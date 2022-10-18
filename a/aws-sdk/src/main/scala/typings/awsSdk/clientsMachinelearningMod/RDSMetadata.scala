package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSMetadata extends StObject {
  
  /**
    * The ID of the Data Pipeline instance that is used to carry to copy data from Amazon RDS to Amazon S3. You can use the ID to find details about the instance in the Data Pipeline console.
    */
  var DataPipelineId: js.UndefOr[EDPPipelineId] = js.undefined
  
  /**
    * The database details required to connect to an Amazon RDS.
    */
  var Database: js.UndefOr[RDSDatabase] = js.undefined
  
  var DatabaseUserName: js.UndefOr[RDSDatabaseUsername] = js.undefined
  
  /**
    * The role (DataPipelineDefaultResourceRole) assumed by an Amazon EC2 instance to carry out the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ResourceRole: js.UndefOr[EDPResourceRole] = js.undefined
  
  /**
    * The SQL query that is supplied during CreateDataSourceFromRDS. Returns only if Verbose is true in GetDataSourceInput. 
    */
  var SelectSqlQuery: js.UndefOr[RDSSelectSqlQuery] = js.undefined
  
  /**
    * The role (DataPipelineDefaultRole) assumed by the Data Pipeline service to monitor the progress of the copy task from Amazon RDS to Amazon S3. For more information, see Role templates for data pipelines.
    */
  var ServiceRole: js.UndefOr[EDPServiceRole] = js.undefined
}
object RDSMetadata {
  
  inline def apply(): RDSMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSMetadata]
  }
  
  extension [Self <: RDSMetadata](x: Self) {
    
    inline def setDataPipelineId(value: EDPPipelineId): Self = StObject.set(x, "DataPipelineId", value.asInstanceOf[js.Any])
    
    inline def setDataPipelineIdUndefined: Self = StObject.set(x, "DataPipelineId", js.undefined)
    
    inline def setDatabase(value: RDSDatabase): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setDatabaseUserName(value: RDSDatabaseUsername): Self = StObject.set(x, "DatabaseUserName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUserNameUndefined: Self = StObject.set(x, "DatabaseUserName", js.undefined)
    
    inline def setResourceRole(value: EDPResourceRole): Self = StObject.set(x, "ResourceRole", value.asInstanceOf[js.Any])
    
    inline def setResourceRoleUndefined: Self = StObject.set(x, "ResourceRole", js.undefined)
    
    inline def setSelectSqlQuery(value: RDSSelectSqlQuery): Self = StObject.set(x, "SelectSqlQuery", value.asInstanceOf[js.Any])
    
    inline def setSelectSqlQueryUndefined: Self = StObject.set(x, "SelectSqlQuery", js.undefined)
    
    inline def setServiceRole(value: EDPServiceRole): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
  }
}
