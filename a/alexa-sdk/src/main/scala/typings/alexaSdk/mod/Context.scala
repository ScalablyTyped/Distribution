package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var AudioPlayer: js.UndefOr[typings.alexaSdk.mod.AudioPlayer] = js.undefined
  var System: js.UndefOr[typings.alexaSdk.mod.System] = js.undefined
  var awsRequestId: String
  var callbackWaitsForEmptyEventLoop: Boolean
  var functionName: String
  var functionVersion: String
  var invokeid: String
  var logGroupName: String
  var logStreamName: String
  var memoryLimitInMB: String
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
    memoryLimitInMB: String,
    AudioPlayer: AudioPlayer = null,
    System: System = null
  ): Context = {
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId.asInstanceOf[js.Any], callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], functionVersion = functionVersion.asInstanceOf[js.Any], invokeid = invokeid.asInstanceOf[js.Any], logGroupName = logGroupName.asInstanceOf[js.Any], logStreamName = logStreamName.asInstanceOf[js.Any], memoryLimitInMB = memoryLimitInMB.asInstanceOf[js.Any])
    if (AudioPlayer != null) __obj.updateDynamic("AudioPlayer")(AudioPlayer.asInstanceOf[js.Any])
    if (System != null) __obj.updateDynamic("System")(System.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

