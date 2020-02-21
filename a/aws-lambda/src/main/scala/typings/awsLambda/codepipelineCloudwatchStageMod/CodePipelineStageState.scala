package typings.awsLambda.codepipelineCloudwatchStageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.awsLambdaStrings.STARTED
  - typings.awsLambda.awsLambdaStrings.SUCCEEDED
  - typings.awsLambda.awsLambdaStrings.RESUMED
  - typings.awsLambda.awsLambdaStrings.FAILED
  - typings.awsLambda.awsLambdaStrings.CANCELED
*/
trait CodePipelineStageState extends js.Object

object CodePipelineStageState {
  @scala.inline
  def CANCELED: typings.awsLambda.awsLambdaStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def FAILED: typings.awsLambda.awsLambdaStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def RESUMED: typings.awsLambda.awsLambdaStrings.RESUMED = this.cast("RESUMED")
  @scala.inline
  def STARTED: typings.awsLambda.awsLambdaStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def SUCCEEDED: typings.awsLambda.awsLambdaStrings.SUCCEEDED = this.cast("SUCCEEDED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

