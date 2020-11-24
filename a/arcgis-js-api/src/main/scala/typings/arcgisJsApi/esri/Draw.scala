package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.ellipse
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw extends Accessor {
  
  /**
    * A reference to the active [draw action](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#activeAction)
    */
  var activeAction: DrawAction = js.native
  
  /**
    * Complete the current active drawing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#complete)
    */
  def complete(): Unit = js.native
  
  @JSName("create")
  def create_circle(drawAction: circle): DrawAction = js.native
  @JSName("create")
  def create_circle(drawAction: circle, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  @JSName("create")
  def create_ellipse(drawAction: ellipse): DrawAction = js.native
  @JSName("create")
  def create_ellipse(drawAction: ellipse, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  @JSName("create")
  def create_multipoint(drawAction: multipoint): DrawAction = js.native
  @JSName("create")
  def create_multipoint(drawAction: multipoint, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  /**
    * Creates an instance of the requested draw action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create)
    */
  @JSName("create")
  def create_point(drawAction: point): DrawAction = js.native
  @JSName("create")
  def create_point(drawAction: point, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  @JSName("create")
  def create_polygon(drawAction: polygon): DrawAction = js.native
  @JSName("create")
  def create_polygon(drawAction: polygon, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  @JSName("create")
  def create_polyline(drawAction: polyline): DrawAction = js.native
  @JSName("create")
  def create_polyline(drawAction: polyline, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  @JSName("create")
  def create_rectangle(drawAction: rectangle): DrawAction = js.native
  @JSName("create")
  def create_rectangle(drawAction: rectangle, drawOptions: DrawCreateDrawOptions): DrawAction = js.native
  
  /**
    * Resets the drawing by clearing the active action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#reset)
    */
  def reset(): Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#view)
    */
  var view: MapView = js.native
}
