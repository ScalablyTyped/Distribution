package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SegmentDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SegmentDrawAction")
@js.native
/**
  * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#events-summary) to generate a set of vertices to create a geometry with [drag mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode) or with two clicks.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html)
  */
open class SegmentDrawActionCls ()
  extends StObject
     with typings.arcgisJsApi.esri.SegmentDrawAction {
  def this(properties: SegmentDrawActionProperties) = this()
}
