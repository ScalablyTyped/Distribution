package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessArea extends js.Object {
  var id: String
  var location: String
  var name: String
}

object BusinessArea {
  @scala.inline
  def apply(id: String, location: String, name: String): BusinessArea = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BusinessArea]
  }
}

