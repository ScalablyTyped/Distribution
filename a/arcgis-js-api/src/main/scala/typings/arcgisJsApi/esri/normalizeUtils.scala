package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Provides a utility method that normalizes geometries that intersect the central meridian or fall outside the world extent so they stay within the coordinate system of the view.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-normalizeUtils.html)
	 */
@js.native
trait normalizeUtils extends StObject {
  
  /**
  		 * Returns an [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) over the dateline that is smaller than the normalized width if it visually contains the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-normalizeUtils.html#getDenormalizedExtent)
  		 */
  def getDenormalizedExtent(geometry: Geometry_): Extent = js.native
  
  /**
  		 * Normalizes geometries that intersect the central meridian or fall outside the world extent so they stay within the coordinate system of the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-normalizeUtils.html#normalizeCentralMeridian)
  		 */
  def normalizeCentralMeridian(geometries: js.Array[Geometry_]): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry_], url: String): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry_], url: String, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry_], url: scala.Unit, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
}
