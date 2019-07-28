package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-cloud-unique-value`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudUniqueValueRenderer
  extends PointCloudRenderer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.pointCloudRenderersNs.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * Each element in the array is an object that matches a unique value with a specific color. Features with equal values to those specified here will be assigned the associated color. For example, you may choose to visualize points representing low vegetation with a green color and points representing power lines with a gray color. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos] = js.native
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: String = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudUniqueValueRendererLegendOptions = js.native
  /**
    * The type of Renderer. For PointCloudUniqueValueRenderer this value is always `point-cloud-unique-value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudUniqueValueRenderer: `point-cloud-unique-value` = js.native
}

@JSGlobal("__esri.PointCloudUniqueValueRenderer")
@js.native
/**
  * PointCloudUniqueValueRenderer allows you to colorize points in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on an attribute value. This is done by assigning unique colors to represent points with equal attribute values. This renderer is used to visualize points of the same type, not interpolate colors along a continuous ramp mapped to numbers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html)
  */
class PointCloudUniqueValueRendererCls () extends PointCloudUniqueValueRenderer {
  def this(properties: PointCloudUniqueValueRendererProperties) = this()
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

