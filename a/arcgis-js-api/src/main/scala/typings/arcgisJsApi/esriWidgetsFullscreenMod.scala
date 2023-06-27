package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Fullscreen
import typings.arcgisJsApi.esri.FullscreenProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFullscreenMod {
  
  @JSImport("esri/widgets/Fullscreen", JSImport.Namespace)
  @js.native
  /**
  		 * Provides a simple widget to present the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) or a user-defined [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) using the entire screen.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen.html)
  		 */
  open class ^ ()
    extends StObject
       with Fullscreen {
    def this(properties: FullscreenProperties) = this()
  }
}
