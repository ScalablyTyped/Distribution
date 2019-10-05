package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Converts between [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and formatted coordinates notation strings such as:
  *   * decimal degrees
  *   * degrees, minutes, and seconds
  *   * U.S. National Grid (USNG)
  *   * Military Grid Reference System (MGRS).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html)
  */
@js.native
trait coordinateFormatter extends js.Object {
  /**
    * Parses coordinates in latitude/longitude notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location. The coordinates may use decimal degrees, degrees and decimal minutes, or degrees, minutes, and seconds format. The spatial reference provided must have an ellipsoid and datum matching those used by the source of the latitude/longitude string. If no spatial reference is provided, it is assumed the latitude/longitude coordinates are in WGS84.  **Supported characters**
    *
    * | Symbol | Character | Name | Unicode number | HTML code |
    * | --- | --- | --- | --- | --- |
    * | Degree | * | Asterisk | U+002A | &amp;#42; |
    * |  | ^ | Circumflex Accent | U+005E | &amp;#94;|
    * |  | ~ | Tilde | U+007E | &amp;#126; |
    * |  | ° | Degree Sign | U+00B0 | &amp;#176; |
    * | Minute | ' | Apostrophe | U+0027 | &amp;#39; |
    * | | ′ | Prime | U+2032 | &amp;#8242; |
    * | Second | " | Quotation Mark | U+0022 | &amp;#34; |
    *
    * The latitude/longitude string may contain leading and trailing whitespace, and may also contain a space, comma, or vertical bar symbol to separate the latitude from the longitude. It may also contain the characters 'N', 'S', 'E' and 'W', or use a minus (-) symbol to indicate the hemisphere of each value.  Latitude/longitude notation examples:
    *   * 55 56 39.123N 003 09 43.034W
    *   * 55°56′39″N 3°09′43″W
    *   * 55~56.65205', -003~09.71723'
    *   * 55.9442008* | -3.1619539*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromLatitudeLongitude)
    *
    * @param coordinates The latitude/longitude notation string for the coordinates.
    * @param spatialReference A spatial reference object representing a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm). If `null`, WGS84 will be used.
    *
    */
  def fromLatitudeLongitude(coordinates: String): Point = js.native
  def fromLatitudeLongitude(coordinates: String, spatialReference: SpatialReference): Point = js.native
  /**
    * Parses coordinates in Military Grid Reference System (MGRS) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location. The spatial reference provided must have an ellipsoid and datum matching those used by the source of the MGRS string. If no spatial reference is provided, it is assumed the MGRS string is referenced to WGS84.  Note that the choice between zone 01 and 60 has no impact when reading from an MGRS notation string. The MGRS string can contain leading and trailing whitespace and can have whitespace between the grid zone designator, the 100km square identifier, and the numerical eastings and northings.  MGRS notation examples:
    *   * 30UVG898998
    *   * 30UVG 89885 99877
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromMgrs)
    *
    * @param coordinates The MGRS notation string for the coordinates.
    * @param spatialReference A spatial reference object representing a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) referenced by the MGRS coordinates. If `null`, WGS84 will be used.
    * @param conversionMode The mode used by the given MGRS coordinates.  **Possible Values**: automatic | new-180-in-zone-01 | new-180-in-zone-60 | old-180-in-zone-01 | old-180-in-zone-60
    *
    */
  def fromMgrs(coordinates: String, spatialReference: SpatialReference, conversionMode: String): Point = js.native
  /**
    * Parses coordinates in United States National Grid (USNG) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location.  The spatial reference provided must have an ellipsoid and datum matching those used by the source of the USNG string. If no spatial reference is provided and the USNG string is suffixed with "(NAD 27)", it is assumed the USNG string is referenced to NAD 27. If no spatial reference is provided and no such suffix exists, it is assumed the USNG string is referenced to WGS84.  USNG notation examples:
    *   * 13TFJ 23 59
    *   * 13TFJ2374159574
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromUsng)
    *
    * @param coordinates The USNG notation string for the coordinates.
    * @param spatialReference A spatial reference object representing a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) that the USNG coordinates are in. If `null`, WGS84 will be used.
    *
    */
  def fromUsng(coordinates: String): Point = js.native
  def fromUsng(coordinates: String, spatialReference: SpatialReference): Point = js.native
  /**
    * Parses coordinates in Universal Transverse Mercator (UTM) notation, and returns a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing that location. The spatial reference provided must have an ellipsoid and datum matching those used by the source of the UTM string. If no spatial reference is provided, it is assumed the UTM string is referenced to WGS84. The UTM string can contain leading and trailing whitespace and can have whitespace between the zone and latitude designator and the numerical eastings and northings.  UTM notation examples:
    *   * 30U 489885 6199877
    *   * 30U4898856199877
    *   * 30N 489885 6199877 (using N/S indicator)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#fromUtm)
    *
    * @param coordinates The UTM notation string for the coordinates.
    * @param spatialReference A spatial reference object representing a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) that the UTM coordinates are in. If `null`, WGS84 will be used.
    * @param conversionMode The latitude notation scheme used by the given UTM coordinates, either a latitudinal band, or a hemisphere designator.  **Possible Values**: latitude-band-indicators | north-south-indicators
    *
    */
  def fromUtm(coordinates: String, spatialReference: SpatialReference, conversionMode: String): Point = js.native
  /**
    * Indicates if all dependencies of this module have been loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#isLoaded)
    *
    *
    */
  def isLoaded(): Boolean = js.native
  /**
    * Indicates if this module is supported in the current browser. The browser must support [WebAssembly](https://caniuse.com/#feat=wasm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#isSupported)
    *
    *
    */
  def isSupported(): Boolean = js.native
  /**
    * Load this module's dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#load)
    *
    *
    */
  def load(): IPromise[_] = js.native
  /**
    * Returns formatted coordinates in latitude/longitude notation representing the given point's location.  The latitude/longitude string will contain a space separating the latitude from the longitude value, and the characters 'N' or 'S', and 'E' and 'W', to indicate the hemisphere of each value. The string will also contain spaces separating the components (degrees, minutes, seconds) of each value. The precision of the output is controlled by both the `format` and `decimalPlaces` parameters.  For example:
    *
    * | Decimal places | format | Example output | Angular precision | Approximate precision |
    * | --- | --- | --- | --- | --- |
    * | 0 | dd | 056N 0003W | 1deg | 100km |
    * | 1 | dd | 55.9N 003.2W | 0.1deg | 10km |
    * | 2 | dd | 55.94N 003.16W | 0.01deg | 1km |
    * | 3 | dd | 55.944N 003.162W | 0.001deg | 100m |
    * | 0 | ddm | 55 057N 003 010W | 1min | 2km |
    * | 1 | ddm | 55 56.7N 003 09.7W | 0.1min | 200m |
    * | 2 | ddm | 55 56.65N 003 09.72W | 0.01min | 20m |
    * | 3 | ddm | 55 56.650N 003 09.717W | 0.001min | 2m |
    * | 0 | dms | 55 56 039N 003 09 043W | 1sec | 30m |
    * | 1 | dms | 55 56 39.1N 003 09 43.0W | 0.1sec| 3m |
    * | 2 | dms | 55 56 39.12N 003 09 43.03W | 0.01sec | 300mm |
    * | 3 | dms | 55 56 39.123N 003 09 43.034W | 0.001sec | 30mm |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toLatitudeLongitude)
    *
    * @param point The location to be represented as a formatted latitude/longitude string. The point's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#spatialReference) should either be WGS84 or another [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm).
    * @param format The mode to use when formatting the latitude/longitude string.  **Possible Values**: dd | ddm | dms
    * @param decimalPlaces The number of decimal places to use, it should be an integer from 0 to 16.
    *
    */
  def toLatitudeLongitude(point: Point, format: String): String = js.native
  def toLatitudeLongitude(point: Point, format: String, decimalPlaces: Double): String = js.native
  /**
    * Returns formatted coordinates in Military Grid Reference System (MGRS) notation representing the given point's location.  Note that the choice between zone 01 and 60 has an impact only when generating the MGRS notation string for a point with longitude of exactly 180deg. The precision value controls the number of digits used to represent each numerical easting and northing value within the MGRS string.  For example:
    *
    * | precision | add_spaces | Example output | Approximate precision |
    * | --- | --- | --- | --- |
    * | 0 | false | 30UVG | 100km |
    * | 1 | false | 30UVG89 | 10km |
    * | 2 | false | 30UVG8999 | 1km |
    * | 3 | false | 30UVG898998 | 100m |
    * | 4 | false | 30UVG89889988 | 10m |
    * | 5 | false | 30UVG8988499881 | 1m |
    * | 0 | true | 30U VG | 100km |
    * | 1 | true | 30U VG 8 9 | 10m |
    * | 2 | true | 30U VG 89 99 | 1km |
    * | 3 | true | 30U VG 898 998 | 100m |
    * | 4 | true | 30U VG 8988 9988 | 10m |
    * | 5 | true | 30U VG 89884 99881 | 1m |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toMgrs)
    *
    * @param point The location to be represented in MGRS notation. The point's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#spatialReference) should either be WGS84 or another [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm)
    * @param conversionMode The mode to use for the returned MGRS notation string.  **Possible Values**: automatic | new-180-in-zone-01 | new-180-in-zone-60 | old-180-in-zone-01 | old-180-in-zone-60
    * @param precision The precision with which to represent the coordinates, it should be an integer from 0 to 8.
    * @param addSpaces If `false`, the generated string will contain no spaces. If `true`, a space separates the grid zone designator, the 100km square identifier, and the numerical easting and northing values.
    *
    */
  def toMgrs(point: Point, conversionMode: String): String = js.native
  def toMgrs(point: Point, conversionMode: String, precision: Double): String = js.native
  def toMgrs(point: Point, conversionMode: String, precision: Double, addSpaces: Boolean): String = js.native
  /**
    * Returns formatted coordinates in United States National Grid (USNG) notation representing the given point's location. The precision value controls the number of digits used to represent each numerical easting and northing value within the USNG string.  For example:
    *
    * | precision | add_spaces | Example output | Approximate precision |
    * | --- | --- | --- | --- |
    * | 0 | false | 13TFJ | 100km |
    * | 1 | false | 13TFJ25 | 10km |
    * | 2 | false | 13TFJ2359 | 1km |
    * | 3 | false | 13TFJ237595 | 100m |
    * | 4 | false | 13TFJ23745951 | 10m |
    * | 5 | false | 13TFJ2374359512 | 1m |
    * | 0 | true | 13T FJ | 100km |
    * | 1 | true | 13T FJ 2 5 | 10m |
    * | 2 | true | 13T FJ 23 59 | 1km |
    * | 3 | true | 13T FJ 237 595 | 100m |
    * | 4 | true | 13T FJ 2374 5951 | 10m |
    * | 5 | true | 13T FJ 23743 59512 | 1m |
    * | 4* | false | 13TFJ23795929 (NAD 27) | 10m |
    * | 2* | true | 13T FJ 23 59 (NAD 27) | 1km |
    * &ast; *When the point's spatial reference is based on NAD 27.*
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUsng)
    *
    * @param point The location to be represented in USNG notation. The point's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#spatialReference) should either be WGS84 or another [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm).
    * @param precision The precision with which to represent the coordinates, it should be an integer from 0 to 8.
    * @param addSpaces If `false`, the generated string will contain no spaces. If `true`, a space separates the grid zone designator, the 100km square identifier, and the numerical easting and northing values.
    *
    */
  def toUsng(point: Point): String = js.native
  def toUsng(point: Point, precision: Double): String = js.native
  def toUsng(point: Point, precision: Double, addSpaces: Boolean): String = js.native
  /**
    * Returns formatted coordinates in Universal Transverse Mercator (UTM) notation representing the given point's location.  Example output for a point in the southern hemisphere:
    *
    * | conversionMode | add_spaces | Example output |
    * | --- | --- | --- |
    * | latitude-band-indicators | false | 30U4898846199881 |
    * | latitude-band-indicators | true | 30U 489884 6199881 |
    * | north-south-indicators | false | 30N4898846199881 |
    * | north-south-indicators | true | 30N 489884 6199881 |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-coordinateFormatter.html#toUtm)
    *
    * @param point The location to be represented in UTM notation. The point's [spatial reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#spatialReference) should either be WGS84 or another [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm)
    * @param conversionMode The latitude notation scheme to use in the returned UTM notation string, either a latitudinal band, or a hemisphere designator.  **Possible Values**: latitude-band-indicators | north-south-indicators
    * @param addSpaces If `false`, the generated string will contain no spaces. If `true`, a space separates the UTM zone and latitude designator and each numerical easting and northing value.
    *
    */
  def toUtm(point: Point, conversionMode: String): String = js.native
  def toUtm(point: Point, conversionMode: String, addSpaces: Boolean): String = js.native
}

@JSGlobal("__esri.coordinateFormatter")
@js.native
object coordinateFormatter extends TopLevel[coordinateFormatter]

