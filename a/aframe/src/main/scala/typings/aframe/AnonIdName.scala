package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdName extends js.Object {
  var id: String
  var name: String
  var newData: js.Any
  var oldData: js.Any
}

object AnonIdName {
  @scala.inline
  def apply(id: String, name: String, newData: js.Any, oldData: js.Any): AnonIdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdName]
  }
}

