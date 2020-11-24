package typings.amapJsApi.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathOverlay_[ExtraData] extends ShapeOverlay[ExtraData] {
  
  /**
    * 获取范围
    */
  def getBounds(): js.UndefOr[Bounds | Null] = js.native
}
