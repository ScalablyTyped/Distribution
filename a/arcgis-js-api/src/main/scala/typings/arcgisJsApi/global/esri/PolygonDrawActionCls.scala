package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolygonDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PolygonDrawAction")
@js.native
/**
  * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#events-summary) to generate a set of vertices to create a new [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html)
  */
open class PolygonDrawActionCls ()
  extends StObject
     with typings.arcgisJsApi.esri.PolygonDrawAction {
  def this(properties: PolygonDrawActionProperties) = this()
}
