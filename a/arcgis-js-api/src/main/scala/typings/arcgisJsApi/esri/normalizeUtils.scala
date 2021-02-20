package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait normalizeUtils extends StObject {
  
  /**
    * Normalizes geometries that intersect the central meridian or fall outside the world extent so they stay within the coordinate system of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-normalizeUtils.html#normalizeCentralMeridian)
    */
  def normalizeCentralMeridian(geometries: js.Array[Geometry_]): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(
    geometries: js.Array[Geometry_],
    geometryService: js.UndefOr[scala.Nothing],
    requestOptions: js.Any
  ): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry_], geometryService: GeometryService): js.Promise[js.Array[Geometry_]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry_], geometryService: GeometryService, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
}
