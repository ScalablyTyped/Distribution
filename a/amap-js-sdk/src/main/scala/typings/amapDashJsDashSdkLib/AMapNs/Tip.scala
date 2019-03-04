package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tip extends js.Object {
  var adcode: java.lang.String
  var district: java.lang.String
  var name: java.lang.String
}

object Tip {
  @scala.inline
  def apply(adcode: java.lang.String, district: java.lang.String, name: java.lang.String): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode, district = district, name = name)
  
    __obj.asInstanceOf[Tip]
  }
}

