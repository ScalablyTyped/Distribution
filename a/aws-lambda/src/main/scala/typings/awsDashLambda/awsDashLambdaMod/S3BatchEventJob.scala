package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3BatchEventJob extends js.Object {
  var id: String
}

object S3BatchEventJob {
  @scala.inline
  def apply(id: String): S3BatchEventJob = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[S3BatchEventJob]
  }
}

