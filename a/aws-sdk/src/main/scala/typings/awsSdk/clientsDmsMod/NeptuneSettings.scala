package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NeptuneSettings extends StObject {
  
  /**
    * The number of milliseconds for DMS to wait to retry a bulk-load of migrated graph data to the Neptune target database before raising an error. The default is 250.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If you want Identity and Access Management (IAM) authorization enabled for this endpoint, set this parameter to true. Then attach the appropriate IAM policy document to your service role specified by ServiceAccessRoleArn. The default is false.
    */
  var IamAuthEnabled: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The maximum size in kilobytes of migrated graph data stored in a .csv file before DMS bulk-loads the data to the Neptune target database. The default is 1,048,576 KB. If the bulk load is successful, DMS clears the bucket, ready to store the next batch of migrated graph data.
    */
  var MaxFileSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The number of times for DMS to retry a bulk load of migrated graph data to the Neptune target database before raising an error. The default is 5.
    */
  var MaxRetryCount: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A folder path where you want DMS to store migrated graph data in the S3 bucket specified by S3BucketName 
    */
  var S3BucketFolder: String
  
  /**
    * The name of the Amazon S3 bucket where DMS can temporarily store migrated graph data in .csv files before bulk-loading it to the Neptune target database. DMS maps the SQL source data to graph data before storing it in these .csv files.
    */
  var S3BucketName: String
  
  /**
    * The Amazon Resource Name (ARN) of the service role that you created for the Neptune target endpoint. The role must allow the iam:PassRole action. For more information, see Creating an IAM Service Role for Accessing Amazon Neptune as a Target in the Database Migration Service User Guide.  
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
}
object NeptuneSettings {
  
  inline def apply(S3BucketFolder: String, S3BucketName: String): NeptuneSettings = {
    val __obj = js.Dynamic.literal(S3BucketFolder = S3BucketFolder.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NeptuneSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NeptuneSettings] (val x: Self) extends AnyVal {
    
    inline def setErrorRetryDuration(value: IntegerOptional): Self = StObject.set(x, "ErrorRetryDuration", value.asInstanceOf[js.Any])
    
    inline def setErrorRetryDurationUndefined: Self = StObject.set(x, "ErrorRetryDuration", js.undefined)
    
    inline def setIamAuthEnabled(value: BooleanOptional): Self = StObject.set(x, "IamAuthEnabled", value.asInstanceOf[js.Any])
    
    inline def setIamAuthEnabledUndefined: Self = StObject.set(x, "IamAuthEnabled", js.undefined)
    
    inline def setMaxFileSize(value: IntegerOptional): Self = StObject.set(x, "MaxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "MaxFileSize", js.undefined)
    
    inline def setMaxRetryCount(value: IntegerOptional): Self = StObject.set(x, "MaxRetryCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryCountUndefined: Self = StObject.set(x, "MaxRetryCount", js.undefined)
    
    inline def setS3BucketFolder(value: String): Self = StObject.set(x, "S3BucketFolder", value.asInstanceOf[js.Any])
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
  }
}
