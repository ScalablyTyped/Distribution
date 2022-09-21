package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SnowyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SnowyWeather")
@js.native
/**
  * The SnowyWeather class allows you to change the weather conditions in the scene to snowy weather.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html)
  */
open class SnowyWeatherCls ()
  extends StObject
     with typings.arcgisJsApi.esri.SnowyWeather {
  def this(properties: SnowyWeatherProperties) = this()
}
