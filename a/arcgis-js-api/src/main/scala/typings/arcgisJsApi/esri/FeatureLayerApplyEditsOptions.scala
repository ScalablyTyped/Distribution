package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureLayerApplyEditsOptions extends Object {
  
  /**
    * The geodatabase version to apply the edits.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the edits can be applied using globalIds of features or attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var globalIdUsed: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the edits should be applied only if all submitted edits succeed.
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
