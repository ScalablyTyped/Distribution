package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFlywheelRequest extends StObject {
  
  /**
    * To associate an existing model with the flywheel, specify the Amazon Resource Number (ARN) of the model version.
    */
  var ActiveModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * A unique identifier for the request. If you don't set the client request token, Amazon Comprehend generates one.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend the permissions required to access the flywheel data in the data lake.
    */
  var DataAccessRoleArn: IamRoleArn
  
  /**
    * Enter the S3 location for the data lake. You can specify a new S3 bucket or a new folder of an existing S3 bucket. The flywheel creates the data lake at this location.
    */
  var DataLakeS3Uri: FlywheelS3Uri
  
  /**
    * Data security configurations.
    */
  var DataSecurityConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DataSecurityConfig] = js.undefined
  
  /**
    * Name for the flywheel.
    */
  var FlywheelName: ComprehendArnName
  
  /**
    * The model type.
    */
  var ModelType: js.UndefOr[typings.awsSdk.clientsComprehendMod.ModelType] = js.undefined
  
  /**
    * The tags to associate with this flywheel.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Configuration about the custom classifier associated with the flywheel.
    */
  var TaskConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.TaskConfig] = js.undefined
}
object CreateFlywheelRequest {
  
  inline def apply(DataAccessRoleArn: IamRoleArn, DataLakeS3Uri: FlywheelS3Uri, FlywheelName: ComprehendArnName): CreateFlywheelRequest = {
    val __obj = js.Dynamic.literal(DataAccessRoleArn = DataAccessRoleArn.asInstanceOf[js.Any], DataLakeS3Uri = DataLakeS3Uri.asInstanceOf[js.Any], FlywheelName = FlywheelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlywheelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFlywheelRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ActiveModelArn", value.asInstanceOf[js.Any])
    
    inline def setActiveModelArnUndefined: Self = StObject.set(x, "ActiveModelArn", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestTokenString): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataLakeS3Uri(value: FlywheelS3Uri): Self = StObject.set(x, "DataLakeS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDataSecurityConfig(value: DataSecurityConfig): Self = StObject.set(x, "DataSecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSecurityConfigUndefined: Self = StObject.set(x, "DataSecurityConfig", js.undefined)
    
    inline def setFlywheelName(value: ComprehendArnName): Self = StObject.set(x, "FlywheelName", value.asInstanceOf[js.Any])
    
    inline def setModelType(value: ModelType): Self = StObject.set(x, "ModelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "ModelType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTaskConfig(value: TaskConfig): Self = StObject.set(x, "TaskConfig", value.asInstanceOf[js.Any])
    
    inline def setTaskConfigUndefined: Self = StObject.set(x, "TaskConfig", js.undefined)
  }
}
