package typings.antvScale

import typings.antvScale.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/util/extended", JSImport.Namespace)
@js.native
object utilExtendedMod extends js.Object {
  val ALL_Q: js.Array[Double] = js.native
  val DEFAULT_Q: js.Array[Double] = js.native
  def default(dmin: Double, dmax: Double): Max = js.native
  def default(dmin: Double, dmax: Double, m: Double): Max = js.native
  def default(dmin: Double, dmax: Double, m: Double, onlyLoose: Boolean): Max = js.native
  def default(dmin: Double, dmax: Double, m: Double, onlyLoose: Boolean, Q: js.Array[Double]): Max = js.native
  def default(
    dmin: Double,
    dmax: Double,
    m: Double,
    onlyLoose: Boolean,
    Q: js.Array[Double],
    w: js.Tuple4[Double, Double, Double, Double]
  ): Max = js.native
}

