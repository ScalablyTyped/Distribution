package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitySearch
  extends StObject
     with EventBindable {
  
  def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
  ): Unit
  
  def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit
}
object CitySearch {
  
  @scala.inline
  def apply(
    getCityByIp: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Unit,
    getLocalCity: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit
  ): CitySearch = {
    val __obj = js.Dynamic.literal(getCityByIp = js.Any.fromFunction2(getCityByIp), getLocalCity = js.Any.fromFunction1(getLocalCity), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[CitySearch]
  }
  
  @scala.inline
  implicit class CitySearchMutableBuilder[Self <: CitySearch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCityByIp(
      value: (String, js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]) => Unit
    ): Self = StObject.set(x, "getCityByIp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLocalCity(value: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit] => Unit): Self = StObject.set(x, "getLocalCity", js.Any.fromFunction1(value))
  }
}
