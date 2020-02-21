package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BatchResult extends js.Object {
  var invocationId: String
  var invocationSchemaVersion: String
  var results: js.Array[S3BatchResultResult]
  var treatMissingKeysAs: S3BatchResultResultCode
}

object S3BatchResult {
  @scala.inline
  def apply(
    invocationId: String,
    invocationSchemaVersion: String,
    results: js.Array[S3BatchResultResult],
    treatMissingKeysAs: S3BatchResultResultCode
  ): S3BatchResult = {
    val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], treatMissingKeysAs = treatMissingKeysAs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3BatchResult]
  }
}

