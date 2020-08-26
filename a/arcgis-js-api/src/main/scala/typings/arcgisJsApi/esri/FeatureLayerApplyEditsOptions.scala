package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerApplyEditsOptions extends Object {
  /**
    * The geodatabase version to apply the edits. This parameter applies only if the [capabilities.data.isVersioned](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is `true`. If the gdbVersion parameter is not specified, edits are made to the published map’s version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  /**
    * Indicates whether the edits can be applied using globalIds of features or attachments. This parameter applies only if the layer's [capabilities.editing.supportsGlobalId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property is `true`. When `false`, globalIds submitted with the features are ignored and the service assigns new globalIds to the new features. When `true`, the globalIds must be submitted with the new features. When updating existing features, if the `globalIdUsed` is `false`, the objectIds of the features to be updated must be provided. If the `globalIdUsed` is `true`, globalIds of features to be updated must be provided. When deleting existing features, set this property to `false` as deletes operation only accepts `objectIds` at the current version of the API.  When adding, updating or deleting attachments, `globalIdUsed` parameter must be set to `true` and the attachment globalId must be set. For new attachments, the user must provide globalIds. In order for an attachment to be updated or deleted, clients must include its globalId.  Attachments are not supported in an edit payload when `globalIdUsed` is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var globalIdUsed: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the edits should be applied only if all submitted edits succeed. If `false`, the server will apply the edits that succeed even if some of the submitted edits fail. If `true`, the server will apply the edits only if all edits succeed. The layer's [capabilities.editing.supportsRollbackOnFailure](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property must be `true` if using this parameter. If `supportsRollbackOnFailure` is `false` for a layer, then `rollbackOnFailureEnabled` will always be true, regardless of how the parameter is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var rollbackOnFailureEnabled: js.UndefOr[Boolean] = js.native
}

object FeatureLayerApplyEditsOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerApplyEditsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerApplyEditsOptions]
  }
  @scala.inline
  implicit class FeatureLayerApplyEditsOptionsOps[Self <: FeatureLayerApplyEditsOptions] (val x: Self) extends AnyVal {
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
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
    @scala.inline
    def setGlobalIdUsed(value: Boolean): Self = this.set("globalIdUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalIdUsed: Self = this.set("globalIdUsed", js.undefined)
    @scala.inline
    def setRollbackOnFailureEnabled(value: Boolean): Self = this.set("rollbackOnFailureEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRollbackOnFailureEnabled: Self = this.set("rollbackOnFailureEnabled", js.undefined)
  }
  
}

