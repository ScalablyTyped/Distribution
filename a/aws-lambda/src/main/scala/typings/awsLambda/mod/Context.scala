package typings.awsLambda.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var awsRequestId: String = js.native
  // Properties
  var callbackWaitsForEmptyEventLoop: Boolean = js.native
  var clientContext: js.UndefOr[ClientContext] = js.native
  var functionName: String = js.native
  var functionVersion: String = js.native
  var identity: js.UndefOr[CognitoIdentity] = js.native
  var invokedFunctionArn: String = js.native
  var logGroupName: String = js.native
  var logStreamName: String = js.native
  var memoryLimitInMB: String = js.native
  // Functions for compatibility with earlier Node.js Runtime v0.10.42
  // For more details see http://docs.aws.amazon.com/lambda/latest/dg/nodejs-prog-model-using-old-runtime.html#nodejs-prog-model-oldruntime-context-methods
  def done(): Unit = js.native
  def done(error: Error): Unit = js.native
  def done(error: Error, result: js.Any): Unit = js.native
  def fail(error: String): Unit = js.native
  def fail(error: Error): Unit = js.native
  // Functions
  def getRemainingTimeInMillis(): Double = js.native
  def succeed(messageOrObject: js.Any): Unit = js.native
  def succeed(message: String, `object`: js.Any): Unit = js.native
}

