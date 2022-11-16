package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import typings.arcgisJsApi.arcgisJsApiStrings.group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupElement
  extends StObject
     with Element {
  
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.Array[FieldElement] = js.native
  
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed.
    *
    * @default expanded
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    */
  var initialState: collapsed | expanded = js.native
  
  /**
    * The type of the [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#type)
    */
  @JSName("type")
  var type_GroupElement: group = js.native
}
