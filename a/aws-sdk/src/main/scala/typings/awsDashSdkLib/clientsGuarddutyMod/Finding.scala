package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finding extends js.Object {
  /**
    * AWS account ID where the activity occurred that prompted GuardDuty to generate a finding.
    */
  var AccountId: String
  /**
    * The ARN of a finding described by the action.
    */
  var Arn: String
  /**
    * The confidence level of a finding.
    */
  var Confidence: js.UndefOr[Double] = js.undefined
  /**
    * The time stamp at which a finding was generated.
    */
  var CreatedAt: String
  /**
    * The description of a finding.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The identifier that corresponds to a finding described by the action.
    */
  var Id: String
  /**
    * The AWS resource partition.
    */
  var Partition: js.UndefOr[String] = js.undefined
  /**
    * The AWS region where the activity occurred that prompted GuardDuty to generate a finding.
    */
  var Region: String
  /**
    * The AWS resource associated with the activity that prompted GuardDuty to generate a finding.
    */
  var Resource: awsDashSdkLib.clientsGuarddutyMod.Resource
  /**
    * Findings' schema version.
    */
  var SchemaVersion: String
  /**
    * Additional information assigned to the generated finding by GuardDuty.
    */
  var Service: js.UndefOr[Service] = js.undefined
  /**
    * The severity of a finding.
    */
  var Severity: Double
  /**
    * The title of a finding.
    */
  var Title: js.UndefOr[String] = js.undefined
  /**
    * The type of a finding described by the action.
    */
  var Type: FindingType
  /**
    * The time stamp at which a finding was last updated.
    */
  var UpdatedAt: String
}

object Finding {
  @scala.inline
  def apply(
    AccountId: String,
    Arn: String,
    CreatedAt: String,
    Id: String,
    Region: String,
    Resource: Resource,
    SchemaVersion: String,
    Severity: Double,
    Type: FindingType,
    UpdatedAt: String,
    Confidence: js.UndefOr[Double] = js.undefined,
    Description: String = null,
    Partition: String = null,
    Service: Service = null,
    Title: String = null
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

