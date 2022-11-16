package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ArcGISImageServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ArcGISImageService")
@js.native
open class ArcGISImageService ()
  extends StObject
     with typings.arcgisJsApi.esri.ArcGISImageService {
  def this(properties: ArcGISImageServiceProperties) = this()
}
/* static members */
object ArcGISImageService {
  
  @JSGlobal("__esri.ArcGISImageService")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ArcGISImageService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ArcGISImageService]
}
