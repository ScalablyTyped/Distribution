package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var AudioPlayer: js.UndefOr[AudioPlayer] = js.undefined
  var System: js.UndefOr[System] = js.undefined
  var awsRequestId: java.lang.String
  var callbackWaitsForEmptyEventLoop: scala.Boolean
  var functionName: java.lang.String
  var functionVersion: java.lang.String
  var invokeid: java.lang.String
  var logGroupName: java.lang.String
  var logStreamName: java.lang.String
  var memoryLimitInMB: java.lang.String
}

object Context {
  @scala.inline
  def apply(
    awsRequestId: java.lang.String,
    callbackWaitsForEmptyEventLoop: scala.Boolean,
    functionName: java.lang.String,
    functionVersion: java.lang.String,
    invokeid: java.lang.String,
    logGroupName: java.lang.String,
    logStreamName: java.lang.String,
    memoryLimitInMB: java.lang.String,
    AudioPlayer: AudioPlayer = null,
    System: System = null
  ): Context = {
    val __obj = js.Dynamic.literal(awsRequestId = awsRequestId, callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop, functionName = functionName, functionVersion = functionVersion, invokeid = invokeid, logGroupName = logGroupName, logStreamName = logStreamName, memoryLimitInMB = memoryLimitInMB)
    if (AudioPlayer != null) __obj.updateDynamic("AudioPlayer")(AudioPlayer)
    if (System != null) __obj.updateDynamic("System")(System)
    __obj.asInstanceOf[Context]
  }
}

