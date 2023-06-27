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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Converts between [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and formatted coordinates notation strings such as:
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
  def fromMgrs(
    coordinates: String,
    spatialReference: SpatialReference,
    conversionMode: automatic | `new-180-in-zone-01` | `new-180-in-zone-60` | `old-180-in-zone-01` | `old-180-in-zone-60`
  ): Point = js.native
  
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
  def fromUtm(
    coordinates: String,
    spatialReference: SpatialReference,
    conversionMode: `latitude-band-indicators` | `north-south-indicators`
  ): Point = js.native
  
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
  def load(): js.Promise[Any] = js.native
  
  /**
  		 * Returns formatted coordinates in latitude/longitude notation representing the given point's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toLatitudeLongitude)
  		 */
  def toLatitudeLongitude(point: Point, format: dd | ddm | dms): String = js.native
  def toLatitudeLongitude(point: Point, format: dd | ddm | dms, decimalPlaces: Double): String = js.native
  
  /**
  		 * Returns formatted coordinates in Military Grid Reference System (MGRS) notation representing the given point's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toMgrs)
  		 */
  def toMgrs(
    point: Point,
    conversionMode: automatic | `new-180-in-zone-01` | `new-180-in-zone-60` | `old-180-in-zone-01` | `old-180-in-zone-60`
  ): String = js.native
  def toMgrs(
    point: Point,
    conversionMode: automatic | `new-180-in-zone-01` | `new-180-in-zone-60` | `old-180-in-zone-01` | `old-180-in-zone-60`,
    precision: Double
  ): String = js.native
  def toMgrs(
    point: Point,
    conversionMode: automatic | `new-180-in-zone-01` | `new-180-in-zone-60` | `old-180-in-zone-01` | `old-180-in-zone-60`,
    precision: Double,
    addSpaces: Boolean
  ): String = js.native
  def toMgrs(
    point: Point,
    conversionMode: automatic | `new-180-in-zone-01` | `new-180-in-zone-60` | `old-180-in-zone-01` | `old-180-in-zone-60`,
    precision: scala.Unit,
    addSpaces: Boolean
  ): String = js.native
  
  /**
  		 * Returns formatted coordinates in United States National Grid (USNG) notation representing the given point's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUsng)
  		 */
  def toUsng(point: Point): String = js.native
  def toUsng(point: Point, precision: Double): String = js.native
  def toUsng(point: Point, precision: Double, addSpaces: Boolean): String = js.native
  def toUsng(point: Point, precision: scala.Unit, addSpaces: Boolean): String = js.native
  
  /**
  		 * Returns formatted coordinates in Universal Transverse Mercator (UTM) notation representing the given point's location.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUtm)
  		 */
  def toUtm(point: Point, conversionMode: `latitude-band-indicators` | `north-south-indicators`): String = js.native
  def toUtm(
    point: Point,
    conversionMode: `latitude-band-indicators` | `north-south-indicators`,
    addSpaces: Boolean
  ): String = js.native
}
