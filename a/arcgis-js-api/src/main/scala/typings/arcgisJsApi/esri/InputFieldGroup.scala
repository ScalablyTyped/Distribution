package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputFieldGroup
  extends StObject
     with Accessor {
  
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: String = js.native
  
  /**
    * The result of `visibilityExpression`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#evaluatedVisibilityExpression)
    */
  val evaluatedVisibilityExpression: Boolean = js.native
  
  /**
    * The input fields belonging to this group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#inputFields)
    */
  val inputFields: js.Array[InputField] = js.native
  
  /**
    * The group's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#label)
    */
  val label: String = js.native
  
  var state: expanded | collapsed = js.native
  
  /**
    * Arcade expression to determine whether this group is visible or not.
    *
    * @default null
    * @deprecated Since 4.23. Use {@link esri/form/elements/GroupElement#visibilityExpression groupElement.visibilityExpression}
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visibilityExpression)
    */
  var visibilityExpression: String = js.native
  
  /**
    * The group's visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visible)
    */
  val visible: Boolean = js.native
}
