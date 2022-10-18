package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.websceneSunLighting
import typings.arcgisJsApi.esri.websceneSunLightingConstructor
import typings.arcgisJsApi.esri.websceneSunLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneSunLightingMod extends Shortcut {
  
  @JSImport("esri/webscene/SunLighting", JSImport.Namespace)
  @js.native
  val ^ : js.Object & websceneSunLightingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/SunLighting", JSImport.Namespace)
  @js.native
  /**
    * The sun lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-SunLighting.html)
    */
  open class Class ()
    extends StObject
       with websceneSunLighting {
    def this(properties: websceneSunLightingProperties) = this()
  }
  
  type _To = js.Object & websceneSunLightingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebsceneSunLightingMod.foo` */
  override def _to: js.Object & websceneSunLightingConstructor = ^
}
