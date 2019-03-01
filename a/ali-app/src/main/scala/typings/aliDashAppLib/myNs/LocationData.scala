package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 位置 https://docs.alipay.com/mini/api/location
trait LocationData extends js.Object {
  /** 精确度，单位m */
  var accuracy: java.lang.String
  /**
  		 * 城市(type>0生效)
  		 */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 城市级别的地区代码(type>0生效)
  		 */
  var cityAdcode: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 国家(type>0生效)
  		 */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 国家编号 (type>0生效)
  		 */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 区县(type>0生效)
  		 */
  var district: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 区县级别的地区代码(type>0生效)
  		 */
  var districtAdcode: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 水平精确度，单位m
  		 */
  var horizontalAccuracy: java.lang.String
  /** 纬度 */
  var latitude: java.lang.String
  /** 经度 */
  var longitude: java.lang.String
  /**
  		 * 需要POI级别逆地理的才会有的字段, 定位点附近的 POI 信息，结构是：{ name, address } （type > 2生效）
  		 */
  var pois: js.UndefOr[js.Array[aliDashAppLib.Anon_Address]] = js.undefined
  /**
  		 * 省份(type>0生效)
  		 */
  var province: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * 需要街道级别逆地理的才会有的字段,街道门牌信息，结构是：{ street, number } (type > 1生效)
  		 */
  var streetNumber: js.UndefOr[aliDashAppLib.Anon_Number] = js.undefined
}

object LocationData {
  @scala.inline
  def apply(
    accuracy: java.lang.String,
    horizontalAccuracy: java.lang.String,
    latitude: java.lang.String,
    longitude: java.lang.String,
    city: java.lang.String = null,
    cityAdcode: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    district: java.lang.String = null,
    districtAdcode: java.lang.String = null,
    pois: js.Array[aliDashAppLib.Anon_Address] = null,
    province: java.lang.String = null,
    streetNumber: aliDashAppLib.Anon_Number = null
  ): LocationData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accuracy")(accuracy)
    __obj.updateDynamic("horizontalAccuracy")(horizontalAccuracy)
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (city != null) __obj.updateDynamic("city")(city)
    if (cityAdcode != null) __obj.updateDynamic("cityAdcode")(cityAdcode)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (district != null) __obj.updateDynamic("district")(district)
    if (districtAdcode != null) __obj.updateDynamic("districtAdcode")(districtAdcode)
    if (pois != null) __obj.updateDynamic("pois")(pois)
    if (province != null) __obj.updateDynamic("province")(province)
    if (streetNumber != null) __obj.updateDynamic("streetNumber")(streetNumber)
    __obj.asInstanceOf[LocationData]
  }
}

