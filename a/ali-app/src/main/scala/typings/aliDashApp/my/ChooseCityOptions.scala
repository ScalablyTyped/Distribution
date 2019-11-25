package typings.aliDashApp.my

import typings.aliDashApp.Anon_AdCode
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
  var showHotCities: Boolean
  var showLocatedCity: Boolean
  			// 自定义热门城市列表，列表内对象字段见下表
  @JSName("success")
  def success_MChooseCityOptions(result: Anon_AdCode): Unit
}

object ChooseCityOptions {
  @scala.inline
  def apply(
    cities: js.Array[City],
    hotCities: js.Array[City],
    showHotCities: Boolean,
    showLocatedCity: Boolean,
    success: Anon_AdCode => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ChooseCityOptions = {
    val __obj = js.Dynamic.literal(cities = cities.asInstanceOf[js.Any], hotCities = hotCities.asInstanceOf[js.Any], showHotCities = showHotCities.asInstanceOf[js.Any], showLocatedCity = showLocatedCity.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ChooseCityOptions]
  }
}

