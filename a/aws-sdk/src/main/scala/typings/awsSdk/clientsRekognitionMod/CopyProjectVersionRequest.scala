package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyProjectVersionRequest extends StObject {
  
  /**
    * The ARN of the project in the trusted AWS account that you want to copy the model version to. 
    */
  var DestinationProjectArn: ProjectArn
  
  /**
    * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to encrypt training results and manifest files written to the output Amazon S3 bucket (OutputConfig). If you choose to use your own KMS key, you need the following permissions on the KMS key.   kms:CreateGrant   kms:DescribeKey   kms:GenerateDataKey   kms:Decrypt   If you don't specify a value for KmsKeyId, images copied into the service are encrypted using a key that AWS owns and manages.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * The S3 bucket and folder location where the training output for the source model version is placed.
    */
  var OutputConfig: typings.awsSdk.clientsRekognitionMod.OutputConfig
  
  /**
    * The ARN of the source project in the trusting AWS account.
    */
  var SourceProjectArn: ProjectArn
  
  /**
    * The ARN of the model version in the source project that you want to copy to a destination project.
    */
  var SourceProjectVersionArn: ProjectVersionArn
  
  /**
    * The key-value tags to assign to the model version. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A name for the version of the model that's copied to the destination project.
    */
  var VersionName: typings.awsSdk.clientsRekognitionMod.VersionName
}
object CopyProjectVersionRequest {
  
  inline def apply(
    DestinationProjectArn: ProjectArn,
    OutputConfig: OutputConfig,
    SourceProjectArn: ProjectArn,
    SourceProjectVersionArn: ProjectVersionArn,
    VersionName: VersionName
  ): CopyProjectVersionRequest = {
    val __obj = js.Dynamic.literal(DestinationProjectArn = DestinationProjectArn.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], SourceProjectArn = SourceProjectArn.asInstanceOf[js.Any], SourceProjectVersionArn = SourceProjectVersionArn.asInstanceOf[js.Any], VersionName = VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyProjectVersionRequest]
  }
  
  extension [Self <: CopyProjectVersionRequest](x: Self) {
    
    inline def setDestinationProjectArn(value: ProjectArn): Self = StObject.set(x, "DestinationProjectArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceProjectArn(value: ProjectArn): Self = StObject.set(x, "SourceProjectArn", value.asInstanceOf[js.Any])
    
    inline def setSourceProjectVersionArn(value: ProjectVersionArn): Self = StObject.set(x, "SourceProjectVersionArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
  }
}
