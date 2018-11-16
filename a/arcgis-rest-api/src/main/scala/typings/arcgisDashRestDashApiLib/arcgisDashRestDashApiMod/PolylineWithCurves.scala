package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PolylineWithCurves
  extends HasZM
     with Geometry {
  var curvePaths: js.Array[js.Array[Position | JsonCurve]]
}

