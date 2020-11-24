package typings.antvGMath

import typings.antvGMath.anon.MaxX
import typings.antvGMath.typesMod.BBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  def getBBoxByArray(xArr: js.Array[Double], yArr: js.Array[Double]): BBox = js.native
  
  def getBBoxRange(x1: Double, y1: Double, x2: Double, y2: Double): MaxX = js.native
  
  def isNumberEqual(v1: Double, v2: Double): Boolean = js.native
  
  def piMod(angle: Double): Double = js.native
}
