package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectorModelConfiguration extends StObject {
  
  /**
    * The time the detector model was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the detector model.
    */
  var detectorModelArn: js.UndefOr[DetectorModelArn] = js.undefined
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  
  /**
    * The version of the detector model.
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined
  
  /**
    * The value used to identify a detector instance. When a device or system sends input, a new detector instance with a unique key value is created. AWS IoT Events can continue to route input to its corresponding detector instance based on this identifying information.  This parameter uses a JSON-path expression to select the attribute-value pair in the message payload that is used for identification. To route the message to the correct detector instance, the device must send a message payload that contains the same attribute-value.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.undefined
  
  /**
    * The time the detector model was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The status of the detector model.
    */
  var status: js.UndefOr[DetectorModelVersionStatus] = js.undefined
}
object DetectorModelConfiguration {
  
  inline def apply(): DetectorModelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectorModelConfiguration]
  }
  
  extension [Self <: DetectorModelConfiguration](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDetectorModelArn(value: DetectorModelArn): Self = StObject.set(x, "detectorModelArn", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelArnUndefined: Self = StObject.set(x, "detectorModelArn", js.undefined)
    
    inline def setDetectorModelDescription(value: DetectorModelDescription): Self = StObject.set(x, "detectorModelDescription", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelDescriptionUndefined: Self = StObject.set(x, "detectorModelDescription", js.undefined)
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelNameUndefined: Self = StObject.set(x, "detectorModelName", js.undefined)
    
    inline def setDetectorModelVersion(value: DetectorModelVersion): Self = StObject.set(x, "detectorModelVersion", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelVersionUndefined: Self = StObject.set(x, "detectorModelVersion", js.undefined)
    
    inline def setEvaluationMethod(value: EvaluationMethod): Self = StObject.set(x, "evaluationMethod", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMethodUndefined: Self = StObject.set(x, "evaluationMethod", js.undefined)
    
    inline def setKey(value: AttributeJsonPath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: DetectorModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
