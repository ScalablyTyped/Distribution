package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResource extends js.Object {
  var Resource: String | js.Array[String]
}

object AnonResource {
  @scala.inline
  def apply(Resource: String | js.Array[String]): AnonResource = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResource]
  }
}

