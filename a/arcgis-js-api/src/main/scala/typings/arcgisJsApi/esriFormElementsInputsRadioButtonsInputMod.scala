package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RadioButtonsInput
import typings.arcgisJsApi.esri.RadioButtonsInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsRadioButtonsInputMod {
  
  @JSImport("esri/form/elements/inputs/RadioButtonsInput", JSImport.Namespace)
  @js.native
  /**
    * The `RadioButtonsInput` class defines the desired user interface for a radio button group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html)
    */
  open class ^ ()
    extends StObject
       with RadioButtonsInput {
    def this(properties: RadioButtonsInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/inputs/RadioButtonsInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): RadioButtonsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RadioButtonsInput]
}
