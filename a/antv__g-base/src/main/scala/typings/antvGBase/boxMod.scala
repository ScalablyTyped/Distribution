package typings.antvGBase

import typings.antvGBase.anon.PartialBBox
import typings.antvGBase.typesMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-base/lib/util/box", JSImport.Namespace)
@js.native
object boxMod extends js.Object {
  
  def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = js.native
  
  def intersectBBox(box1: PartialBBox, box2: PartialBBox): BBox = js.native
}
