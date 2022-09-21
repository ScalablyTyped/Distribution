package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.FeatureReductionSelectionProperties & {  type :'selection'} */
trait FeatureReductionSelection extends StObject {
  
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionSelection.html#type)
    */
  var `type`: js.UndefOr[selection] & selection
}
object FeatureReductionSelection {
  
  inline def apply(`type`: js.UndefOr[selection] & selection): FeatureReductionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureReductionSelection]
  }
  
  extension [Self <: FeatureReductionSelection](x: Self) {
    
    inline def setType(value: js.UndefOr[selection] & selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
