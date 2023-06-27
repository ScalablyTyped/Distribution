package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ActiveLayerInfo
import typings.arcgisJsApi.esri.ActiveLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLegendSupportActiveLayerInfoMod {
  
  @JSImport("esri/widgets/Legend/support/ActiveLayerInfo", JSImport.Namespace)
  @js.native
  /**
  		 * ActiveLayerInfo is added to or removed from the collection of activeLayerInfos as layers become visible or invisible in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with ActiveLayerInfo {
    def this(properties: ActiveLayerInfoProperties) = this()
  }
}
