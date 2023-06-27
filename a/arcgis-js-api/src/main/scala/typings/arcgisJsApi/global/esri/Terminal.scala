package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TerminalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Terminal")
@js.native
/**
		 * A device feature can be assigned a terminal configuration, which could have one or more terminals.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html)
		 */
open class Terminal ()
  extends StObject
     with typings.arcgisJsApi.esri.Terminal {
  def this(properties: TerminalProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Terminal {
  
  @JSGlobal("__esri.Terminal")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Terminal]
}
