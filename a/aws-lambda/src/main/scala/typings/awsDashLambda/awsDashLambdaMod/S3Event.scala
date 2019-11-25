package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Event extends js.Object {
  var Records: js.Array[S3EventRecord]
}

object S3Event {
  @scala.inline
  def apply(Records: js.Array[S3EventRecord]): S3Event = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3Event]
  }
}

