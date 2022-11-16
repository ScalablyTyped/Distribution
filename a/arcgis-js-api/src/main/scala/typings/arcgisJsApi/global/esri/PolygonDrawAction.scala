package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolygonDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PolygonDrawAction")
@js.native
/**
  * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#events-summary) to generate a set of vertices to create a new [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html)
  */
open class PolygonDrawAction ()
  extends StObject
     with typings.arcgisJsApi.esri.PolygonDrawAction {
  def this(properties: PolygonDrawActionProperties) = this()
}
