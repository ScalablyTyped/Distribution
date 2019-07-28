package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudRenderer
  extends Accessor
     with JSONSupport {
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`. High values leave the color unchanged, while low values darken the color of the point. This helps to display the scanned surface in a more realistic way.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: PointCloudRendererColorModulation = js.native
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.  The splat algorithm automatically computes a size based on the density, which varies with the Level of Detail that is currently displayed.  The fixed size algorithm displays all points with the same size, either in screen space or real world units.  When `pointSizeAlgorithm` is not set, the default is `splat`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = js.native
  /**
    * The number of points to draw per display inch. This property determines the level of detail in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    *
    * @default 10
    */
  var pointsPerInch: Double = js.native
  /**
    * The point cloud renderer type.  **Possible values:** point-cloud-class-breaks | point-cloud-rgb | point-cloud-stretch | point-cloud-unique-value
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#type)
    */
  val `type`: String = js.native
}

@JSGlobal("__esri.PointCloudRenderer")
@js.native
class PointCloudRendererCls () extends PointCloudRenderer {
  def this(properties: PointCloudRendererProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

