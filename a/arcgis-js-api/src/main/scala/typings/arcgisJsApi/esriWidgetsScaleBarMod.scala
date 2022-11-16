package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ScaleBar
import typings.arcgisJsApi.esri.ScaleBarProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsScaleBarMod {
  
  @JSImport("esri/widgets/ScaleBar", JSImport.Namespace)
  @js.native
  /**
    * The ScaleBar widget displays a scale bar on the map or in a specified HTML node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleBar.html)
    */
  open class ^ ()
    extends StObject
       with ScaleBar {
    def this(properties: ScaleBarProperties) = this()
  }
}
