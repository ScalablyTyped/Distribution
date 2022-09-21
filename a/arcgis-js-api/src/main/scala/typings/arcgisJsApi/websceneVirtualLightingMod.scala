package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.websceneVirtualLighting
import typings.arcgisJsApi.esri.websceneVirtualLightingConstructor
import typings.arcgisJsApi.esri.websceneVirtualLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object websceneVirtualLightingMod extends Shortcut {
  
  @JSImport("esri/webscene/VirtualLighting", JSImport.Namespace)
  @js.native
  val ^ : js.Object & websceneVirtualLightingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/VirtualLighting", JSImport.Namespace)
  @js.native
  /**
    * The virtual lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit with a virtual light.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html)
    */
  open class Class ()
    extends StObject
       with websceneVirtualLighting {
    def this(properties: websceneVirtualLightingProperties) = this()
  }
  
  type _To = js.Object & websceneVirtualLightingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `websceneVirtualLightingMod.foo` */
  override def _to: js.Object & websceneVirtualLightingConstructor = ^
}
