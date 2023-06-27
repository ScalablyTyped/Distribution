package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TextBoxInput
import typings.arcgisJsApi.esri.TextBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsTextBoxInputMod {
  
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  /**
  		 * The `TextBoxInput` class defines the desired user interface as a single-line text box.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextBoxInput.html)
  		 */
  open class ^ ()
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
  @JSImport("esri/form/elements/inputs/TextBoxInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TextBoxInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TextBoxInput]
}
