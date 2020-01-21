package typings.amapJsApiDistrictSearch.AMap.DistrictSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district
  - typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area
*/
trait Level extends js.Object

object Level {
  @scala.inline
  def biz_area: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.biz_area = this.cast("biz_area")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def city: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.city = this.cast("city")
  @scala.inline
  def country: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.country = this.cast("country")
  @scala.inline
  def district: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.district = this.cast("district")
  @scala.inline
  def province: typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.province = this.cast("province")
}

