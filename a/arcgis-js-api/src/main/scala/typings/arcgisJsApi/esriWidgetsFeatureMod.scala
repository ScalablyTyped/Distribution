package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Feature
import typings.arcgisJsApi.esri.FeatureProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureMod {
  
  @JSImport("esri/widgets/Feature", JSImport.Namespace)
  @js.native
  /**
  		 * The Feature widget displays a graphic according to its [PopupTemplate](esri-PopupTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature.html)
  		 */
  open class ^ ()
    extends StObject
       with Feature {
    def this(properties: FeatureProperties) = this()
  }
}
