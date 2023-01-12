package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportFileTaskRequest extends StObject {
  
  /**
    *  The S3 bucket where the import file is located. The bucket name is required to begin with migrationhub-strategy-.
    */
  var S3Bucket: importS3Bucket
  
  /**
    * Specifies the source that the servers are coming from. By default, Strategy Recommendations assumes that the servers specified in the import file are available in AWS Application Discovery Service. 
    */
  var dataSourceType: js.UndefOr[DataSourceType] = js.undefined
  
  /**
    * Groups the resources in the import file together with a unique name. This ID can be as filter in ListApplicationComponents and ListServers. 
    */
  var groupId: js.UndefOr[GroupIds] = js.undefined
  
  /**
    *  A descriptive name for the request. 
    */
  var name: StartImportFileTaskRequestNameString
  
  /**
    *  The S3 bucket where Strategy Recommendations uploads import results. The bucket name is required to begin with migrationhub-strategy-. 
    */
  var s3bucketForReportData: js.UndefOr[StartImportFileTaskRequestS3bucketForReportDataString] = js.undefined
  
  /**
    *  The Amazon S3 key name of the import file. 
    */
  var s3key: String
}
object StartImportFileTaskRequest {
  
  inline def apply(S3Bucket: importS3Bucket, name: StartImportFileTaskRequestNameString, s3key: String): StartImportFileTaskRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], s3key = s3key.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportFileTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartImportFileTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSourceType(value: DataSourceType): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setGroupId(value: GroupIds): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupIdVarargs(value: Group*): Self = StObject.set(x, "groupId", js.Array(value*))
    
    inline def setName(value: StartImportFileTaskRequestNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setS3Bucket(value: importS3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3bucketForReportData(value: StartImportFileTaskRequestS3bucketForReportDataString): Self = StObject.set(x, "s3bucketForReportData", value.asInstanceOf[js.Any])
    
    inline def setS3bucketForReportDataUndefined: Self = StObject.set(x, "s3bucketForReportData", js.undefined)
    
    inline def setS3key(value: String): Self = StObject.set(x, "s3key", value.asInstanceOf[js.Any])
  }
}
