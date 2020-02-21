package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BatchResultResult extends js.Object {
  var resultCode: S3BatchResultResultCode
  var resultString: String
  var taskId: String
}

object S3BatchResultResult {
  @scala.inline
  def apply(resultCode: S3BatchResultResultCode, resultString: String, taskId: String): S3BatchResultResult = {
    val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any], resultString = resultString.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3BatchResultResult]
  }
}

