package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistrictSearchResult extends js.Object {
  var districtList: js.Array[District]
  var info: String
}

object DistrictSearchResult {
  @scala.inline
  def apply(districtList: js.Array[District], info: String): DistrictSearchResult = {
    val __obj = js.Dynamic.literal(districtList = districtList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchResult]
  }
}

