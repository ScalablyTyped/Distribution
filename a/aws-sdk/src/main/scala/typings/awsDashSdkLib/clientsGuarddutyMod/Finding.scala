package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finding extends js.Object {
  /**
    * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
    */
  var AccountId: __string
  /**
    * The ARN of a finding described by the action.
    */
  var Arn: __string
  /**
    * The confidence level of a finding.
    */
  var Confidence: js.UndefOr[__double] = js.undefined
  /**
    * The time stamp at which a finding was generated.
    */
  var CreatedAt: awsDashSdkLib.clientsGuarddutyMod.CreatedAt
  /**
    * The description of a finding.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The identifier that corresponds to a finding described by the action.
    */
  var Id: __string
  /**
    * The AWS resource partition.
    */
  var Partition: js.UndefOr[__string] = js.undefined
  /**
    * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
    */
  var Region: __string
  /**
    * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
    */
  var Resource: awsDashSdkLib.clientsGuarddutyMod.Resource
  /**
    * Findings' schema version.
    */
  var SchemaVersion: __string
  /**
    * Additional information assigned to the generated finding by GuardDuty.
    */
  var Service: js.UndefOr[Service] = js.undefined
  /**
    * The severity of a finding.
    */
  var Severity: __double
  /**
    * The title of a finding.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The type of a finding described by the action.
    */
  var Type: __string
  /**
    * The time stamp at which a finding was last updated.
    */
  var UpdatedAt: awsDashSdkLib.clientsGuarddutyMod.UpdatedAt
}

object Finding {
  @scala.inline
  def apply(
    AccountId: __string,
    Arn: __string,
    CreatedAt: CreatedAt,
    Id: __string,
    Region: __string,
    Resource: Resource,
    SchemaVersion: __string,
    Severity: __double,
    Type: __string,
    UpdatedAt: UpdatedAt,
    Confidence: js.UndefOr[__double] = js.undefined,
    Description: __string = null,
    Partition: __string = null,
    Service: Service = null,
    Title: __string = null
  ): Finding = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, Arn = Arn, CreatedAt = CreatedAt, Id = Id, Region = Region, Resource = Resource, SchemaVersion = SchemaVersion, Severity = Severity, Type = Type, UpdatedAt = UpdatedAt)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Partition != null) __obj.updateDynamic("Partition")(Partition)
    if (Service != null) __obj.updateDynamic("Service")(Service)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[Finding]
  }
}

