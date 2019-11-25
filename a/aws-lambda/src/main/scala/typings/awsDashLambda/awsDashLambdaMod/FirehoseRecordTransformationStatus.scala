package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashLambda.awsDashLambdaStrings.Ok
  - typings.awsDashLambda.awsDashLambdaStrings.Dropped
  - typings.awsDashLambda.awsDashLambdaStrings.ProcessingFailed
*/
trait FirehoseRecordTransformationStatus extends js.Object

object FirehoseRecordTransformationStatus {
  @scala.inline
  def Dropped: typings.awsDashLambda.awsDashLambdaStrings.Dropped = this.cast("Dropped")
  @scala.inline
  def Ok: typings.awsDashLambda.awsDashLambdaStrings.Ok = this.cast("Ok")
  @scala.inline
  def ProcessingFailed: typings.awsDashLambda.awsDashLambdaStrings.ProcessingFailed = this.cast("ProcessingFailed")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

