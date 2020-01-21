package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotResource extends js.Object {
  var NotResource: String | js.Array[String]
}

object AnonNotResource {
  @scala.inline
  def apply(NotResource: String | js.Array[String]): AnonNotResource = {
    val __obj = js.Dynamic.literal(NotResource = NotResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNotResource]
  }
}

