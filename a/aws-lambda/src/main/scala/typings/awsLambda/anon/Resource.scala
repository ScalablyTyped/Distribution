package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var Resource: String | js.Array[String]
}

object Resource {
  @scala.inline
  def apply(Resource: String | js.Array[String]): Resource = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

