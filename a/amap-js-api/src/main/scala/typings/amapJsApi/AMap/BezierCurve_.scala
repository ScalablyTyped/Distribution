package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BezierCurve_[ExtraData] extends Polyline[ExtraData] {
  
  // internal
  def getInterpolateLngLats(): js.Array[LngLat] = js.native
  
  def getSerializedPath(): js.Array[js.Array[Double]] = js.native
}
