package typings.awsLambda.s3BatchMod

import typings.awsLambda.awsLambdaStrings.Succeeded_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.awsLambdaStrings.Succeeded_
  - typings.awsLambda.awsLambdaStrings.TemporaryFailure
  - typings.awsLambda.awsLambdaStrings.PermanentFailure
*/
trait S3BatchResultResultCode extends js.Object

object S3BatchResultResultCode {
  @scala.inline
  def PermanentFailure: typings.awsLambda.awsLambdaStrings.PermanentFailure = this.cast("PermanentFailure")
  @scala.inline
  def Succeeded: Succeeded_ = this.cast("Succeeded")
  @scala.inline
  def TemporaryFailure: typings.awsLambda.awsLambdaStrings.TemporaryFailure = this.cast("TemporaryFailure")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

