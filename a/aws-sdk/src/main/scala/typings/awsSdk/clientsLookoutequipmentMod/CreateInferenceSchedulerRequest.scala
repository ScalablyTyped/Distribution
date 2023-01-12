package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceSchedulerRequest extends StObject {
  
  /**
    *  A unique identifier for the request. If you do not set the client request token, Amazon Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    * The interval (in minutes) of planned delay at the start of each inference segment. For example, if inference is set to run every ten minutes, the delay is set to five minutes and the time is 09:08. The inference scheduler will wake up at the configured interval (which, without a delay configured, would be 09:10) plus the additional five minute delay time (so 09:15) to check your Amazon S3 bucket. The delay provides a buffer for you to upload data at the same frequency, so that you don't have to stop and restart the scheduler when uploading new data. For more information, see Understanding the inference process.
    */
  var DataDelayOffsetInMinutes: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.DataDelayOffsetInMinutes] = js.undefined
  
  /**
    * Specifies configuration information for the input data for the inference scheduler, including delimiter, format, and dataset location. 
    */
  var DataInputConfiguration: InferenceInputConfiguration
  
  /**
    * Specifies configuration information for the output results for the inference scheduler, including the S3 location for the output. 
    */
  var DataOutputConfiguration: InferenceOutputConfiguration
  
  /**
    *  How often data is uploaded to the source Amazon S3 bucket for the input data. The value chosen is the length of time between data uploads. For instance, if you select 5 minutes, Amazon Lookout for Equipment will upload the real-time data to the source bucket once every 5 minutes. This frequency also determines how often Amazon Lookout for Equipment runs inference on your data. For more information, see Understanding the inference process.
    */
  var DataUploadFrequency: typings.awsSdk.clientsLookoutequipmentMod.DataUploadFrequency
  
  /**
    * The name of the inference scheduler being created. 
    */
  var InferenceSchedulerName: typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerName
  
  /**
    * The name of the previously trained ML model being used to create the inference scheduler. 
    */
  var ModelName: typings.awsSdk.clientsLookoutequipmentMod.ModelName
  
  /**
    * The Amazon Resource Name (ARN) of a role with permission to access the data source being used for the inference. 
    */
  var RoleArn: IamRoleArn
  
  /**
    * Provides the identifier of the KMS key used to encrypt inference scheduler data by Amazon Lookout for Equipment. 
    */
  var ServerSideKmsKeyId: js.UndefOr[NameOrArn] = js.undefined
  
  /**
    * Any tags associated with the inference scheduler. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateInferenceSchedulerRequest {
  
  inline def apply(
    ClientToken: IdempotenceToken,
    DataInputConfiguration: InferenceInputConfiguration,
    DataOutputConfiguration: InferenceOutputConfiguration,
    DataUploadFrequency: DataUploadFrequency,
    InferenceSchedulerName: InferenceSchedulerName,
    ModelName: ModelName,
    RoleArn: IamRoleArn
  ): CreateInferenceSchedulerRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], DataInputConfiguration = DataInputConfiguration.asInstanceOf[js.Any], DataOutputConfiguration = DataOutputConfiguration.asInstanceOf[js.Any], DataUploadFrequency = DataUploadFrequency.asInstanceOf[js.Any], InferenceSchedulerName = InferenceSchedulerName.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInferenceSchedulerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInferenceSchedulerRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDataDelayOffsetInMinutes(value: DataDelayOffsetInMinutes): Self = StObject.set(x, "DataDelayOffsetInMinutes", value.asInstanceOf[js.Any])
    
    inline def setDataDelayOffsetInMinutesUndefined: Self = StObject.set(x, "DataDelayOffsetInMinutes", js.undefined)
    
    inline def setDataInputConfiguration(value: InferenceInputConfiguration): Self = StObject.set(x, "DataInputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataOutputConfiguration(value: InferenceOutputConfiguration): Self = StObject.set(x, "DataOutputConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataUploadFrequency(value: DataUploadFrequency): Self = StObject.set(x, "DataUploadFrequency", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: IamRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyId(value: NameOrArn): Self = StObject.set(x, "ServerSideKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setServerSideKmsKeyIdUndefined: Self = StObject.set(x, "ServerSideKmsKeyId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
