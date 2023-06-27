package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ComboBoxInput
import typings.arcgisJsApi.esri.ComboBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsComboBoxInputMod {
  
  @JSImport("esri/form/elements/inputs/ComboBoxInput", JSImport.Namespace)
  @js.native
  /**
  		 * The `ComboBoxInput` class defines the desired user interface for a combo box	 group.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html)
  		 */
  open class ^ ()
    extends StObject
       with ComboBoxInput {
    def this(properties: ComboBoxInputProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/inputs/ComboBoxInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ComboBoxInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ComboBoxInput]
}
