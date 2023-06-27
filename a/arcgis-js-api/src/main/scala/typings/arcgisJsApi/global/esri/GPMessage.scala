package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GPMessageProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GPMessage")
@js.native
/**
		 * Represents a message generated during the execution of a module:esri/rest/Geoprocessor method.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GPMessage.html)
		 */
open class GPMessage ()
  extends StObject
     with typings.arcgisJsApi.esri.GPMessage {
  def this(properties: GPMessageProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object GPMessage {
  
  @JSGlobal("__esri.GPMessage")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.GPMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.GPMessage]
}
