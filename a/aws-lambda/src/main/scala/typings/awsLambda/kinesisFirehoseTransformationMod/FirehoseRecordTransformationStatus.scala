package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.awsLambdaStrings.Ok
  - typings.awsLambda.awsLambdaStrings.Dropped
  - typings.awsLambda.awsLambdaStrings.ProcessingFailed
*/
trait FirehoseRecordTransformationStatus extends js.Object

object FirehoseRecordTransformationStatus {
  @scala.inline
  def Dropped: typings.awsLambda.awsLambdaStrings.Dropped = this.cast("Dropped")
  @scala.inline
  def Ok: typings.awsLambda.awsLambdaStrings.Ok = this.cast("Ok")
  @scala.inline
  def ProcessingFailed: typings.awsLambda.awsLambdaStrings.ProcessingFailed = this.cast("ProcessingFailed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

