package typings.antvCoord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@antv/coord/lib/util", "formatNum")
  @js.native
  def formatNum(num: Double): Double = js.native
  @JSImport("@antv/coord/lib/util", "formatNum")
  @js.native
  def formatNum(num: Double, digits: Double): Double = js.native
  
  @JSImport("@antv/coord/lib/util", "trunc")
  @js.native
  def trunc(v: Double): Double = js.native
  
  @JSImport("@antv/coord/lib/util", "wrapNum")
  @js.native
  def wrapNum(x: Double, range: js.Array[Double]): Double = js.native
  @JSImport("@antv/coord/lib/util", "wrapNum")
  @js.native
  def wrapNum(x: Double, range: js.Array[Double], includeMax: Boolean): Double = js.native
}
