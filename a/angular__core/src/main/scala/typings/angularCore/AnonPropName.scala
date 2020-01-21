package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropName extends js.Object {
  var propName: String
  var templateName: String
}

object AnonPropName {
  @scala.inline
  def apply(propName: String, templateName: String): AnonPropName = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPropName]
  }
}

