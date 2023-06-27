package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.AuthoringInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.AuthoringInfo")
@js.native
/**
		 * Authoring information related to generating renderers and visual variables with the Smart Mapping methods.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html)
		 */
open class AuthoringInfo ()
  extends StObject
     with typings.arcgisJsApi.esri.AuthoringInfo {
  def this(properties: AuthoringInfoProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object AuthoringInfo {
  
  @JSGlobal("__esri.AuthoringInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.AuthoringInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.AuthoringInfo]
}
