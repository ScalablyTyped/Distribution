package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cities extends StObject {
  
  /** 自定义城市列表，列表内对象字段见下表 */
  var cities: js.UndefOr[js.Array[AdCode]] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 自定义热门城市列表，列表内对象字段见下表  */
  var hotCities: js.UndefOr[js.Array[AdCode]] = js.undefined
  
  /** 是否显示热门城市，默认 true */
  var showHotCities: js.UndefOr[Boolean] = js.undefined
  
  /** 是否显示当前定位城市，默认 false */
  var showLocatedCity: js.UndefOr[Boolean] = js.undefined
}
object Cities {
  
  inline def apply(): Cities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cities] (val x: Self) extends AnyVal {
    
    inline def setCities(value: js.Array[AdCode]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: AdCode*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setHotCities(value: js.Array[AdCode]): Self = StObject.set(x, "hotCities", value.asInstanceOf[js.Any])
    
    inline def setHotCitiesUndefined: Self = StObject.set(x, "hotCities", js.undefined)
    
    inline def setHotCitiesVarargs(value: AdCode*): Self = StObject.set(x, "hotCities", js.Array(value*))
    
    inline def setShowHotCities(value: Boolean): Self = StObject.set(x, "showHotCities", value.asInstanceOf[js.Any])
    
    inline def setShowHotCitiesUndefined: Self = StObject.set(x, "showHotCities", js.undefined)
    
    inline def setShowLocatedCity(value: Boolean): Self = StObject.set(x, "showLocatedCity", value.asInstanceOf[js.Any])
    
    inline def setShowLocatedCityUndefined: Self = StObject.set(x, "showLocatedCity", js.undefined)
  }
}
