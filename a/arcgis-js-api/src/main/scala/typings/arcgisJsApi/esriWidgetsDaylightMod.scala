package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Daylight
import typings.arcgisJsApi.esri.DaylightProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDaylightMod {
  
  @JSImport("esri/widgets/Daylight", JSImport.Namespace)
  @js.native
  /**
    * The Daylight widget can be used to manipulate the lighting conditions of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html)
    */
  open class ^ ()
    extends StObject
       with Daylight {
    def this(properties: DaylightProperties) = this()
  }
}
