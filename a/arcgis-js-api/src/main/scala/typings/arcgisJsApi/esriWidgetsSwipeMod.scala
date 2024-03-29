package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Swipe
import typings.arcgisJsApi.esri.SwipeProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSwipeMod {
  
  @JSImport("esri/widgets/Swipe", JSImport.Namespace)
  @js.native
  /**
  		 * The Swipe widget provides a tool to show a portion of a layer or layers on top of a map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe.html)
  		 */
  open class ^ ()
    extends StObject
       with Swipe {
    def this(properties: SwipeProperties) = this()
  }
}
