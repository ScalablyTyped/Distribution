package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ArcGISImageService
import typings.arcgisJsApi.esri.ArcGISImageServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersMixinsArcGISImageServiceMod {
  
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ArcGISImageService {
    def this(properties: ArcGISImageServiceProperties) = this()
  }
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ArcGISImageService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ArcGISImageService]
}
