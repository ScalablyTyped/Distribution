package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /**
    * The access control configuration is for an Amazon EBS volume snapshot.
    */
  var ebsSnapshot: js.UndefOr[EbsSnapshotConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon ECR repository.
    */
  var ecrRepository: js.UndefOr[EcrRepositoryConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon EFS file system.
    */
  var efsFileSystem: js.UndefOr[EfsFileSystemConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an IAM role. 
    */
  var iamRole: js.UndefOr[IamRoleConfiguration] = js.undefined
  
  /**
    * The access control configuration is for a KMS key. 
    */
  var kmsKey: js.UndefOr[KmsKeyConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon RDS DB cluster snapshot.
    */
  var rdsDbClusterSnapshot: js.UndefOr[RdsDbClusterSnapshotConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon RDS DB snapshot.
    */
  var rdsDbSnapshot: js.UndefOr[RdsDbSnapshotConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon S3 Bucket. 
    */
  var s3Bucket: js.UndefOr[S3BucketConfiguration] = js.undefined
  
  /**
    * The access control configuration is for a Secrets Manager secret.
    */
  var secretsManagerSecret: js.UndefOr[SecretsManagerSecretConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon SNS topic
    */
  var snsTopic: js.UndefOr[SnsTopicConfiguration] = js.undefined
  
  /**
    * The access control configuration is for an Amazon SQS queue. 
    */
  var sqsQueue: js.UndefOr[SqsQueueConfiguration] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setEbsSnapshot(value: EbsSnapshotConfiguration): Self = StObject.set(x, "ebsSnapshot", value.asInstanceOf[js.Any])
    
    inline def setEbsSnapshotUndefined: Self = StObject.set(x, "ebsSnapshot", js.undefined)
    
    inline def setEcrRepository(value: EcrRepositoryConfiguration): Self = StObject.set(x, "ecrRepository", value.asInstanceOf[js.Any])
    
    inline def setEcrRepositoryUndefined: Self = StObject.set(x, "ecrRepository", js.undefined)
    
    inline def setEfsFileSystem(value: EfsFileSystemConfiguration): Self = StObject.set(x, "efsFileSystem", value.asInstanceOf[js.Any])
    
    inline def setEfsFileSystemUndefined: Self = StObject.set(x, "efsFileSystem", js.undefined)
    
    inline def setIamRole(value: IamRoleConfiguration): Self = StObject.set(x, "iamRole", value.asInstanceOf[js.Any])
    
    inline def setIamRoleUndefined: Self = StObject.set(x, "iamRole", js.undefined)
    
    inline def setKmsKey(value: KmsKeyConfiguration): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    
    inline def setRdsDbClusterSnapshot(value: RdsDbClusterSnapshotConfiguration): Self = StObject.set(x, "rdsDbClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setRdsDbClusterSnapshotUndefined: Self = StObject.set(x, "rdsDbClusterSnapshot", js.undefined)
    
    inline def setRdsDbSnapshot(value: RdsDbSnapshotConfiguration): Self = StObject.set(x, "rdsDbSnapshot", value.asInstanceOf[js.Any])
    
    inline def setRdsDbSnapshotUndefined: Self = StObject.set(x, "rdsDbSnapshot", js.undefined)
    
    inline def setS3Bucket(value: S3BucketConfiguration): Self = StObject.set(x, "s3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "s3Bucket", js.undefined)
    
    inline def setSecretsManagerSecret(value: SecretsManagerSecretConfiguration): Self = StObject.set(x, "secretsManagerSecret", value.asInstanceOf[js.Any])
    
    inline def setSecretsManagerSecretUndefined: Self = StObject.set(x, "secretsManagerSecret", js.undefined)
    
    inline def setSnsTopic(value: SnsTopicConfiguration): Self = StObject.set(x, "snsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "snsTopic", js.undefined)
    
    inline def setSqsQueue(value: SqsQueueConfiguration): Self = StObject.set(x, "sqsQueue", value.asInstanceOf[js.Any])
    
    inline def setSqsQueueUndefined: Self = StObject.set(x, "sqsQueue", js.undefined)
  }
}
