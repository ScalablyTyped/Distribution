package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCaptureConfig extends StObject {
  
  /**
    * Configuration specifying how to treat different headers. If no headers are specified SageMaker will by default base64 encode when capturing the data.
    */
  var CaptureContentTypeHeader: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CaptureContentTypeHeader] = js.undefined
  
  /**
    * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
    */
  var CaptureOptions: CaptureOptionList
  
  /**
    * The Amazon S3 location used to capture the data.
    */
  var DestinationS3Uri: typings.awsSdk.clientsSagemakerMod.DestinationS3Uri
  
  /**
    * Whether data capture should be enabled or disabled (defaults to enabled).
    */
  var EnableCapture: js.UndefOr[typings.awsSdk.clientsSagemakerMod.EnableCapture] = js.undefined
  
  /**
    * The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high traffic.
    */
  var InitialSamplingPercentage: SamplingPercentage
  
  /**
    * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt the captured data at rest using Amazon S3 server-side encryption. The KmsKeyId can be any of the following formats:    Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    Alias name: alias/ExampleAlias    Alias name ARN: arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias   
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
}
object DataCaptureConfig {
  
  inline def apply(
    CaptureOptions: CaptureOptionList,
    DestinationS3Uri: DestinationS3Uri,
    InitialSamplingPercentage: SamplingPercentage
  ): DataCaptureConfig = {
    val __obj = js.Dynamic.literal(CaptureOptions = CaptureOptions.asInstanceOf[js.Any], DestinationS3Uri = DestinationS3Uri.asInstanceOf[js.Any], InitialSamplingPercentage = InitialSamplingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCaptureConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataCaptureConfig] (val x: Self) extends AnyVal {
    
    inline def setCaptureContentTypeHeader(value: CaptureContentTypeHeader): Self = StObject.set(x, "CaptureContentTypeHeader", value.asInstanceOf[js.Any])
    
    inline def setCaptureContentTypeHeaderUndefined: Self = StObject.set(x, "CaptureContentTypeHeader", js.undefined)
    
    inline def setCaptureOptions(value: CaptureOptionList): Self = StObject.set(x, "CaptureOptions", value.asInstanceOf[js.Any])
    
    inline def setCaptureOptionsVarargs(value: CaptureOption*): Self = StObject.set(x, "CaptureOptions", js.Array(value*))
    
    inline def setDestinationS3Uri(value: DestinationS3Uri): Self = StObject.set(x, "DestinationS3Uri", value.asInstanceOf[js.Any])
    
    inline def setEnableCapture(value: EnableCapture): Self = StObject.set(x, "EnableCapture", value.asInstanceOf[js.Any])
    
    inline def setEnableCaptureUndefined: Self = StObject.set(x, "EnableCapture", js.undefined)
    
    inline def setInitialSamplingPercentage(value: SamplingPercentage): Self = StObject.set(x, "InitialSamplingPercentage", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
