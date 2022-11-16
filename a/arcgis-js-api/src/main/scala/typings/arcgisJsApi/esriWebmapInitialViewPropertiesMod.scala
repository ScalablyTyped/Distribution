package typings.arcgisJsApi

import typings.arcgisJsApi.esri.InitialViewProperties
import typings.arcgisJsApi.esri.InitialViewPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebmapInitialViewPropertiesMod {
  
  @JSImport("esri/webmap/InitialViewProperties", JSImport.Namespace)
  @js.native
  /**
    * Represents the initial viewing state of the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) when displayed in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-InitialViewProperties.html)
    */
  open class ^ ()
    extends StObject
       with InitialViewProperties {
    def this(properties: InitialViewPropertiesProperties) = this()
  }
}
