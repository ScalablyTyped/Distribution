package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudClassBreaksRenderer
  extends PointCloudRenderer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.pointCloudRenderersNs.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos] = js.native
  /**
    * The name of the field that is used to drive the color visualization for the renderer. The value of this field determines which class break each point is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: java.lang.String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudClassBreaksRendererLegendOptions = js.native
  /**
    * The type of renderer. For PointCloudClassBreaksRenderer this value is always `point-cloud-class-breaks`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudClassBreaksRenderer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`point-cloud-class-breaks` = js.native
}

@JSGlobal("__esri.PointCloudClassBreaksRenderer")
@js.native
/**
  * This class defines the color of each point in a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) based on the value of a numeric attribute. Colors are assigned based on classes or ranges of data. Each point is assigned a symbol based on the class break in which the value of the attribute falls.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html)
  */
class PointCloudClassBreaksRendererCls () extends PointCloudClassBreaksRenderer {
  def this(properties: PointCloudClassBreaksRendererProperties) = this()
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

