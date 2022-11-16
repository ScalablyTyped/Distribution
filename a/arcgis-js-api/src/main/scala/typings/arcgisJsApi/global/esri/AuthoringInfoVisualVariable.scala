package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AuthoringInfoVisualVariableProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AuthoringInfoVisualVariable")
@js.native
/**
  * Contains authoring properties of visual variables generated from one of the Smart Mapping methods or sliders.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfoVisualVariable.html)
  */
open class AuthoringInfoVisualVariable ()
  extends StObject
     with typings.arcgisJsApi.esri.AuthoringInfoVisualVariable {
  def this(properties: AuthoringInfoVisualVariableProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AuthoringInfoVisualVariable {
  
  @JSGlobal("__esri.AuthoringInfoVisualVariable")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AuthoringInfoVisualVariable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AuthoringInfoVisualVariable]
}
