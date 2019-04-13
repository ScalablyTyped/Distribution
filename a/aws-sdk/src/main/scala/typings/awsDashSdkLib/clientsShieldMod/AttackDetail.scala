package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttackDetail extends js.Object {
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[AttackId] = js.undefined
  /**
    * The array of AttackProperty objects.
    */
  var AttackProperties: js.UndefOr[AttackProperties] = js.undefined
  /**
    * The time the attack ended, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.undefined
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[ResourceArn] = js.undefined
  /**
    * The time the attack started, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
}

object AttackDetail {
  @scala.inline
  def apply(
    AttackCounters: SummarizedCounterList = null,
    AttackId: AttackId = null,
    AttackProperties: AttackProperties = null,
    EndTime: AttackTimestamp = null,
    Mitigations: MitigationList = null,
    ResourceArn: ResourceArn = null,
    StartTime: AttackTimestamp = null,
    SubResources: SubResourceSummaryList = null
  ): AttackDetail = {
    val __obj = js.Dynamic.literal()
    if (AttackCounters != null) __obj.updateDynamic("AttackCounters")(AttackCounters)
    if (AttackId != null) __obj.updateDynamic("AttackId")(AttackId)
    if (AttackProperties != null) __obj.updateDynamic("AttackProperties")(AttackProperties)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Mitigations != null) __obj.updateDynamic("Mitigations")(Mitigations)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (SubResources != null) __obj.updateDynamic("SubResources")(SubResources)
    __obj.asInstanceOf[AttackDetail]
  }
}

