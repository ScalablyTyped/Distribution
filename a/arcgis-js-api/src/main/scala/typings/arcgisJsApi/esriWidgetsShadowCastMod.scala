package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ShadowCast
import typings.arcgisJsApi.esri.ShadowCastProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsShadowCastMod {
  
  @JSImport("esri/widgets/ShadowCast", JSImport.Namespace)
  @js.native
  /**
    * The ShadowCast widget displays the cumulative shadows of 3D features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html)
    */
  open class ^ ()
    extends StObject
       with ShadowCast {
    def this(properties: ShadowCastProperties) = this()
  }
}
