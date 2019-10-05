package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  /**
    * Specifies how points are placed on the vertical axis (z). This property only affects [PointCloudLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html) when using the `absolute-height` mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#elevationInfo)
    */
  var elevationInfo: PointCloudLayerElevationInfo = js.native
  /**
    * An array of fields accessible in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * An array of [pointCloudFilters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html) used to filter points. Only the points that satisfy all the filters are displayed in the view. There are two types of filters that can be set: [PointCloudValueFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html) filters points based on classification values and [PointCloudReturnFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html) filters points based on return values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#filters)
    */
  var filters: js.Array[PointCloudValueFilter | PointCloudReturnFilter] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: Boolean = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize each point in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html#renderer)
    */
  var renderer: PointCloudRenderer = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: PointCloudLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: PointCloudLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: PointCloudLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.PointCloudLayer")
@js.native
object PointCloudLayer extends TopLevel[PointCloudLayerConstructor]

