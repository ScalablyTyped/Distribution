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
  var `type`: js.UndefOr[selection] = js.undefined
}
object FeatureReductionSelection {
  
  inline def apply(): FeatureReductionSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureReductionSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureReductionSelection] (val x: Self) extends AnyVal {
    
    inline def setType(value: selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
