package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextInput
import typings.arcgisJsApi.esri.TextInputConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriFormElementsInputsTextInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  val ^ : TextInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextInput", JSImport.Namespace)
  @js.native
  open class Class ()
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
  
  type _To = TextInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriFormElementsInputsTextInputMod.foo` */
  override def _to: TextInputConstructor = ^
}
