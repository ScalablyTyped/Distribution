package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finding extends js.Object {
  /**
    * The ID of the account in which the finding was generated.
    */
  var AccountId: String
  /**
    * The ARN for the finding.
    */
  var Arn: String
  /**
    * The confidence score for the finding.
    */
  var Confidence: js.UndefOr[Double] = js.undefined
  /**
    * The time and date at which the finding was created.
    */
  var CreatedAt: String
  /**
    * The description of the finding.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The ID of the finding.
    */
  var Id: String
  /**
    * The partition associated with the finding.
    */
  var Partition: js.UndefOr[String] = js.undefined
  /**
    * The Region in which the finding was generated.
    */
  var Region: String
  var Resource: typings.awsDashSdk.clientsGuarddutyMod.Resource
  /**
    * The version of the schema used for the finding.
    */
  var SchemaVersion: String
  var Service: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.Service] = js.undefined
  /**
    * The severity of the finding.
    */
  var Severity: Double
  /**
    * The title for the finding.
    */
  var Title: js.UndefOr[String] = js.undefined
  /**
    * The type of the finding.
    */
  var Type: FindingType
  /**
    * The time and date at which the finding was laste updated.
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

