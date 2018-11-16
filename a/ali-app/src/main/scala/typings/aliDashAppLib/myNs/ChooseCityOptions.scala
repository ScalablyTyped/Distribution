package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChooseCityOptions
  extends BaseOptions[js.Any, js.Any] {
  		// 	是否显示热门城市，默认 true
  var cities: js.Array[City]
  				// 自定义城市列表，列表内对象字段见下表
  var hotCities: js.Array[City]
  	// 	是否显示当前定位城市，默认 false
  var showHotCities: scala.Boolean
  var showLocatedCity: scala.Boolean
  			// 自定义热门城市列表，列表内对象字段见下表
  @JSName("success")
  def success_MChooseCityOptions(result: aliDashAppLib.Anon_City): scala.Unit
}

