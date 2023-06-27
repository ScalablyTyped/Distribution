package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Element")
@js.native
/**
		 * Form elements define what should display within the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html) elements.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html)
		 */
open class Element ()
  extends StObject
     with typings.arcgisJsApi.esri.Element {
  def this(properties: ElementProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Element {
  
  @JSGlobal("__esri.Element")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Element]
}
