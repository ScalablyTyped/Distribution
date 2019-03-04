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
  def success_MChooseCityOptions(result: aliDashAppLib.Anon_AdCode): scala.Unit
}

object ChooseCityOptions {
  @scala.inline
  def apply(
    cities: js.Array[City],
    hotCities: js.Array[City],
    showHotCities: scala.Boolean,
    showLocatedCity: scala.Boolean,
    success: js.Function1[aliDashAppLib.Anon_AdCode, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): ChooseCityOptions = {
    val __obj = js.Dynamic.literal(cities = cities, hotCities = hotCities, showHotCities = showHotCities, showLocatedCity = showLocatedCity, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ChooseCityOptions]
  }
}

