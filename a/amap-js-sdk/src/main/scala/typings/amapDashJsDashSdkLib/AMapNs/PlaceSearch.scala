package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.PlaceSearch")
@js.native
class PlaceSearch protected () extends js.Object {
  def this(opts: amapDashJsDashSdkLib.Anon_AutoFitView) = this()
  def clear(): scala.Unit = js.native
  def detailOnAMAP(obj: js.Any): scala.Unit = js.native
  def getDetails(
    POIID: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | SearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getLang(): java.lang.String = js.native
  def poiOnAMAP(obj: js.Any): scala.Unit = js.native
  def search(
    keyword: java.lang.String,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | SearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def searchInBounds(
    keyword: java.lang.String,
    bounds: Bounds,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | SearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def searchInBounds(
    keyword: java.lang.String,
    bounds: Polygon,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | SearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def searchNearBy(
    keyword: java.lang.String,
    center: LngLat,
    radius: scala.Double,
    callback: js.Function2[
      /* status */ java.lang.String, 
      /* result */ java.lang.String | SearchResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setCity(city: java.lang.String): scala.Unit = js.native
  def setCityLimit(p: scala.Boolean): scala.Unit = js.native
  def setLang(lang: java.lang.String): java.lang.String = js.native
  def setPageIndex(pageIndex: scala.Double): scala.Unit = js.native
  def setPageSize(setPageSize: scala.Double): scala.Unit = js.native
  def setType(`type`: java.lang.String): scala.Unit = js.native
}

