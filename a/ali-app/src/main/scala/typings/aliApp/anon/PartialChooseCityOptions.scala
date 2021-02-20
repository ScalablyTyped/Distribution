package typings.aliApp.anon

import typings.aliApp.my.City
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.ChooseCityOptions> */
@js.native
trait PartialChooseCityOptions extends StObject {
  
  var cities: js.UndefOr[js.Array[City]] = js.native
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var hotCities: js.UndefOr[js.Array[City]] = js.native
  
  var showHotCities: js.UndefOr[Boolean] = js.native
  
  var showLocatedCity: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function1[/* result */ AdCode, Unit]] = js.native
}
object PartialChooseCityOptions {
  
  @scala.inline
  def apply(): PartialChooseCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseCityOptions]
  }
  
  @scala.inline
  implicit class PartialChooseCityOptionsMutableBuilder[Self <: PartialChooseCityOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCities(value: js.Array[City]): Self = StObject.set(x, "cities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitiesUndefined: Self = StObject.set(x, "cities", js.undefined)
    
    @scala.inline
    def setCitiesVarargs(value: City*): Self = StObject.set(x, "cities", js.Array(value :_*))
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHotCities(value: js.Array[City]): Self = StObject.set(x, "hotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotCitiesUndefined: Self = StObject.set(x, "hotCities", js.undefined)
    
    @scala.inline
    def setHotCitiesVarargs(value: City*): Self = StObject.set(x, "hotCities", js.Array(value :_*))
    
    @scala.inline
    def setShowHotCities(value: Boolean): Self = StObject.set(x, "showHotCities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHotCitiesUndefined: Self = StObject.set(x, "showHotCities", js.undefined)
    
    @scala.inline
    def setShowLocatedCity(value: Boolean): Self = StObject.set(x, "showLocatedCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLocatedCityUndefined: Self = StObject.set(x, "showLocatedCity", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ AdCode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
