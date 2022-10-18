package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BasemapView
import typings.arcgisJsApi.esri.BasemapViewConstructor
import typings.arcgisJsApi.esri.BasemapViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsBasemapViewMod extends Shortcut {
  
  @JSImport("esri/views/BasemapView", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BasemapViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/BasemapView", JSImport.Namespace)
  @js.native
  /**
    * Represents the view for a single basemap after it has been added to either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BasemapView.html)
    */
  open class Class ()
    extends StObject
       with BasemapView {
    def this(properties: BasemapViewProperties) = this()
  }
  
  type _To = js.Object & BasemapViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsBasemapViewMod.foo` */
  override def _to: js.Object & BasemapViewConstructor = ^
}
