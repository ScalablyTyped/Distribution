package typings.awsSdk.clientsAppflowMod

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
    * The unique ID that's assigned to an Amazon Redshift cluster.
    */
  var clusterIdentifier: js.UndefOr[ClusterIdentifier] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that permits Amazon AppFlow to access your Amazon Redshift database through the Data API. For more information, and for the polices that you attach to this role, see Allow Amazon AppFlow to access Amazon Redshift databases with the Data API.
    */
  var dataApiRoleArn: js.UndefOr[DataApiRoleArn] = js.undefined
  
  /**
    * The name of an Amazon Redshift database.
    */
  var databaseName: js.UndefOr[DatabaseName] = js.undefined
  
  /**
    *  The JDBC URL of the Amazon Redshift cluster. 
    */
  var databaseUrl: js.UndefOr[DatabaseUrl] = js.undefined
  
  /**
    * Indicates whether the connector profile defines a connection to an Amazon Redshift Serverless data warehouse.
    */
  var isRedshiftServerless: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of IAM role that grants Amazon Redshift read-only access to Amazon S3. For more information, and for the polices that you attach to this role, see Allow Amazon Redshift to access your Amazon AppFlow data in Amazon S3.
    */
  var roleArn: RoleArn
  
  /**
    * The name of an Amazon Redshift workgroup.
    */
  var workgroupName: js.UndefOr[WorkgroupName] = js.undefined
}
object RedshiftConnectorProfileProperties {
  
  inline def apply(bucketName: BucketName, roleArn: RoleArn): RedshiftConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setClusterIdentifier(value: ClusterIdentifier): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "clusterIdentifier", js.undefined)
    
    inline def setDataApiRoleArn(value: DataApiRoleArn): Self = StObject.set(x, "dataApiRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataApiRoleArnUndefined: Self = StObject.set(x, "dataApiRoleArn", js.undefined)
    
    inline def setDatabaseName(value: DatabaseName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "databaseName", js.undefined)
    
    inline def setDatabaseUrl(value: DatabaseUrl): Self = StObject.set(x, "databaseUrl", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUrlUndefined: Self = StObject.set(x, "databaseUrl", js.undefined)
    
    inline def setIsRedshiftServerless(value: Boolean): Self = StObject.set(x, "isRedshiftServerless", value.asInstanceOf[js.Any])
    
    inline def setIsRedshiftServerlessUndefined: Self = StObject.set(x, "isRedshiftServerless", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
