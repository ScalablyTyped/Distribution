package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.three.mod.Quaternion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofQuaternion
  extends StObject
     with Instantiable0[Quaternion] {
  
  def multiplyQuaternionsFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double
  ): js.Array[Double] = js.native
  
  /**
    * @deprecated Use qm.slerpQuaternions( qa, qb, t ) instead..
    */
  def slerp(
    qa: typings.three.quaternionMod.Quaternion,
    qb: typings.three.quaternionMod.Quaternion,
    qm: typings.three.quaternionMod.Quaternion,
    t: Double
  ): Double = js.native
  
  def slerpFlat(
    dst: js.Array[Double],
    dstOffset: Double,
    src0: js.Array[Double],
    srcOffset: Double,
    src1: js.Array[Double],
    stcOffset1: Double,
    t: Double
  ): typings.three.quaternionMod.Quaternion = js.native
}
