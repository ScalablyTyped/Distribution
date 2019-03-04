package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessArea extends js.Object {
  var id: java.lang.String
  var location: java.lang.String
  var name: java.lang.String
}

object BusinessArea {
  @scala.inline
  def apply(id: java.lang.String, location: java.lang.String, name: java.lang.String): BusinessArea = {
    val __obj = js.Dynamic.literal(id = id, location = location, name = name)
  
    __obj.asInstanceOf[BusinessArea]
  }
}

