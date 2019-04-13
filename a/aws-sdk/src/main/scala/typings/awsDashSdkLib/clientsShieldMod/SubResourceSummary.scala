package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubResourceSummary extends js.Object {
  /**
    * The list of attack types and associated counters.
    */
  var AttackVectors: js.UndefOr[SummarizedAttackVectorList] = js.undefined
  /**
    * The counters that describe the details of the attack.
    */
  var Counters: js.UndefOr[SummarizedCounterList] = js.undefined
  /**
    * The unique identifier (ID) of the SubResource.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The SubResource type.
    */
  var Type: js.UndefOr[SubResourceType] = js.undefined
}

object SubResourceSummary {
  @scala.inline
  def apply(
    AttackVectors: SummarizedAttackVectorList = null,
    Counters: SummarizedCounterList = null,
    Id: String = null,
    Type: SubResourceType = null
  ): SubResourceSummary = {
    val __obj = js.Dynamic.literal()
    if (AttackVectors != null) __obj.updateDynamic("AttackVectors")(AttackVectors)
    if (Counters != null) __obj.updateDynamic("Counters")(Counters)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubResourceSummary]
  }
}

