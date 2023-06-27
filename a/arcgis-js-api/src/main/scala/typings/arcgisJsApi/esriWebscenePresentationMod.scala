package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Presentation
import typings.arcgisJsApi.esri.PresentationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebscenePresentationMod {
  
  @JSImport("esri/webscene/Presentation", JSImport.Namespace)
  @js.native
  /**
  		 * A presentation contains a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [slides](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html) that allows users to quickly navigate to predefined settings of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Presentation.html)
  		 */
  open class ^ ()
    extends StObject
       with Presentation {
    def this(properties: PresentationProperties) = this()
  }
}
