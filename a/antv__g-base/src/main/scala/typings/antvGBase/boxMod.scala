package typings.antvGBase

import typings.antvGBase.anon.PartialBBox
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod {
  
  @JSImport("@antv/g-base/lib/util/box", "createBBox")
  @js.native
  def createBBox(x: Double, y: Double, width: Double, height: Double): BBox = js.native
  
  @JSImport("@antv/g-base/lib/util/box", "intersectBBox")
  @js.native
  def intersectBBox(box1: PartialBBox, box2: PartialBBox): BBox = js.native
}
