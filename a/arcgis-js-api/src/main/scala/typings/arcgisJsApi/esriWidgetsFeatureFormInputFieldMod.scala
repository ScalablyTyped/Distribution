package typings.arcgisJsApi

import typings.arcgisJsApi.esri.InputField
import typings.arcgisJsApi.esri.InputFieldProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormInputFieldMod {
  
  @JSImport("esri/widgets/FeatureForm/InputField", JSImport.Namespace)
  @js.native
  /**
    * This is a read-only support class that represents an input field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html)
    */
  open class ^ ()
    extends StObject
       with InputField {
    def this(properties: InputFieldProperties) = this()
  }
}
