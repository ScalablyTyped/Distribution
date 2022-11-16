package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditedFeatureResultEditedFeaturesUpdates extends StObject {
  
  /**
    * Updated feature as a result of editing a feature that participates in a composite relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var current: js.UndefOr[js.Array[Graphic]] = js.undefined
  
  /**
    * Original feature before the update took place.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditedFeatureResult)
    */
  var original: js.UndefOr[js.Array[Graphic]] = js.undefined
}
object EditedFeatureResultEditedFeaturesUpdates {
  
  inline def apply(): EditedFeatureResultEditedFeaturesUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditedFeatureResultEditedFeaturesUpdates]
  }
  
  extension [Self <: EditedFeatureResultEditedFeaturesUpdates](x: Self) {
    
    inline def setCurrent(value: js.Array[Graphic]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setCurrentVarargs(value: Graphic*): Self = StObject.set(x, "current", js.Array(value*))
    
    inline def setOriginal(value: js.Array[Graphic]): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    inline def setOriginalVarargs(value: Graphic*): Self = StObject.set(x, "original", js.Array(value*))
  }
}
