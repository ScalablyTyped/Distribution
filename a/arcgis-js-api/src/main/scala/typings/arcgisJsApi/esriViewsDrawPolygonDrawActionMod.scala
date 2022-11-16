package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PolygonDrawAction
import typings.arcgisJsApi.esri.PolygonDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawPolygonDrawActionMod {
  
  @JSImport("esri/views/draw/PolygonDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#events-summary) to generate a set of vertices to create a new [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html)
    */
  open class ^ ()
    extends StObject
       with PolygonDrawAction {
    def this(properties: PolygonDrawActionProperties) = this()
  }
}
