package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`latitude-band-indicators`
import typings.arcgisJsApi.arcgisJsApiStrings.`new-180-in-zone-01`
import typings.arcgisJsApi.arcgisJsApiStrings.`new-180-in-zone-60`
import typings.arcgisJsApi.arcgisJsApiStrings.`north-south-indicators`
import typings.arcgisJsApi.arcgisJsApiStrings.`old-180-in-zone-01`
import typings.arcgisJsApi.arcgisJsApiStrings.`old-180-in-zone-60`
import typings.arcgisJsApi.arcgisJsApiStrings.automatic
import typings.arcgisJsApi.arcgisJsApiStrings.dd
import typings.arcgisJsApi.arcgisJsApiStrings.ddm
import typings.arcgisJsApi.arcgisJsApiStrings.dms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Converts between [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and formatted coordinates notation strings such as:.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html)
  */
@js.native
trait coordinateFormatter extends StObject {
  
  /**
    * Parses coordinates in latitude/longitude notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromLatitudeLongitude)
    */
  def fromLatitudeLongitude(coordinates: String): Point = js.native
  def fromLatitudeLongitude(coordinates: String, spatialReference: SpatialReference): Point = js.native
  
  /**
    * Parses coordinates in Military Grid Reference System (MGRS) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromMgrs)
    */
  @JSName("fromMgrs")
  def fromMgrs_automatic(coordinates: String, spatialReference: SpatialReference, conversionMode: automatic): Point = js.native
  @JSName("fromMgrs")
  def fromMgrs_new180inzone01(coordinates: String, spatialReference: SpatialReference, conversionMode: `new-180-in-zone-01`): Point = js.native
  @JSName("fromMgrs")
  def fromMgrs_new180inzone60(coordinates: String, spatialReference: SpatialReference, conversionMode: `new-180-in-zone-60`): Point = js.native
  @JSName("fromMgrs")
  def fromMgrs_old180inzone01(coordinates: String, spatialReference: SpatialReference, conversionMode: `old-180-in-zone-01`): Point = js.native
  @JSName("fromMgrs")
  def fromMgrs_old180inzone60(coordinates: String, spatialReference: SpatialReference, conversionMode: `old-180-in-zone-60`): Point = js.native
  
  /**
    * Parses coordinates in United States National Grid (USNG) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromUsng)
    */
  def fromUsng(coordinates: String): Point = js.native
  def fromUsng(coordinates: String, spatialReference: SpatialReference): Point = js.native
  
  /**
    * Parses coordinates in Universal Transverse Mercator (UTM) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromUtm)
    */
  @JSName("fromUtm")
  def fromUtm_latitudebandindicators(
    coordinates: String,
    spatialReference: SpatialReference,
    conversionMode: `latitude-band-indicators`
  ): Point = js.native
  @JSName("fromUtm")
  def fromUtm_northsouthindicators(coordinates: String, spatialReference: SpatialReference, conversionMode: `north-south-indicators`): Point = js.native
  
  /**
    * Indicates if all dependencies of this module have been loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#isLoaded)
    */
  def isLoaded(): Boolean = js.native
  
  /**
    * Indicates if this module is supported in the current browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#isSupported)
    */
  def isSupported(): Boolean = js.native
  
  /**
    * Load this module's dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#load)
    */
  def load(): js.Promise[_] = js.native
  
  /**
    * Returns formatted coordinates in latitude/longitude notation representing the given point's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toLatitudeLongitude)
    */
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_dd(point: Point, format: dd): String = js.native
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_dd(point: Point, format: dd, decimalPlaces: Double): String = js.native
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_ddm(point: Point, format: ddm): String = js.native
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_ddm(point: Point, format: ddm, decimalPlaces: Double): String = js.native
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_dms(point: Point, format: dms): String = js.native
  @JSName("toLatitudeLongitude")
  def toLatitudeLongitude_dms(point: Point, format: dms, decimalPlaces: Double): String = js.native
  
  /**
    * Returns formatted coordinates in Military Grid Reference System (MGRS) notation representing the given point's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toMgrs)
    */
  @JSName("toMgrs")
  def toMgrs_automatic(point: Point, conversionMode: automatic): String = js.native
  @JSName("toMgrs")
  def toMgrs_automatic(point: Point, conversionMode: automatic, precision: js.UndefOr[scala.Nothing], addSpaces: Boolean): String = js.native
  @JSName("toMgrs")
  def toMgrs_automatic(point: Point, conversionMode: automatic, precision: Double): String = js.native
  @JSName("toMgrs")
  def toMgrs_automatic(point: Point, conversionMode: automatic, precision: Double, addSpaces: Boolean): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone01(point: Point, conversionMode: `new-180-in-zone-01`): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone01(
    point: Point,
    conversionMode: `new-180-in-zone-01`,
    precision: js.UndefOr[scala.Nothing],
    addSpaces: Boolean
  ): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone01(point: Point, conversionMode: `new-180-in-zone-01`, precision: Double): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone01(point: Point, conversionMode: `new-180-in-zone-01`, precision: Double, addSpaces: Boolean): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone60(point: Point, conversionMode: `new-180-in-zone-60`): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone60(
    point: Point,
    conversionMode: `new-180-in-zone-60`,
    precision: js.UndefOr[scala.Nothing],
    addSpaces: Boolean
  ): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone60(point: Point, conversionMode: `new-180-in-zone-60`, precision: Double): String = js.native
  @JSName("toMgrs")
  def toMgrs_new180inzone60(point: Point, conversionMode: `new-180-in-zone-60`, precision: Double, addSpaces: Boolean): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone01(point: Point, conversionMode: `old-180-in-zone-01`): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone01(
    point: Point,
    conversionMode: `old-180-in-zone-01`,
    precision: js.UndefOr[scala.Nothing],
    addSpaces: Boolean
  ): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone01(point: Point, conversionMode: `old-180-in-zone-01`, precision: Double): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone01(point: Point, conversionMode: `old-180-in-zone-01`, precision: Double, addSpaces: Boolean): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone60(point: Point, conversionMode: `old-180-in-zone-60`): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone60(
    point: Point,
    conversionMode: `old-180-in-zone-60`,
    precision: js.UndefOr[scala.Nothing],
    addSpaces: Boolean
  ): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone60(point: Point, conversionMode: `old-180-in-zone-60`, precision: Double): String = js.native
  @JSName("toMgrs")
  def toMgrs_old180inzone60(point: Point, conversionMode: `old-180-in-zone-60`, precision: Double, addSpaces: Boolean): String = js.native
  
  /**
    * Returns formatted coordinates in United States National Grid (USNG) notation representing the given point's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUsng)
    */
  def toUsng(point: Point): String = js.native
  def toUsng(point: Point, precision: js.UndefOr[scala.Nothing], addSpaces: Boolean): String = js.native
  def toUsng(point: Point, precision: Double): String = js.native
  def toUsng(point: Point, precision: Double, addSpaces: Boolean): String = js.native
  
  /**
    * Returns formatted coordinates in Universal Transverse Mercator (UTM) notation representing the given point's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUtm)
    */
  @JSName("toUtm")
  def toUtm_latitudebandindicators(point: Point, conversionMode: `latitude-band-indicators`): String = js.native
  @JSName("toUtm")
  def toUtm_latitudebandindicators(point: Point, conversionMode: `latitude-band-indicators`, addSpaces: Boolean): String = js.native
  @JSName("toUtm")
  def toUtm_northsouthindicators(point: Point, conversionMode: `north-south-indicators`): String = js.native
  @JSName("toUtm")
  def toUtm_northsouthindicators(point: Point, conversionMode: `north-south-indicators`, addSpaces: Boolean): String = js.native
}
