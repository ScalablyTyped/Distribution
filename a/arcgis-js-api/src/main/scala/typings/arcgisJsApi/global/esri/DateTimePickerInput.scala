package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DateTimePickerInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.DateTimePickerInput")
@js.native
/**
  * The `DateTimePickerInput` class defines the desired user interface for editing date fields in a form.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-DateTimePickerInput.html)
  */
open class DateTimePickerInput ()
  extends StObject
     with typings.arcgisJsApi.esri.DateTimePickerInput {
  def this(properties: DateTimePickerInputProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object DateTimePickerInput {
  
  @JSGlobal("__esri.DateTimePickerInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.DateTimePickerInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.DateTimePickerInput]
}
