package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDetectorModelRequest extends StObject {
  
  /**
    * Information that defines how a detector operates.
    */
  var detectorModelDefinition: DetectorModelDefinition
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.undefined
  
  /**
    * The name of the detector model that is updated.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.undefined
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName
}
object UpdateDetectorModelRequest {
  
  inline def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): UpdateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetectorModelRequest]
  }
  
  extension [Self <: UpdateDetectorModelRequest](x: Self) {
    
    inline def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelDescription(value: DetectorModelDescription): Self = StObject.set(x, "detectorModelDescription", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelDescriptionUndefined: Self = StObject.set(x, "detectorModelDescription", js.undefined)
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMethod(value: EvaluationMethod): Self = StObject.set(x, "evaluationMethod", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMethodUndefined: Self = StObject.set(x, "evaluationMethod", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
