package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlywheelProperties extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the active model version.
    */
  var ActiveModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * Creation time of the flywheel.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Amazon S3 URI of the data lake location. 
    */
  var DataLakeS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * Data security configuration.
    */
  var DataSecurityConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.DataSecurityConfig] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel.
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * Last modified time for the flywheel.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent flywheel iteration.
    */
  var LatestFlywheelIteration: js.UndefOr[FlywheelIterationId] = js.undefined
  
  /**
    * A description of the status of the flywheel.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * Model type of the flywheel's model.
    */
  var ModelType: js.UndefOr[typings.awsSdk.clientsComprehendMod.ModelType] = js.undefined
  
  /**
    * The status of the flywheel.
    */
  var Status: js.UndefOr[FlywheelStatus] = js.undefined
  
  /**
    * Configuration about the custom classifier associated with the flywheel.
    */
  var TaskConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.TaskConfig] = js.undefined
}
object FlywheelProperties {
  
  inline def apply(): FlywheelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlywheelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlywheelProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ActiveModelArn", value.asInstanceOf[js.Any])
    
    inline def setActiveModelArnUndefined: Self = StObject.set(x, "ActiveModelArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDataLakeS3Uri(value: S3Uri): Self = StObject.set(x, "DataLakeS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDataLakeS3UriUndefined: Self = StObject.set(x, "DataLakeS3Uri", js.undefined)
    
    inline def setDataSecurityConfig(value: DataSecurityConfig): Self = StObject.set(x, "DataSecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSecurityConfigUndefined: Self = StObject.set(x, "DataSecurityConfig", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLatestFlywheelIteration(value: FlywheelIterationId): Self = StObject.set(x, "LatestFlywheelIteration", value.asInstanceOf[js.Any])
    
    inline def setLatestFlywheelIterationUndefined: Self = StObject.set(x, "LatestFlywheelIteration", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setModelType(value: ModelType): Self = StObject.set(x, "ModelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "ModelType", js.undefined)
    
    inline def setStatus(value: FlywheelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTaskConfig(value: TaskConfig): Self = StObject.set(x, "TaskConfig", value.asInstanceOf[js.Any])
    
    inline def setTaskConfigUndefined: Self = StObject.set(x, "TaskConfig", js.undefined)
  }
}
