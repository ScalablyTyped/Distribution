package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlywheelSummary extends StObject {
  
  /**
    * ARN of the active model version for the flywheel.
    */
  var ActiveModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * Creation time of the flywheel.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon S3 URI of the data lake location. 
    */
  var DataLakeS3Uri: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel
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
}
object FlywheelSummary {
  
  inline def apply(): FlywheelSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlywheelSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlywheelSummary] (val x: Self) extends AnyVal {
    
    inline def setActiveModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ActiveModelArn", value.asInstanceOf[js.Any])
    
    inline def setActiveModelArnUndefined: Self = StObject.set(x, "ActiveModelArn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataLakeS3Uri(value: S3Uri): Self = StObject.set(x, "DataLakeS3Uri", value.asInstanceOf[js.Any])
    
    inline def setDataLakeS3UriUndefined: Self = StObject.set(x, "DataLakeS3Uri", js.undefined)
    
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
  }
}
