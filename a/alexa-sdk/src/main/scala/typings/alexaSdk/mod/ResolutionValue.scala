package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionValue extends js.Object {
  var id: String
  var name: String
}

object ResolutionValue {
  @scala.inline
  def apply(id: String, name: String): ResolutionValue = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionValue]
  }
}

