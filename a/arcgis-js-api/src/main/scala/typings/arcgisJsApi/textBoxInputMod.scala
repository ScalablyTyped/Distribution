package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TextBoxInput
import typings.arcgisJsApi.esri.TextBoxInputConstructor
import typings.arcgisJsApi.esri.TextBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBoxInputMod extends Shortcut {
  
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TextBoxInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  /**
    * The `TextBoxInput` class defines the desired user interface as a single-line text box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextBoxInput.html)
    */
  open class Class ()
    extends StObject
       with TextBoxInput {
    def this(properties: TextBoxInputProperties) = this()
    
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
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TextBoxInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `textBoxInputMod.foo` */
  override def _to: js.Object & TextBoxInputConstructor = ^
}
