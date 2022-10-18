package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCaptureConfigSummary extends StObject {
  
  /**
    * Whether data capture is currently functional.
    */
  var CaptureStatus: typings.awsSdk.clientsSagemakerMod.CaptureStatus
  
  /**
    * The percentage of requests being captured by your Endpoint.
    */
  var CurrentSamplingPercentage: SamplingPercentage
  
  /**
    * The Amazon S3 location being used to capture the data.
    */
  var DestinationS3Uri: typings.awsSdk.clientsSagemakerMod.DestinationS3Uri
  
  /**
    * Whether data capture is enabled or disabled.
    */
  var EnableCapture: typings.awsSdk.clientsSagemakerMod.EnableCapture
  
  /**
    * The KMS key being used to encrypt the data in Amazon S3.
    */
  var KmsKeyId: typings.awsSdk.clientsSagemakerMod.KmsKeyId
}
object DataCaptureConfigSummary {
  
  inline def apply(
    CaptureStatus: CaptureStatus,
    CurrentSamplingPercentage: SamplingPercentage,
    DestinationS3Uri: DestinationS3Uri,
    EnableCapture: EnableCapture,
    KmsKeyId: KmsKeyId
  ): DataCaptureConfigSummary = {
    val __obj = js.Dynamic.literal(CaptureStatus = CaptureStatus.asInstanceOf[js.Any], CurrentSamplingPercentage = CurrentSamplingPercentage.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], EnableCapture = EnableCapture.asInstanceOf[js.Any], KmsKeyId = KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfigSummary]
  }
  
  extension [Self <: DataCaptureConfigSummary](x: Self) {
    
    inline def setCaptureStatus(value: CaptureStatus): Self = StObject.set(x, "CaptureStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentSamplingPercentage(value: SamplingPercentage): Self = StObject.set(x, "CurrentSamplingPercentage", value.asInstanceOf[js.Any])
    
    inline def setDestinationS3Uri(value: DestinationS3Uri): Self = StObject.set(x, "DestinationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setEnableCapture(value: EnableCapture): Self = StObject.set(x, "EnableCapture", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
  }
}
