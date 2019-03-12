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
    done: (js.Any, js.Any) => js.Promise[_],
    fail: js.Any => js.Promise[_],
    functionName: java.lang.String,
    functionVersion: java.lang.String,
    getRemainingTimeInMillis: scala.Double,
    invokedFunctionArn: java.lang.String,
    invokeid: java.lang.String,
    logGroupName: java.lang.String,
    logStreamName: java.lang.String,
    memoryLimitInMB: java.lang.String,
    succeed: js.Any => js.Promise[_]
  ): Context = {
    val __obj = js.Dynamic.literal(Promise = Promise, awsRequestId = awsRequestId, callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop, done = js.Any.fromFunction2(done), fail = js.Any.fromFunction1(fail), functionName = functionName, functionVersion = functionVersion, getRemainingTimeInMillis = getRemainingTimeInMillis, invokedFunctionArn = invokedFunctionArn, invokeid = invokeid, logGroupName = logGroupName, logStreamName = logStreamName, memoryLimitInMB = memoryLimitInMB, succeed = js.Any.fromFunction1(succeed))
  
    __obj.asInstanceOf[Context]
  }
}

