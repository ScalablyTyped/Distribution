package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalyDetectorRequest extends StObject {
  
  /**
    * Contains information about the configuration of the anomaly detector.
    */
  var AnomalyDetectorConfig: typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorConfig
  
  /**
    * A description of the detector.
    */
  var AnomalyDetectorDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorDescription] = js.undefined
  
  /**
    * The name of the detector.
    */
  var AnomalyDetectorName: typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorName
  
  /**
    * The ARN of the KMS key to use to encrypt your data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.KmsKeyArn] = js.undefined
  
  /**
    * A list of tags to apply to the anomaly detector.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAnomalyDetectorRequest {
  
  inline def apply(AnomalyDetectorConfig: AnomalyDetectorConfig, AnomalyDetectorName: AnomalyDetectorName): CreateAnomalyDetectorRequest = {
    val __obj = js.Dynamic.literal(AnomalyDetectorConfig = AnomalyDetectorConfig.asInstanceOf[js.Any], AnomalyDetectorName = AnomalyDetectorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalyDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnomalyDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorConfig(value: AnomalyDetectorConfig): Self = StObject.set(x, "AnomalyDetectorConfig", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDescription(value: AnomalyDetectorDescription): Self = StObject.set(x, "AnomalyDetectorDescription", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDescriptionUndefined: Self = StObject.set(x, "AnomalyDetectorDescription", js.undefined)
    
    inline def setAnomalyDetectorName(value: AnomalyDetectorName): Self = StObject.set(x, "AnomalyDetectorName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
