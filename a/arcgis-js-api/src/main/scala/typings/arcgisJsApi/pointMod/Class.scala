package typings.arcgisJsApi.pointMod

import typings.arcgisJsApi.esri.Point
import typings.arcgisJsApi.esri.PointProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/geometry/Point", JSImport.Namespace)
@js.native
/**
  * A location defined by X, Y, and Z coordinates.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
  */
class Class () extends Point {
  def this(properties: PointProperties) = this()
}
