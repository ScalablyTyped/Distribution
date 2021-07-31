package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.Layer
import typings.arcgisJsApi.esri.WebScene
import typings.arcgisJsApi.esri.WebSceneConstructor
import typings.arcgisJsApi.esri.WebSceneProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSceneMod extends Shortcut {
  
  @JSImport("esri/WebScene", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WebSceneConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/WebScene", JSImport.Namespace)
  @js.native
  /**
    * The web scene is the core element of 3D mapping across the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html)
    */
  class Class ()
    extends StObject
       with WebScene {
    def this(properties: WebSceneProperties) = this()
    
    /**
      * A collection of [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) instances that are tables saved in a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and/or a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-TablesMixin.html#tables)
      */
    /* CompleteClass */
    var tables: Collection[Layer] = js.native
  }
  
  type _To = js.Object & WebSceneConstructor
  
  /* This means you don't have to write `^`, but can instead just say `webSceneMod.foo` */
  override def _to: js.Object & WebSceneConstructor = ^
}
