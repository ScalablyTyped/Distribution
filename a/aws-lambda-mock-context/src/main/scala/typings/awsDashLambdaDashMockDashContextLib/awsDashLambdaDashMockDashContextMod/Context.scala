package typings
package awsDashLambdaDashMockDashContextLib.awsDashLambdaDashMockDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var Promise: js.Promise[_]
  var awsRequestId: java.lang.String
  var callbackWaitsForEmptyEventLoop: scala.Boolean
  var functionName: java.lang.String
  var functionVersion: java.lang.String
  var getRemainingTimeInMillis: scala.Double
  var invokedFunctionArn: java.lang.String
  var invokeid: java.lang.String
  var logGroupName: java.lang.String
  var logStreamName: java.lang.String
  var memoryLimitInMB: java.lang.String
  def done(err: js.Any, result: js.Any): js.Promise[_]
  def fail(err: js.Any): js.Promise[_]
  def succeed(result: js.Any): js.Promise[_]
}

object Context {
  @scala.inline
  def apply(
    Promise: js.Promise[_],
    awsRequestId: java.lang.String,
    callbackWaitsForEmptyEventLoop: scala.Boolean,
    done: js.Function2[js.Any, js.Any, js.Promise[_]],
    fail: js.Function1[js.Any, js.Promise[_]],
    functionName: java.lang.String,
    functionVersion: java.lang.String,
    getRemainingTimeInMillis: scala.Double,
    invokedFunctionArn: java.lang.String,
    invokeid: java.lang.String,
    logGroupName: java.lang.String,
    logStreamName: java.lang.String,
    memoryLimitInMB: java.lang.String,
    succeed: js.Function1[js.Any, js.Promise[_]]
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Promise")(Promise)
    __obj.updateDynamic("awsRequestId")(awsRequestId)
    __obj.updateDynamic("callbackWaitsForEmptyEventLoop")(callbackWaitsForEmptyEventLoop)
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("fail")(fail)
    __obj.updateDynamic("functionName")(functionName)
    __obj.updateDynamic("functionVersion")(functionVersion)
    __obj.updateDynamic("getRemainingTimeInMillis")(getRemainingTimeInMillis)
    __obj.updateDynamic("invokedFunctionArn")(invokedFunctionArn)
    __obj.updateDynamic("invokeid")(invokeid)
    __obj.updateDynamic("logGroupName")(logGroupName)
    __obj.updateDynamic("logStreamName")(logStreamName)
    __obj.updateDynamic("memoryLimitInMB")(memoryLimitInMB)
    __obj.updateDynamic("succeed")(succeed)
    __obj.asInstanceOf[Context]
  }
}

