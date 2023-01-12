package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQuantumTaskRequest extends StObject {
  
  /**
    * The action associated with the task.
    */
  var action: JsonValue
  
  /**
    * The client token associated with the request.
    */
  var clientToken: String64
  
  /**
    * The ARN of the device to run the task on.
    */
  var deviceArn: DeviceArn
  
  /**
    * The parameters for the device to run the task on.
    */
  var deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString] = js.undefined
  
  /**
    * The token for an Amazon Braket job that associates it with the quantum task.
    */
  var jobToken: js.UndefOr[JobToken] = js.undefined
  
  /**
    * The S3 bucket to store task result files in.
    */
  var outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString
  
  /**
    * The key prefix for the location in the S3 bucket to store task results in.
    */
  var outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString
  
  /**
    * The number of shots to use for the task.
    */
  var shots: CreateQuantumTaskRequestShotsLong
  
  /**
    * Tags to be added to the quantum task you're creating.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateQuantumTaskRequest {
  
  inline def apply(
    action: JsonValue,
    clientToken: String64,
    deviceArn: DeviceArn,
    outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString,
    outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString,
    shots: CreateQuantumTaskRequestShotsLong
  ): CreateQuantumTaskRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clientToken = clientToken.asInstanceOf[js.Any], deviceArn = deviceArn.asInstanceOf[js.Any], outputS3Bucket = outputS3Bucket.asInstanceOf[js.Any], outputS3KeyPrefix = outputS3KeyPrefix.asInstanceOf[js.Any], shots = shots.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQuantumTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQuantumTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: JsonValue): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String64): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceParameters(value: CreateQuantumTaskRequestDeviceParametersString): Self = StObject.set(x, "deviceParameters", value.asInstanceOf[js.Any])
    
    inline def setDeviceParametersUndefined: Self = StObject.set(x, "deviceParameters", js.undefined)
    
    inline def setJobToken(value: JobToken): Self = StObject.set(x, "jobToken", value.asInstanceOf[js.Any])
    
    inline def setJobTokenUndefined: Self = StObject.set(x, "jobToken", js.undefined)
    
    inline def setOutputS3Bucket(value: CreateQuantumTaskRequestOutputS3BucketString): Self = StObject.set(x, "outputS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setOutputS3KeyPrefix(value: CreateQuantumTaskRequestOutputS3KeyPrefixString): Self = StObject.set(x, "outputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setShots(value: CreateQuantumTaskRequestShotsLong): Self = StObject.set(x, "shots", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
