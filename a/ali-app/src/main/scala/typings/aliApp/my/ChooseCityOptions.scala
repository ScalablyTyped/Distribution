package typings.aliApp.my

import typings.aliApp.anon.AdCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseCityOptions
  extends BaseOptions[js.Any, js.Any] {
          //     是否显示热门城市，默认 true
  var cities: js.Array[City] = js.native
                  // 自定义城市列表，列表内对象字段见下表
  var hotCities: js.Array[City] = js.native
      //     是否显示当前定位城市，默认 false
  var showHotCities: Boolean = js.native
  var showLocatedCity: Boolean = js.native
              // 自定义热门城市列表，列表内对象字段见下表
  @JSName("success")
  def success_MChooseCityOptions(result: AdCode): Unit = js.native
}

object ChooseCityOptions {
  @scala.inline
  def apply(
    cities: js.Array[City],
    hotCities: js.Array[City],
    showHotCities: Boolean,
    showLocatedCity: Boolean,
    success: AdCode => Unit
  ): ChooseCityOptions = {
    val __obj = js.Dynamic.literal(cities = cities.asInstanceOf[js.Any], hotCities = hotCities.asInstanceOf[js.Any], showHotCities = showHotCities.asInstanceOf[js.Any], showLocatedCity = showLocatedCity.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseCityOptions]
  }
  @scala.inline
  implicit class ChooseCityOptionsOps[Self <: ChooseCityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCitiesVarargs(value: City*): Self = this.set("cities", js.Array(value :_*))
    @scala.inline
    def setCities(value: js.Array[City]): Self = this.set("cities", value.asInstanceOf[js.Any])
    @scala.inline
    def setHotCitiesVarargs(value: City*): Self = this.set("hotCities", js.Array(value :_*))
    @scala.inline
    def setHotCities(value: js.Array[City]): Self = this.set("hotCities", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHotCities(value: Boolean): Self = this.set("showHotCities", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowLocatedCity(value: Boolean): Self = this.set("showLocatedCity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: AdCode => Unit): Self = this.set("success", js.Any.fromFunction1(value))
  }
  
}

