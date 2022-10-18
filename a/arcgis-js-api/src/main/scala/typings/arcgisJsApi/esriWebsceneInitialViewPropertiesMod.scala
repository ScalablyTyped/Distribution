package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.websceneInitialViewProperties
import typings.arcgisJsApi.esri.websceneInitialViewPropertiesConstructor
import typings.arcgisJsApi.esri.websceneInitialViewPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneInitialViewPropertiesMod extends Shortcut {
  
  @JSImport("esri/webscene/InitialViewProperties", JSImport.Namespace)
  @js.native
  val ^ : js.Object & websceneInitialViewPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/InitialViewProperties", JSImport.Namespace)
  @js.native
  /**
    * Represents the initial viewing state of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) when displayed in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html)
    */
  open class Class ()
    extends StObject
       with websceneInitialViewProperties {
    def this(properties: websceneInitialViewPropertiesProperties) = this()
  }
  
  type _To = js.Object & websceneInitialViewPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebsceneInitialViewPropertiesMod.foo` */
  override def _to: js.Object & websceneInitialViewPropertiesConstructor = ^
}
