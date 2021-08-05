package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftConnectorProfileProperties extends StObject {
  
  /**
    *  A name for the associated Amazon S3 bucket. 
    */
  var bucketName: BucketName
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  The JDBC URL of the Amazon Redshift cluster. 
    */
  var databaseUrl: DatabaseUrl
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: RoleArn
}
object RedshiftConnectorProfileProperties {
  
  inline def apply(bucketName: BucketName, databaseUrl: DatabaseUrl, roleArn: RoleArn): RedshiftConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], databaseUrl = databaseUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftConnectorProfileProperties]
  }
  
  extension [Self <: RedshiftConnectorProfileProperties](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setDatabaseUrl(value: DatabaseUrl): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
