package typings.arcgisJsApi

import typings.arcgisJsApi.esri.WidgetProperties
import typings.arcgisJsApi.esri.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsWidgetMod {
  
  @JSImport("esri/widgets/Widget", JSImport.Namespace)
  @js.native
  /**
  		 * The base class for the SDK's out-of-the-box widgets.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html)
  		 */
  open class ^ ()
    extends StObject
       with Widget_ {
    def this(properties: WidgetProperties) = this()
  }
}
