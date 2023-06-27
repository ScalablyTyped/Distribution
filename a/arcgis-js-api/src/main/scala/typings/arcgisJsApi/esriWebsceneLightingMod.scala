package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Lighting
import typings.arcgisJsApi.esri.LightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneLightingMod {
  
  @JSImport("esri/webscene/Lighting", JSImport.Namespace)
  @js.native
  /**
  		 * The lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html)
  		 */
  open class ^ ()
    extends StObject
       with Lighting {
    def this(properties: LightingProperties) = this()
  }
}
