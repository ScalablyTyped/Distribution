package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.RadioButtonsInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.RadioButtonsInput")
@js.native
/**
  * The `RadioButtonsInput` class defines the desired user interface for a radio button group.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-RadioButtonsInput.html)
  */
open class RadioButtonsInput ()
  extends StObject
     with typings.arcgisJsApi.esri.RadioButtonsInput {
  def this(properties: RadioButtonsInputProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object RadioButtonsInput {
  
  @JSGlobal("__esri.RadioButtonsInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.RadioButtonsInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.RadioButtonsInput]
}
