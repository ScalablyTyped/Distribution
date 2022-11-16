package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Zoom
import typings.arcgisJsApi.esri.ZoomProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsZoomMod {
  
  @JSImport("esri/widgets/Zoom", JSImport.Namespace)
  @js.native
  /**
    * The Zoom widget allows users to zoom in/out within a view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Zoom.html)
    */
  open class ^ ()
    extends StObject
       with Zoom {
    def this(properties: ZoomProperties) = this()
  }
}
