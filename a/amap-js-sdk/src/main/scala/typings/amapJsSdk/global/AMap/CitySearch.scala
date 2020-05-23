package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.CitySearchResult
import typings.amapJsSdk.AMap.EventCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.CitySearch")
@js.native
class CitySearch ()
  extends typings.amapJsSdk.AMap.CitySearch {
  /* CompleteClass */
  override def getCityByIp(
    ip: String,
    callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit = js.native
  /* CompleteClass */
  override def off(eventName: String, callback: EventCallback): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, callback: EventCallback): Unit = js.native
}

