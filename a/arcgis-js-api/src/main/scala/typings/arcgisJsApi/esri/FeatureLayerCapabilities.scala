package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerCapabilities extends Object {
  /**
    * Describes what attachment capabilities are enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var attachment: FeatureLayerCapabilitiesAttachment = js.native
  /**
    * Describes characteristics of the data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var data: FeatureLayerCapabilitiesData = js.native
  /**
    * Describes editing capabilities that can be performed on the features in the layer via [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var editing: FeatureLayerCapabilitiesEditing = js.native
  /**
    * Describes the metadata contained on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var metadata: FeatureLayerCapabilitiesMetadata = js.native
  /**
    * Describes operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var operations: FeatureLayerCapabilitiesOperations = js.native
  /**
    * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) operations that can be performed on features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var query: FeatureLayerCapabilitiesQuery = js.native
  /**
    * Indicates if the layer's query operation supports querying features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var queryRelated: FeatureLayerCapabilitiesQueryRelated = js.native
}

object FeatureLayerCapabilities {
  @scala.inline
  def apply(
    attachment: FeatureLayerCapabilitiesAttachment,
    constructor: js.Function,
    data: FeatureLayerCapabilitiesData,
    editing: FeatureLayerCapabilitiesEditing,
    hasOwnProperty: PropertyKey => Boolean,
    metadata: FeatureLayerCapabilitiesMetadata,
    operations: FeatureLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: FeatureLayerCapabilitiesQuery,
    queryRelated: FeatureLayerCapabilitiesQueryRelated
  ): FeatureLayerCapabilities = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilities]
  }
  @scala.inline
  implicit class FeatureLayerCapabilitiesOps[Self <: FeatureLayerCapabilities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachment(value: FeatureLayerCapabilitiesAttachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: FeatureLayerCapabilitiesData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditing(value: FeatureLayerCapabilitiesEditing): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: FeatureLayerCapabilitiesMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperations(value: FeatureLayerCapabilitiesOperations): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: FeatureLayerCapabilitiesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryRelated(value: FeatureLayerCapabilitiesQueryRelated): Self = this.set("queryRelated", value.asInstanceOf[js.Any])
  }
  
}

