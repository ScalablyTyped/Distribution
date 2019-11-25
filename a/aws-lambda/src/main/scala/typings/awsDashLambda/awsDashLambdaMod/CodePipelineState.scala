package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaStrings.STARTED
  - typings.awsDashLambda.awsDashLambdaStrings.SUCCEEDED
  - typings.awsDashLambda.awsDashLambdaStrings.RESUMED
  - typings.awsDashLambda.awsDashLambdaStrings.FAILED
  - typings.awsDashLambda.awsDashLambdaStrings.CANCELED
  - typings.awsDashLambda.awsDashLambdaStrings.SUPERSEDED
*/
trait CodePipelineState extends js.Object

object CodePipelineState {
  @scala.inline
  def CANCELED: typings.awsDashLambda.awsDashLambdaStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def FAILED: typings.awsDashLambda.awsDashLambdaStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def RESUMED: typings.awsDashLambda.awsDashLambdaStrings.RESUMED = this.cast("RESUMED")
  @scala.inline
  def STARTED: typings.awsDashLambda.awsDashLambdaStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def SUCCEEDED: typings.awsDashLambda.awsDashLambdaStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  def SUPERSEDED: typings.awsDashLambda.awsDashLambdaStrings.SUPERSEDED = this.cast("SUPERSEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

