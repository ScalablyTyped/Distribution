package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummarizedAttackVector extends js.Object {
  /**
    * The list of counters that describe the details of the attack.
    */
  var VectorCounters: js.UndefOr[SummarizedCounterList] = js.undefined
  /**
    * The attack type, for example, SNMP reflection or SYN flood.
    */
  var VectorType: String
}

object SummarizedAttackVector {
  @scala.inline
  def apply(VectorType: String, VectorCounters: SummarizedCounterList = null): SummarizedAttackVector = {
    val __obj = js.Dynamic.literal(VectorType = VectorType)
    if (VectorCounters != null) __obj.updateDynamic("VectorCounters")(VectorCounters)
    __obj.asInstanceOf[SummarizedAttackVector]
  }
}

