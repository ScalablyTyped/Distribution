package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttackSummary extends js.Object {
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[String] = js.undefined
  /**
    * The list of attacks for a specified time period.
    */
  var AttackVectors: js.UndefOr[AttackVectorDescriptionList] = js.undefined
  /**
    * The end time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  /**
    * The start time of the attack, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
}

object AttackSummary {
  @scala.inline
  def apply(
    AttackId: String = null,
    AttackVectors: AttackVectorDescriptionList = null,
    EndTime: AttackTimestamp = null,
    ResourceArn: String = null,
    StartTime: AttackTimestamp = null
  ): AttackSummary = {
    val __obj = js.Dynamic.literal()
    if (AttackId != null) __obj.updateDynamic("AttackId")(AttackId)
    if (AttackVectors != null) __obj.updateDynamic("AttackVectors")(AttackVectors)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (ResourceArn != null) __obj.updateDynamic("ResourceArn")(ResourceArn)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[AttackSummary]
  }
}

