package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Sketch
import typings.arcgisJsApi.esri.SketchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSketchMod {
  
  @JSImport("esri/widgets/Sketch", JSImport.Namespace)
  @js.native
  /**
  		 * Sketch widget provides a simple UI for creating and updating graphics on a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html)
  		 */
  open class ^ ()
    extends StObject
       with Sketch {
    def this(properties: SketchProperties) = this()
  }
}
