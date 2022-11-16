package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PolylineDrawAction
import typings.arcgisJsApi.esri.PolylineDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawPolylineDrawActionMod {
  
  @JSImport("esri/views/draw/PolylineDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#events-summary) to generate a set of vertices to create a new [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html)
    */
  open class ^ ()
    extends StObject
       with PolylineDrawAction {
    def this(properties: PolylineDrawActionProperties) = this()
  }
}
