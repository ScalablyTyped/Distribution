package typings.arcgisJsApi

import typings.arcgisJsApi.esri.VirtualLighting
import typings.arcgisJsApi.esri.VirtualLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentVirtualLightingMod {
  
  @JSImport("esri/views/3d/environment/VirtualLighting", JSImport.Namespace)
  @js.native
  /**
  		 * The VirtualLighting class allows you to change the lighting in the scene to virtual light.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-VirtualLighting.html)
  		 */
  open class ^ ()
    extends StObject
       with VirtualLighting {
    def this(properties: VirtualLightingProperties) = this()
  }
}
