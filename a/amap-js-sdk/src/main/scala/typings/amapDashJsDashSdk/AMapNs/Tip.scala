package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  var adcode: String
  var district: String
  var name: String
}

object Tip {
  @scala.inline
  def apply(adcode: String, district: String, name: String): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode, district = district, name = name)
  
    __obj.asInstanceOf[Tip]
  }
}

