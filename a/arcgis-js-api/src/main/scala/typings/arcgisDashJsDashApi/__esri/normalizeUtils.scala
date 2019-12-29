package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait normalizeUtils extends js.Object {
  /**
    * Normalizes geometries that intersect the central meridian or fall outside the world extent so they stay within the coordinate system of the view. Only supported for Web Mercator and WGS84 spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-normalizeUtils.html#normalizeCentralMeridian)
    *
    * @param geometries An array of geometries to normalize.
    * @param geometryService A geometry service used to perform the normalization. If this value is `null` then the default geometry service in [esriConfig.geometryServiceUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#geometryServiceUrl) is used.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request.
    *
    */
  def normalizeCentralMeridian(geometries: js.Array[Geometry]): js.Promise[js.Array[Geometry]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry], geometryService: GeometryService): js.Promise[js.Array[Geometry]] = js.native
  def normalizeCentralMeridian(geometries: js.Array[Geometry], geometryService: GeometryService, requestOptions: js.Any): js.Promise[js.Array[Geometry]] = js.native
}

@JSGlobal("__esri.normalizeUtils")
@js.native
object normalizeUtils extends TopLevel[normalizeUtils]

