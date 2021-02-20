package typings.antvGMath

import typings.antvGMath.anon.MaxX
import typings.antvGMath.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/g-math/lib/util", "distance")
  @js.native
  def distance(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("@antv/g-math/lib/util", "getBBoxByArray")
  @js.native
  def getBBoxByArray(xArr: js.Array[Double], yArr: js.Array[Double]): BBox = js.native
  
  @JSImport("@antv/g-math/lib/util", "getBBoxRange")
  @js.native
  def getBBoxRange(x1: Double, y1: Double, x2: Double, y2: Double): MaxX = js.native
  
  @JSImport("@antv/g-math/lib/util", "isNumberEqual")
  @js.native
  def isNumberEqual(v1: Double, v2: Double): Boolean = js.native
  
  @JSImport("@antv/g-math/lib/util", "piMod")
  @js.native
  def piMod(angle: Double): Double = js.native
}
