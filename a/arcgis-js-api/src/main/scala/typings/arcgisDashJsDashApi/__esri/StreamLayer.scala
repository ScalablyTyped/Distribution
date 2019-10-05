package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.edits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayer extends FeatureLayer {
  /**
    * Contains the attribute and spatial filters used to filter messages sent to the client by a Stream Service. This property can be set in the constructor but is `read-only` after the layer is created. To change the filter after the layer is created, use the [updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) method.  **Use definitionExpression or geometryDefinition instead.**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter)
    */
  val filter: StreamLayerFilter = js.native
  /**
    * An extent object used to filter features. Only features intersecting the extent are displayed in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: Extent = js.native
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    */
  var maximumTrackPoints: Double = js.native
  /**
    * Options for purging stale features. Use these options to avoid overloading the browser with graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: StreamLayerPurgeOptions = js.native
  @JSName("on")
  def on_edits(name: edits, eventHandler: StreamLayerEditsEventHandler): IHandle = js.native
  /**
    * Updates the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) on the layer. The filter is updated on all views that contain the layer. If the input `filterChanges` object is `undefined` or `null`, the spatial and attribute filters are removed. To update the filter on a single layer view associated with the layer, use the [StreamLayerView.updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter) method after getting the layer view object.  Filter changes only apply to incoming features. Features already displayed in the view will be removed automatically.  **Use [definitionExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#definitionExpression) or [geometryDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#definitionExpression) instead.**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter)
    *
    * @param filterChanges Updates the spatial and attribute [filters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) on the layer and all of its associated views. If `null`, all filters are cleared.
    * @param filterChanges.geometry A spatial filter for filtering features. Only features that intersect the given geometry are displayed in the view(s). If `null`, the spatial filter is cleared.
    * @param filterChanges.where A SQL where clause used to filter features by attributes. If `null`, the attribute filter is cleared.
    *
    */
  def updateFilter(filterChanges: StreamLayerUpdateFilterFilterChanges): IPromise[_] = js.native
}

@JSGlobal("__esri.StreamLayer")
@js.native
object StreamLayer extends TopLevel[StreamLayerConstructor]

