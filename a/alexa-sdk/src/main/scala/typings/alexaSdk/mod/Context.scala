package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var AudioPlayer: js.UndefOr[typings.alexaSdk.mod.AudioPlayer] = js.native
  var System: js.UndefOr[typings.alexaSdk.mod.System] = js.native
  var awsRequestId: String = js.native
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var invokeid: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var memoryLimitInMB: String = js.native
}

object Context {
  @scala.inline
  def apply(
    awsRequestId: String,
    callbackWaitsForEmptyEventLoop: Boolean,
    functionName: String,
    functionVersion: String,
    invokeid: String,
    logGroupName: String,
    logStreamName: String,
    memoryLimitInMB: String
  ): Context = {
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId.asInstanceOf[js.Any], callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], invokeid = invokeid.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any], memoryLimitInMB = memoryLimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsRequestId(value: String): Self = this.set("awsRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = this.set("callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionName(value: String): Self = this.set("functionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunctionVersion(value: String): Self = this.set("functionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvokeid(value: String): Self = this.set("invokeid", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogGroupName(value: String): Self = this.set("logGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogStreamName(value: String): Self = this.set("logStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMemoryLimitInMB(value: String): Self = this.set("memoryLimitInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudioPlayer(value: AudioPlayer): Self = this.set("AudioPlayer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioPlayer: Self = this.set("AudioPlayer", js.undefined)
    @scala.inline
    def setSystem(value: System): Self = this.set("System", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystem: Self = this.set("System", js.undefined)
  }
  
}

