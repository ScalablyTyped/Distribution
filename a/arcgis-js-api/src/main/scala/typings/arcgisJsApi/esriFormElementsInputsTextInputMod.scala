package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TextInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriFormElementsInputsTextInputMod {
  
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TextInput {
    
    /**
      * When set, defines the text input's maximum length.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#maxLength)
      */
    /* CompleteClass */
    var maxLength: Double = js.native
    
    /**
      * When set, defines the text input's minimum length.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextInput.html#minLength)
      */
    /* CompleteClass */
    var minLength: Double = js.native
  }
}
