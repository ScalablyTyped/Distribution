package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.PointDrawAction")
@js.native
/**
  * This class uses the view events to generate a set of coordinates to create a new [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html)
  */
open class PointDrawActionCls ()
  extends StObject
     with typings.arcgisJsApi.esri.PointDrawAction {
  def this(properties: PointDrawActionProperties) = this()
}
