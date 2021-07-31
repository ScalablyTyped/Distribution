package typings.arcgisJsApi.esri

import typings.arcgisJsApi.esri.geometry.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extent
  extends StObject
     with Geometry_
     with Geometry
     with geometryGeometry {
  
  /**
    * The center point of the extent in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#center)
    */
  val center: Point = js.native
  
  /**
    * Centers the extent to the specified [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#centerAt)
    */
  def centerAt(point: Point): Extent = js.native
  
  def contains(geometry: Extent): Boolean = js.native
  /**
    * Checks if the input geometry is contained within the extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#contains)
    */
  def contains(geometry: Point): Boolean = js.native
  
  /**
    * Indicates if the input extent is equal to the testing extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#equals)
    */
  def equals(extent: Extent): Boolean = js.native
  
  /**
    * Expands the extent by the given factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#expand)
    */
  def expand(factor: Double): Extent = js.native
  
  /**
    * The height of the extent in map units (the distance between [ymin](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin) and [ymax](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#height)
    */
  val height: Double = js.native
  
  /**
    * Shrinks the original extent to the intersection with the input extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#intersection)
    */
  def intersection(extent: Extent): Extent = js.native
  
  /**
    * Tests to validate if the input geometry intersects the extent and returns a Boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#intersects)
    */
  def intersects(geometry: Geometry_): Boolean = js.native
  
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    */
  var mmax: Double = js.native
  
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    */
  var mmin: Double = js.native
  
  /**
    * Returns an array with either one Extent that's been shifted to within +/- 180 or two Extents if the original extent intersects the International Dateline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#normalize)
    */
  def normalize(): js.Array[Extent] = js.native
  
  /**
    * Modifies the extent geometry in-place with X and Y offsets in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#offset)
    */
  def offset(dx: Double, dy: Double, dz: Double): Extent = js.native
  
  @JSName("type")
  val type_Extent: typings.arcgisJsApi.arcgisJsApiStrings.extent = js.native
  
  /**
    * Expands the original extent to include the extent of the input Extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#union)
    */
  def union(extent: Extent): Extent = js.native
  
  /**
    * The width of the extent in map units (the distance between [xmin](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin) and [xmax](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#width)
    */
  val width: Double = js.native
  
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    */
  var xmax: Double = js.native
  
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    */
  var xmin: Double = js.native
  
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    */
  var ymax: Double = js.native
  
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    */
  var ymin: Double = js.native
  
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    */
  var zmax: Double = js.native
  
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    */
  var zmin: Double = js.native
}
