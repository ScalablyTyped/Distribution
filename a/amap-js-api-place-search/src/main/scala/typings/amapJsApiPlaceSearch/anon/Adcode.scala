package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Discount
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Groupbuy
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiPhoto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adcode extends js.Object {
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

object Adcode {
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
  ): Adcode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], adname = adname.asInstanceOf[js.Any], citycode = citycode.asInstanceOf[js.Any], cityname = cityname.asInstanceOf[js.Any], discount = discount.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], groupbuy = groupbuy.asInstanceOf[js.Any], pcode = pcode.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], pname = pname.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any], website = website.asInstanceOf[js.Any], entr_location = entr_location.asInstanceOf[js.Any], exit_location = exit_location.asInstanceOf[js.Any])
    if (discounts != null) __obj.updateDynamic("discounts")(discounts.asInstanceOf[js.Any])
    if (groupbuys != null) __obj.updateDynamic("groupbuys")(groupbuys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adcode]
  }
}

