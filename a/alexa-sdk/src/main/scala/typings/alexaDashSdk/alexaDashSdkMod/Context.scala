package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var AudioPlayer: js.UndefOr[typings.alexaDashSdk.alexaDashSdkMod.AudioPlayer] = js.undefined
  var System: js.UndefOr[typings.alexaDashSdk.alexaDashSdkMod.System] = js.undefined
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
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId, callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop, functionName = functionName, functionVersion = functionVersion, invokeid = invokeid, logGroupName = logGroupName, logStreamName = logStreamName, memoryLimitInMB = memoryLimitInMB)
    if (AudioPlayer != null) __obj.updateDynamic("AudioPlayer")(AudioPlayer)
    if (System != null) __obj.updateDynamic("System")(System)
    __obj.asInstanceOf[Context]
  }
}

