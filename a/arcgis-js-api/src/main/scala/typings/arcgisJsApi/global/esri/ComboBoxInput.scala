package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ComboBoxInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ComboBoxInput")
@js.native
/**
  * The `ComboBoxInput` class defines the desired user interface for a combo box  group.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-ComboBoxInput.html)
  */
open class ComboBoxInput ()
  extends StObject
     with typings.arcgisJsApi.esri.ComboBoxInput {
  def this(properties: ComboBoxInputProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ComboBoxInput {
  
  @JSGlobal("__esri.ComboBoxInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ComboBoxInput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ComboBoxInput]
}
