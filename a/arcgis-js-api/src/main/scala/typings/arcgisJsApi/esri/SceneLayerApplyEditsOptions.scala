package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneLayerApplyEditsOptions
  extends StObject
     with Object {
  
  /**
    * Indicates whether the edits can be applied using globalIds of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits)
    */
  var globalIdUsed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the edits should be applied only if all submitted edits succeed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#applyEdits)
    */
  var rollbackOnFailureEnabled: js.UndefOr[Boolean] = js.undefined
}
object SceneLayerApplyEditsOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneLayerApplyEditsOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneLayerApplyEditsOptions]
  }
  
  extension [Self <: SceneLayerApplyEditsOptions](x: Self) {
    
    inline def setGlobalIdUsed(value: Boolean): Self = StObject.set(x, "globalIdUsed", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdUsedUndefined: Self = StObject.set(x, "globalIdUsed", js.undefined)
    
    inline def setRollbackOnFailureEnabled(value: Boolean): Self = StObject.set(x, "rollbackOnFailureEnabled", value.asInstanceOf[js.Any])
    
    inline def setRollbackOnFailureEnabledUndefined: Self = StObject.set(x, "rollbackOnFailureEnabled", js.undefined)
  }
}
