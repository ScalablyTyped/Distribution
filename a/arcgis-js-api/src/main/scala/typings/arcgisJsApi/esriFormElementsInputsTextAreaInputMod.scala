package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.esri.TextAreaInput
import typings.arcgisJsApi.esri.TextAreaInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsTextAreaInputMod {
  
  @JSImport("esri/form/elements/inputs/TextAreaInput", JSImport.Namespace)
  @js.native
  /**
  		 * The `TextAreaInput` class defines the desired user interface as a multi-line text area.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html)
  		 */
  open class ^ ()
    extends StObject
       with TextAreaInput {
    def this(properties: TextAreaInputProperties) = this()
    
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
    
    /**
    		 * The type of form element input.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html#type)
    		 */
    /* CompleteClass */
    override val `type`: `text-area` = js.native
  }
  @JSImport("esri/form/elements/inputs/TextAreaInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TextAreaInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TextAreaInput]
}
