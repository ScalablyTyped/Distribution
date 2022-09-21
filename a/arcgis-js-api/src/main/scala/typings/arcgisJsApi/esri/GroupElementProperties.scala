package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupElementProperties
  extends StObject
     with ElementProperties {
  
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.UndefOr[js.Array[FieldElementProperties]] = js.undefined
  
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed.
    *
    * @default expanded
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    */
  var initialState: js.UndefOr[collapsed | expanded] = js.undefined
}
object GroupElementProperties {
  
  inline def apply(): GroupElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupElementProperties]
  }
  
  extension [Self <: GroupElementProperties](x: Self) {
    
    inline def setElements(value: js.Array[FieldElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: FieldElementProperties*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setInitialState(value: collapsed | expanded): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
  }
}
