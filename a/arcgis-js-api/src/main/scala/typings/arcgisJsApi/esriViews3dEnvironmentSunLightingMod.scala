package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SunLighting
import typings.arcgisJsApi.esri.SunLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentSunLightingMod {
  
  @JSImport("esri/views/3d/environment/SunLighting", JSImport.Namespace)
  @js.native
  /**
    * The SunLighting class allows you to change the lighting in the scene to sunlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html)
    */
  open class ^ ()
    extends StObject
       with SunLighting {
    def this(properties: SunLightingProperties) = this()
  }
}
