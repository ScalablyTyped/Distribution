package typings
package awsDashLambdaDashMockDashContextLib.awsDashLambdaDashMockDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Context extends js.Object {
  var Promise: stdLib.Promise[_]
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
  def done(err: js.Any, result: js.Any): stdLib.Promise[_]
  def fail(err: js.Any): stdLib.Promise[_]
  def succeed(result: js.Any): stdLib.Promise[_]
}

