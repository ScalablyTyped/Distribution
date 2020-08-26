package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BatchResult extends js.Object {
  var invocationId: String = js.native
  var invocationSchemaVersion: String = js.native
  var results: js.Array[S3BatchResultResult] = js.native
  var treatMissingKeysAs: S3BatchResultResultCode = js.native
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
  @scala.inline
  implicit class S3BatchResultOps[Self <: S3BatchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvocationId(value: String): Self = this.set("invocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvocationSchemaVersion(value: String): Self = this.set("invocationSchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: S3BatchResultResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[S3BatchResultResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setTreatMissingKeysAs(value: S3BatchResultResultCode): Self = this.set("treatMissingKeysAs", value.asInstanceOf[js.Any])
  }
  
}

