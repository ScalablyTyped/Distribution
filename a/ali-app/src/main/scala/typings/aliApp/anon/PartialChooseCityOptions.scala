package typings.aliApp.anon

import typings.aliApp.my.City
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ChooseCityOptions> */
trait PartialChooseCityOptions extends StObject {
  
  var cities: js.UndefOr[js.Array[City]] = js.undefined
  
  var complete: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var fail: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
  
  var hotCities: js.UndefOr[js.Array[City]] = js.undefined
  
  var showHotCities: js.UndefOr[Boolean] = js.undefined
  
  var showLocatedCity: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* result */ AdCode, Unit]] = js.undefined
}
object PartialChooseCityOptions {
  
  inline def apply(): PartialChooseCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseCityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialChooseCityOptions] (val x: Self) extends AnyVal {
    
    inline def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    inline def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    inline def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value*))
    
    inline def setComplete(value: /* res */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setHotCities(value: js.Array[City]): Self = StObject.set(x, "hotCities", value.asInstanceOf[js.Any])
    
    inline def setHotCitiesUndefined: Self = StObject.set(x, "hotCities", js.undefined)
    
    inline def setHotCitiesVarargs(value: City*): Self = StObject.set(x, "hotCities", js.Array(value*))
    
    inline def setShowHotCities(value: Boolean): Self = StObject.set(x, "showHotCities", value.asInstanceOf[js.Any])
    
    inline def setShowHotCitiesUndefined: Self = StObject.set(x, "showHotCities", js.undefined)
    
    inline def setShowLocatedCity(value: Boolean): Self = StObject.set(x, "showLocatedCity", value.asInstanceOf[js.Any])
    
    inline def setShowLocatedCityUndefined: Self = StObject.set(x, "showLocatedCity", js.undefined)
    
    inline def setSuccess(value: /* result */ AdCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
