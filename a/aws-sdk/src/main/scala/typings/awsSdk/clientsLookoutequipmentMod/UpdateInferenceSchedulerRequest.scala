package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInferenceSchedulerRequest extends StObject {
  
  /**
    *  A period of time (in minutes) by which inference on the data is delayed after the data starts. For instance, if you select an offset delay time of five minutes, inference will not begin on the data until the first data measurement after the five minute mark. For example, if five minutes is selected, the inference scheduler will wake up at the configured frequency with the additional five minute delay time to check the customer S3 bucket. The customer can upload data at the same frequency and they don't need to stop and restart the scheduler when uploading new data.
    */
  var DataDelayOffsetInMinutes: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataDelayOffsetInMinutes] = js.undefined
  
  /**
    *  Specifies information for the input data for the inference scheduler, including delimiter, format, and dataset location. 
    */
  var DataInputConfiguration: js.UndefOr[InferenceInputConfiguration] = js.undefined
  
  /**
    *  Specifies information for the output results from the inference scheduler, including the output S3 location. 
    */
  var DataOutputConfiguration: js.UndefOr[InferenceOutputConfiguration] = js.undefined
  
  /**
    * How often data is uploaded to the source S3 bucket for the input data. The value chosen is the length of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment starts a scheduled inference on your data. In this example, it starts once every 5 minutes. 
    */
  var DataUploadFrequency: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataUploadFrequency] = js.undefined
  
  /**
    * The name of the inference scheduler to be updated. 
    */
  var InferenceSchedulerName: InferenceSchedulerIdentifier
  
  /**
    *  The Amazon Resource Name (ARN) of a role with permission to access the data source for the inference scheduler. 
    */
  var RoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object UpdateInferenceSchedulerRequest {
  
  inline def apply(InferenceSchedulerName: InferenceSchedulerIdentifier): UpdateInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInferenceSchedulerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInferenceSchedulerRequest] (val x: Self) extends AnyVal {
    
    inline def setDataDelayOffsetInMinutes(value: DataDelayOffsetInMinutes): Self = StObject.set(x, "DataDelayOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDataDelayOffsetInMinutesUndefined: Self = StObject.set(x, "DataDelayOffsetInMinutes", js.undefined)
    
    inline def setDataInputConfiguration(value: InferenceInputConfiguration): Self = StObject.set(x, "DataInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataInputConfigurationUndefined: Self = StObject.set(x, "DataInputConfiguration", js.undefined)
    
    inline def setDataOutputConfiguration(value: InferenceOutputConfiguration): Self = StObject.set(x, "DataOutputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataOutputConfigurationUndefined: Self = StObject.set(x, "DataOutputConfiguration", js.undefined)
    
    inline def setDataUploadFrequency(value: DataUploadFrequency): Self = StObject.set(x, "DataUploadFrequency", value.asInstanceOf[js.Any])
    
    inline def setDataUploadFrequencyUndefined: Self = StObject.set(x, "DataUploadFrequency", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerIdentifier): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
