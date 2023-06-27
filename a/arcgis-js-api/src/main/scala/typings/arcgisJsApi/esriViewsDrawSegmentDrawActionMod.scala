package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SegmentDrawAction
import typings.arcgisJsApi.esri.SegmentDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawSegmentDrawActionMod {
  
  @JSImport("esri/views/draw/SegmentDrawAction", JSImport.Namespace)
  @js.native
  /**
  		 * This class uses different [events](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#events-summary) to generate a set of vertices to create a geometry with [drag mode](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html#mode) or with two clicks.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-SegmentDrawAction.html)
  		 */
  open class ^ ()
    extends StObject
       with SegmentDrawAction {
    def this(properties: SegmentDrawActionProperties) = this()
  }
}
