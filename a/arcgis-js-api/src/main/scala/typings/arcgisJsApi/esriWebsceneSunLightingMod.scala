package typings.arcgisJsApi

import typings.arcgisJsApi.esri.websceneSunLighting
import typings.arcgisJsApi.esri.websceneSunLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneSunLightingMod {
  
  @JSImport("esri/webscene/SunLighting", JSImport.Namespace)
  @js.native
  /**
    * The sun lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html)
    */
  open class ^ ()
    extends StObject
       with websceneSunLighting {
    def this(properties: websceneSunLightingProperties) = this()
  }
}
