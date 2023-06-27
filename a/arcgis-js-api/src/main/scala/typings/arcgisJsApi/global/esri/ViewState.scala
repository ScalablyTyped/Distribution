package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ViewStateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ViewState")
@js.native
/**
		 * Object that holds information about the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) state.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-ViewState.html)
		 */
open class ViewState ()
  extends StObject
     with typings.arcgisJsApi.esri.ViewState {
  def this(properties: ViewStateProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ViewState {
  
  @JSGlobal("__esri.ViewState")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ViewState = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ViewState]
}
