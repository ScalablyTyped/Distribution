package typings.arcgisJsApi.geometryMod

import typings.arcgisJsApi.esri.PointProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/geometry", "Point")
@js.native
/**
  * A location defined by X, Y, and Z coordinates.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
  */
class PointCls ()
  extends typings.arcgisJsApi.esri.Point {
  def this(properties: PointProperties) = this()
}
