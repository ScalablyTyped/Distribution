package typings.amapJsApi.global.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.OverlayGroup")
@js.native
/**
  * 覆盖物集合
  * @param overlays 覆盖物
  */
class OverlayGroup[O /* <: typings.amapJsApi.AMap.Overlay[js.Any] */, ExtraData] ()
  extends StObject
     with typings.amapJsApi.AMap.OverlayGroup[O, ExtraData] {
  def this(overlays: O) = this()
  def this(overlays: js.Array[O]) = this()
}
