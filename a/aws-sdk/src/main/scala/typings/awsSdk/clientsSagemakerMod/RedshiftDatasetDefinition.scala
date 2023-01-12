package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDatasetDefinition extends StObject {
  
  var ClusterId: RedshiftClusterId
  
  /**
    * The IAM role attached to your Redshift cluster that Amazon SageMaker uses to generate datasets.
    */
  var ClusterRoleArn: RoleArn
  
  var Database: RedshiftDatabase
  
  var DbUser: RedshiftUserName
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data from a Redshift execution.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  var OutputCompression: js.UndefOr[RedshiftResultCompressionType] = js.undefined
  
  var OutputFormat: RedshiftResultFormat
  
  /**
    * The location in Amazon S3 where the Redshift query results are stored.
    */
  var OutputS3Uri: S3Uri
  
  var QueryString: RedshiftQueryString
}
object RedshiftDatasetDefinition {
  
  inline def apply(
    ClusterId: RedshiftClusterId,
    ClusterRoleArn: RoleArn,
    Database: RedshiftDatabase,
    DbUser: RedshiftUserName,
    OutputFormat: RedshiftResultFormat,
    OutputS3Uri: S3Uri,
    QueryString: RedshiftQueryString
  ): RedshiftDatasetDefinition = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], ClusterRoleArn = ClusterRoleArn.asInstanceOf[js.Any], Database = Database.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], OutputFormat = OutputFormat.asInstanceOf[js.Any], OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any], QueryString = QueryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatasetDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftDatasetDefinition] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: RedshiftClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterRoleArn(value: RoleArn): Self = StObject.set(x, "ClusterRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDatabase(value: RedshiftDatabase): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDbUser(value: RedshiftUserName): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputCompression(value: RedshiftResultCompressionType): Self = StObject.set(x, "OutputCompression", value.asInstanceOf[js.Any])
    
    inline def setOutputCompressionUndefined: Self = StObject.set(x, "OutputCompression", js.undefined)
    
    inline def setOutputFormat(value: RedshiftResultFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputS3Uri(value: S3Uri): Self = StObject.set(x, "OutputS3Uri", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: RedshiftQueryString): Self = StObject.set(x, "QueryString", value.asInstanceOf[js.Any])
  }
}
