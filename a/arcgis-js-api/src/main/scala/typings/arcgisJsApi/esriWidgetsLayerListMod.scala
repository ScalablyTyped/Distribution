package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LayerList
import typings.arcgisJsApi.esri.LayerListProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLayerListMod {
  
  @JSImport("esri/widgets/LayerList", JSImport.Namespace)
  @js.native
  /**
  		 * The LayerList widget provides a way to display a list of layers, and switch on/off their visibility.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html)
  		 */
  open class ^ ()
    extends StObject
       with LayerList {
    def this(properties: LayerListProperties) = this()
  }
}
