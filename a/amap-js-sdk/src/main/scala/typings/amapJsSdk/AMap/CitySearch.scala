package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CitySearch extends EventBindable {
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
}

