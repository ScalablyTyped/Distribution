package typings.arcgisJsApi

import typings.arcgisJsApi.esri.DateTimePickerInput
import typings.arcgisJsApi.esri.DateTimePickerInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriFormElementsInputsDateTimePickerInputMod {
  
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  /**
    * The `DateTimePickerInput` class defines the desired user interface for editing date fields in a form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html)
    */
  open class ^ ()
    extends StObject
       with DateTimePickerInput {
    def this(properties: DateTimePickerInputProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/form/elements/inputs/DateTimePickerInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): DateTimePickerInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[DateTimePickerInput]
}
