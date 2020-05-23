package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropName extends js.Object {
  var propName: String
  var templateName: String
}

object PropName {
  @scala.inline
  def apply(propName: String, templateName: String): PropName = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropName]
  }
}

