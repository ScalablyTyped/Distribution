package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`original-and-current-features`
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerApplyEditsOptions
  extends StObject
     with Object {
  
  /**
    * The geodatabase version to apply the edits.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the edits can be applied using globalIds of features or attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var globalIdUsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the edit results should return the time edits were applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var returnEditMoment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `original-and-current-features`, the [EditedFeatureResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult) parameter will be included in the `applyEdits` response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var returnServiceEditsOption: js.UndefOr[none_ | `original-and-current-features`] = js.undefined
  
  /**
    * Indicates whether the edits should be applied only if all submitted edits succeed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits)
    */
  var rollbackOnFailureEnabled: js.UndefOr[Boolean] = js.undefined
}
object FeatureLayerApplyEditsOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FeatureLayerApplyEditsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[FeatureLayerApplyEditsOptions]
  }
  
  extension [Self <: FeatureLayerApplyEditsOptions](x: Self) {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setGlobalIdUsed(value: Boolean): Self = StObject.set(x, "globalIdUsed", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdUsedUndefined: Self = StObject.set(x, "globalIdUsed", js.undefined)
    
    inline def setReturnEditMoment(value: Boolean): Self = StObject.set(x, "returnEditMoment", value.asInstanceOf[js.Any])
    
    inline def setReturnEditMomentUndefined: Self = StObject.set(x, "returnEditMoment", js.undefined)
    
    inline def setReturnServiceEditsOption(value: none_ | `original-and-current-features`): Self = StObject.set(x, "returnServiceEditsOption", value.asInstanceOf[js.Any])
    
    inline def setReturnServiceEditsOptionUndefined: Self = StObject.set(x, "returnServiceEditsOption", js.undefined)
    
    inline def setRollbackOnFailureEnabled(value: Boolean): Self = StObject.set(x, "rollbackOnFailureEnabled", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnFailureEnabledUndefined: Self = StObject.set(x, "rollbackOnFailureEnabled", js.undefined)
  }
}
