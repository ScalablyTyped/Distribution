package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PolylineDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PolylineDrawAction")
@js.native
/**
  * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html#events-summary) to generate a set of vertices to create a new [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolylineDrawAction.html)
  */
open class PolylineDrawActionCls ()
  extends StObject
     with typings.arcgisJsApi.esri.PolylineDrawAction {
  def this(properties: PolylineDrawActionProperties) = this()
}
