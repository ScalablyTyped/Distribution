package typings.arcgisDashJsDashApi.esriViewsDrawDrawActionMod

import typings.arcgisDashJsDashApi.__esri.DrawAction
import typings.arcgisDashJsDashApi.__esri.DrawActionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/views/draw/DrawAction", JSImport.Namespace)
@js.native
/**
  * DrawAction is the base class for all draw actions. DrawActions use the view events to generate a set of coordinates to create new geometries. Each serves a different purpose, allowing you to create a different type geometry such as [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html), [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), and [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html)
  */
class Class () extends DrawAction {
  def this(properties: DrawActionProperties) = this()
}

