package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Dst
  extends org.scalablytyped.runtime.Instantiable0[threeLib.threeMod.Quaternion] {
  /**
    * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    */
  def slerp(
    qa: threeLib.srcMathQuaternionMod.Quaternion,
    qb: threeLib.srcMathQuaternionMod.Quaternion,
    qm: threeLib.srcMathQuaternionMod.Quaternion,
    t: scala.Double
  ): threeLib.srcMathQuaternionMod.Quaternion = js.native
  def slerpFlat(
    dst: js.Array[scala.Double],
    dstOffset: scala.Double,
    src0: js.Array[scala.Double],
    srcOffset: scala.Double,
    src1: js.Array[scala.Double],
    stcOffset1: scala.Double,
    t: scala.Double
  ): threeLib.srcMathQuaternionMod.Quaternion = js.native
}

