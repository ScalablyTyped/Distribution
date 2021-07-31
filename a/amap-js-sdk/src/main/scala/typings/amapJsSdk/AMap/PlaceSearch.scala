package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceSearch extends StObject {
  
  def clear(): Unit = js.native
  
  def detailOnAMAP(obj: js.Any): Unit = js.native
  
  def getDetails(
    POIID: String,
    callback: js.Function2[/* status */ String, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  def getLang(): String = js.native
  
  def poiOnAMAP(obj: js.Any): Unit = js.native
  
  def search(
    keyword: String,
    callback: js.Function2[/* status */ String, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  def searchInBounds(
    keyword: String,
    bounds: Bounds,
    callback: js.Function2[/* status */ String, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  def searchInBounds(
    keyword: String,
    bounds: Polygon,
    callback: js.Function2[/* status */ String, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  def searchNearBy(
    keyword: String,
    center: LngLat,
    radius: Double,
    callback: js.Function2[/* status */ String, /* result */ String | SearchResult, Unit]
  ): Unit = js.native
  
  def setCity(city: String): Unit = js.native
  
  def setCityLimit(p: Boolean): Unit = js.native
  
  def setLang(lang: String): String = js.native
  
  def setPageIndex(pageIndex: Double): Unit = js.native
  
  def setPageSize(setPageSize: Double): Unit = js.native
  
  def setType(`type`: String): Unit = js.native
}
