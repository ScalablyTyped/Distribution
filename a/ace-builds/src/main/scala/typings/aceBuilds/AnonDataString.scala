package typings.aceBuilds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataString extends js.Object {
  var data: String
}

object AnonDataString {
  @scala.inline
  def apply(data: String): AnonDataString = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataString]
  }
}

