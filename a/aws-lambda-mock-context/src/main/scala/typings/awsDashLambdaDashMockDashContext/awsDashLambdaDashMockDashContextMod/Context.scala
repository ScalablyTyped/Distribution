package typings.awsDashLambdaDashMockDashContext.awsDashLambdaDashMockDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var Promise: js.Promise[_]
  var awsRequestId: String
  var callbackWaitsForEmptyEventLoop: Boolean
  var functionName: String
  var functionVersion: String
  var getRemainingTimeInMillis: Double
  var invokedFunctionArn: String
  var invokeid: String
  var logGroupName: String
  var logStreamName: String
  var memoryLimitInMB: String
  def done(err: js.Any, result: js.Any): js.Promise[_]
  def fail(err: js.Any): js.Promise[_]
  def succeed(result: js.Any): js.Promise[_]
}

object Context {
  @scala.inline
  def apply(
    Promise: js.Promise[_],
    awsRequestId: String,
    callbackWaitsForEmptyEventLoop: Boolean,
    done: (js.Any, js.Any) => js.Promise[_],
    fail: js.Any => js.Promise[_],
    functionName: String,
    functionVersion: String,
    getRemainingTimeInMillis: Double,
    invokedFunctionArn: String,
    invokeid: String,
    logGroupName: String,
    logStreamName: String,
    memoryLimitInMB: String,
    succeed: js.Any => js.Promise[_]
  ): Context = {
    val __obj = js.Dynamic.literal(Promise = Promise, awsRequestId = awsRequestId, callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop, done = js.Any.fromFunction2(done), fail = js.Any.fromFunction1(fail), functionName = functionName, functionVersion = functionVersion, getRemainingTimeInMillis = getRemainingTimeInMillis, invokedFunctionArn = invokedFunctionArn, invokeid = invokeid, logGroupName = logGroupName, logStreamName = logStreamName, memoryLimitInMB = memoryLimitInMB, succeed = js.Any.fromFunction1(succeed))
  
    __obj.asInstanceOf[Context]
  }
}

