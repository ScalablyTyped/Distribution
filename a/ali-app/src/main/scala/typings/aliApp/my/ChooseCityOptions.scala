package typings.aliApp.my

import typings.aliApp.anon.AdCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ChooseCityOptionsMutableBuilder[Self <: ChooseCityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value :_*))
    
    @scala.inline
    def setHotCities(value: js.Array[City]): Self = StObject.set(x, "hotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotCitiesVarargs(value: City*): Self = StObject.set(x, "hotCities", js.Array(value :_*))
    
    @scala.inline
    def setShowHotCities(value: Boolean): Self = StObject.set(x, "showHotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLocatedCity(value: Boolean): Self = StObject.set(x, "showLocatedCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: AdCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
