package typings.antvComponent.alignMod

import typings.antvGBase.typesMod.BBox
import typings.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/util/align", "getAlignPoint")
@js.native
object getAlignPoint extends js.Object {
  
  def apply(x: Double, y: Double, offset: Double, width: Double, height: Double, position: String): Point = js.native
  def apply(
    x: Double,
    y: Double,
    offset: Double,
    width: Double,
    height: Double,
    position: String,
    limitBox: BBox
  ): Point = js.native
}
