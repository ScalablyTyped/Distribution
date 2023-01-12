package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalyDetectorRequest extends StObject {
  
  /**
    * The ARN of the detector to update.
    */
  var AnomalyDetectorArn: Arn
  
  /**
    * Contains information about the configuration to which the detector will be updated.
    */
  var AnomalyDetectorConfig: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorConfig] = js.undefined
  
  /**
    * The updated detector description.
    */
  var AnomalyDetectorDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an AWS KMS encryption key.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.KmsKeyArn] = js.undefined
}
object UpdateAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorArn: Arn): UpdateAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorArn = AnomalyDetectorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalyDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnomalyDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorConfig(value: AnomalyDetectorConfig): Self = StObject.set(x, "AnomalyDetectorConfig", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorConfigUndefined: Self = StObject.set(x, "AnomalyDetectorConfig", js.undefined)
    
    inline def setAnomalyDetectorDescription(value: AnomalyDetectorDescription): Self = StObject.set(x, "AnomalyDetectorDescription", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDescriptionUndefined: Self = StObject.set(x, "AnomalyDetectorDescription", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
  }
}
