package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistrictSearchResult extends js.Object {
  var districtList: js.Array[District]
  var info: java.lang.String
}

object DistrictSearchResult {
  @scala.inline
  def apply(districtList: js.Array[District], info: java.lang.String): DistrictSearchResult = {
    val __obj = js.Dynamic.literal(districtList = districtList, info = info)
  
    __obj.asInstanceOf[DistrictSearchResult]
  }
}

