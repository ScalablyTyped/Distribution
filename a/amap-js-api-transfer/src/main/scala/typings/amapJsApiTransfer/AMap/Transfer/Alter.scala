package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alter extends js.Object {
  /**
    * 备选方案ID
    */
  var id: String
  /**
    * 备选线路名称
    */
  var name: String
}

object Alter {
  @scala.inline
  def apply(id: String, name: String): Alter = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alter]
  }
}

