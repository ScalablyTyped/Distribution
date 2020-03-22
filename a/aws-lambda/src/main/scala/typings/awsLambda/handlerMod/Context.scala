package typings.awsLambda.handlerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var awsRequestId: String = js.native
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
  // No longer documented, so they are deprecated, but they still work
  // as of the 12.x runtime, so they are not removed from the types.
  /** @deprecated Use handler callback or promise result */
  def done(): Unit = js.native
  def done(error: Error): Unit = js.native
  def done(error: Error, result: js.Any): Unit = js.native
  def fail(error: String): Unit = js.native
  /** @deprecated Use handler callback with first argument or reject a promise result */
  def fail(error: Error): Unit = js.native
  def getRemainingTimeInMillis(): Double = js.native
  /** @deprecated Use handler callback with second argument or resolve a promise result */
  def succeed(messageOrObject: js.Any): Unit = js.native
  // Unclear what behavior this is supposed to have, I couldn't find any still extant reference,
  // and it behaves like the above, ignoring the object parameter.
  /** @deprecated Use handler callback or promise result */
  def succeed(message: String, `object`: js.Any): Unit = js.native
}

