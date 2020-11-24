package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQuantumTaskRequest extends js.Object {
  
  /**
    * The action associated with the task.
    */
  var action: JsonValue = js.native
  
  /**
    * The client token associated with the request.
    */
  var clientToken: String64 = js.native
  
  /**
    * The ARN of the device to run the task on.
    */
  var deviceArn: DeviceArn = js.native
  
  /**
    * The parameters for the device to run the task on.
    */
  var deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString] = js.native
  
  /**
    * The S3 bucket to store task result files in.
    */
  var outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString = js.native
  
  /**
    * The key prefix for the location in the S3 bucket to store task results in.
    */
  var outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString = js.native
  
  /**
    * The number of shots to use for the task.
    */
  var shots: CreateQuantumTaskRequestShotsLong = js.native
  
  /**
    * Tags to be added to the quantum task you're creating.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object CreateQuantumTaskRequest {
  
  @scala.inline
  def apply(
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
  implicit class CreateQuantumTaskRequestOps[Self <: CreateQuantumTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: JsonValue): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String64): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArn(value: DeviceArn): Self = this.set("deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3Bucket(value: CreateQuantumTaskRequestOutputS3BucketString): Self = this.set("outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3KeyPrefix(value: CreateQuantumTaskRequestOutputS3KeyPrefixString): Self = this.set("outputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShots(value: CreateQuantumTaskRequestShotsLong): Self = this.set("shots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceParameters(value: CreateQuantumTaskRequestDeviceParametersString): Self = this.set("deviceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceParameters: Self = this.set("deviceParameters", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
