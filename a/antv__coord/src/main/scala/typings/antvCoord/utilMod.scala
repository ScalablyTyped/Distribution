package typings.antvCoord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/coord/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def formatNum(num: Double): Double = js.native
  def formatNum(num: Double, digits: Double): Double = js.native
  
  def trunc(v: Double): Double = js.native
  
  def wrapNum(x: Double, range: js.Array[Double]): Double = js.native
  def wrapNum(x: Double, range: js.Array[Double], includeMax: Boolean): Double = js.native
}
