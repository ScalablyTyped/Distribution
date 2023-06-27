package typings.arcgisJsApi

import typings.arcgisJsApi.esri.websceneVirtualLighting
import typings.arcgisJsApi.esri.websceneVirtualLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneVirtualLightingMod {
  
  @JSImport("esri/webscene/VirtualLighting", JSImport.Namespace)
  @js.native
  /**
  		 * The virtual lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit with a virtual light.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html)
  		 */
  open class ^ ()
    extends StObject
       with websceneVirtualLighting {
    def this(properties: websceneVirtualLightingProperties) = this()
  }
}
