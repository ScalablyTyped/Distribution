package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PopupTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PopupTemplate")
@js.native
/**
		 * A PopupTemplate formats and defines the content of a [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) for a specific [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) or [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html)
		 */
open class PopupTemplate ()
  extends StObject
     with typings.arcgisJsApi.esri.PopupTemplate {
  def this(properties: PopupTemplateProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PopupTemplate {
  
  @JSGlobal("__esri.PopupTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PopupTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PopupTemplate]
}
