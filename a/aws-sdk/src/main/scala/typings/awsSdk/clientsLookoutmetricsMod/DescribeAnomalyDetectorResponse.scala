package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnomalyDetectorResponse extends StObject {
  
  /**
    * The ARN of the detector.
    */
  var AnomalyDetectorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Contains information about the detector's configuration.
    */
  var AnomalyDetectorConfig: js.UndefOr[AnomalyDetectorConfigSummary] = js.undefined
  
  /**
    * A description of the detector.
    */
  var AnomalyDetectorDescription: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorDescription] = js.undefined
  
  /**
    * The name of the detector.
    */
  var AnomalyDetectorName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.AnomalyDetectorName] = js.undefined
  
  /**
    * The time at which the detector was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reason that the detector failed.
    */
  var FailureReason: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The process that caused the detector to fail.
    */
  var FailureType: js.UndefOr[AnomalyDetectorFailureType] = js.undefined
  
  /**
    * The ARN of the KMS key to use to encrypt your data.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.KmsKeyArn] = js.undefined
  
  /**
    * The time at which the detector was last modified.
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the detector.
    */
  var Status: js.UndefOr[AnomalyDetectorStatus] = js.undefined
}
object DescribeAnomalyDetectorResponse {
  
  inline def apply(): DescribeAnomalyDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAnomalyDetectorResponse] (val x: Self) extends AnyVal {
    
    inline def setAnomalyDetectorArn(value: Arn): Self = StObject.set(x, "AnomalyDetectorArn", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorArnUndefined: Self = StObject.set(x, "AnomalyDetectorArn", js.undefined)
    
    inline def setAnomalyDetectorConfig(value: AnomalyDetectorConfigSummary): Self = StObject.set(x, "AnomalyDetectorConfig", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorConfigUndefined: Self = StObject.set(x, "AnomalyDetectorConfig", js.undefined)
    
    inline def setAnomalyDetectorDescription(value: AnomalyDetectorDescription): Self = StObject.set(x, "AnomalyDetectorDescription", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorDescriptionUndefined: Self = StObject.set(x, "AnomalyDetectorDescription", js.undefined)
    
    inline def setAnomalyDetectorName(value: AnomalyDetectorName): Self = StObject.set(x, "AnomalyDetectorName", value.asInstanceOf[js.Any])
    
    inline def setAnomalyDetectorNameUndefined: Self = StObject.set(x, "AnomalyDetectorName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFailureReason(value: ErrorMessage): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setFailureType(value: AnomalyDetectorFailureType): Self = StObject.set(x, "FailureType", value.asInstanceOf[js.Any])
    
    inline def setFailureTypeUndefined: Self = StObject.set(x, "FailureType", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setStatus(value: AnomalyDetectorStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
