package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FeatureForm
import typings.arcgisJsApi.esri.FeatureFormProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFeatureFormMod {
  
  @JSImport("esri/widgets/FeatureForm", JSImport.Namespace)
  @js.native
  /**
    * The FeatureForm widget displays attributes of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html)
    */
  open class ^ ()
    extends StObject
       with FeatureForm {
    def this(properties: FeatureFormProperties) = this()
  }
}
