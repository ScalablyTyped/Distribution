package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.Discount
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.Groupbuy
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.PoiPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adcode extends js.Object {
  /**
    * 所在区域编码
    */
  var adcode: String
  /**
    * 所在行政区名称
    */
  var adname: String
  /**
    * 所在城市编码
    */
  var citycode: String
  /**
    * 所在城市名称
    */
  var cityname: String
  /**
    * @deprecated 是否有优惠信息
    */
  var discount: Boolean
  /**
    * @deprecated 优惠信息
    */
  var discounts: js.UndefOr[js.Array[Discount]] = js.undefined
  /**
    * 电子邮箱
    */
  var email: String
  /**
    * 入口经纬度
    */
  var entr_location: LngLat | Null
  /**
    * 出口经纬度
    */
  var exit_location: LngLat | Null
  /**
    * @deprecated 是否有团购信息
    */
  var groupbuy: Boolean
  /**
    * @deprecated 团购信息
    */
  var groupbuys: js.UndefOr[js.Array[Groupbuy]] = js.undefined
  /**
    * 所在省份编码
    */
  var pcode: String
  /**
    * 照片
    */
  var photos: js.Array[PoiPhoto]
  /**
    * 所在省份
    */
  var pname: String
  /**
    * 邮编
    */
  var postcode: String
  /**
    * 网址
    */
  var website: String
}

object Anon_Adcode {
  @scala.inline
  def apply(
    adcode: String,
    adname: String,
    citycode: String,
    cityname: String,
    discount: Boolean,
    email: String,
    groupbuy: Boolean,
    pcode: String,
    photos: js.Array[PoiPhoto],
    pname: String,
    postcode: String,
    website: String,
    discounts: js.Array[Discount] = null,
    entr_location: LngLat = null,
    exit_location: LngLat = null,
    groupbuys: js.Array[Groupbuy] = null
  ): Anon_Adcode = {
    val __obj = js.Dynamic.literal(adcode = adcode, adname = adname, citycode = citycode, cityname = cityname, discount = discount, email = email, groupbuy = groupbuy, pcode = pcode, photos = photos, pname = pname, postcode = postcode, website = website)
    if (discounts != null) __obj.updateDynamic("discounts")(discounts)
    if (entr_location != null) __obj.updateDynamic("entr_location")(entr_location)
    if (exit_location != null) __obj.updateDynamic("exit_location")(exit_location)
    if (groupbuys != null) __obj.updateDynamic("groupbuys")(groupbuys)
    __obj.asInstanceOf[Anon_Adcode]
  }
}

