package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PointDrawAction
import typings.arcgisJsApi.esri.PointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawPointDrawActionMod {
  
  @JSImport("esri/views/draw/PointDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses the view events to generate a set of coordinates to create a new [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PointDrawAction.html)
    */
  open class ^ ()
    extends StObject
       with PointDrawAction {
    def this(properties: PointDrawActionProperties) = this()
  }
}
