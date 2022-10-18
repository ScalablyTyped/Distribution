package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PolylineDrawAction
import typings.arcgisJsApi.esri.PolylineDrawActionConstructor
import typings.arcgisJsApi.esri.PolylineDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawPolylineDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/PolylineDrawAction", JSImport.Namespace)
  @js.native
  val ^ : js.Object & PolylineDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/PolylineDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#events-summary) to generate a set of vertices to create a new [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html)
    */
  open class Class ()
    extends StObject
       with PolylineDrawAction {
    def this(properties: PolylineDrawActionProperties) = this()
  }
  
  type _To = js.Object & PolylineDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsDrawPolylineDrawActionMod.foo` */
  override def _to: js.Object & PolylineDrawActionConstructor = ^
}
