package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlaceholder extends js.Object {
  var placeholder: String
  var rangePlaceholder: js.Array[String]
}

object AnonPlaceholder {
  @scala.inline
  def apply(placeholder: String, rangePlaceholder: js.Array[String]): AnonPlaceholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], rangePlaceholder = rangePlaceholder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPlaceholder]
  }
}

