package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.HeatmapColorStopProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.HeatmapColorStop")
@js.native
/**
  * This class is used to define an array of objects describing the [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html)'s color ramp and associated density value ratios.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html)
  */
open class HeatmapColorStopCls ()
  extends StObject
     with typings.arcgisJsApi.esri.HeatmapColorStop {
  def this(properties: HeatmapColorStopProperties) = this()
}
