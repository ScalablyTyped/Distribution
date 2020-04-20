package typings.awsLambda.s3BatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BatchEvent extends js.Object {
  var invocationId: String
  var invocationSchemaVersion: String
  var job: S3BatchEventJob
  var tasks: js.Array[S3BatchEventTask]
}

object S3BatchEvent {
  @scala.inline
  def apply(
    invocationId: String,
    invocationSchemaVersion: String,
    job: S3BatchEventJob,
    tasks: js.Array[S3BatchEventTask]
  ): S3BatchEvent = {
    val __obj = js.Dynamic.literal(invocationId = invocationId.asInstanceOf[js.Any], invocationSchemaVersion = invocationSchemaVersion.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3BatchEvent]
  }
}

