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
  def PermanentFailure: typings.awsLambda.awsLambdaStrings.PermanentFailure = "PermanentFailure".asInstanceOf[typings.awsLambda.awsLambdaStrings.PermanentFailure]
  @scala.inline
  def Succeeded: Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
  @scala.inline
  def TemporaryFailure: typings.awsLambda.awsLambdaStrings.TemporaryFailure = "TemporaryFailure".asInstanceOf[typings.awsLambda.awsLambdaStrings.TemporaryFailure]
}

