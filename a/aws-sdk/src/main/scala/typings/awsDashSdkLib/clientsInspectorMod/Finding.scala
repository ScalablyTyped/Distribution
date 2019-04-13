package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Finding extends js.Object {
  /**
    * The ARN that specifies the finding.
    */
  var arn: Arn
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var assetAttributes: js.UndefOr[AssetAttributes] = js.undefined
  /**
    * The type of the host from which the finding is generated.
    */
  var assetType: js.UndefOr[AssetType] = js.undefined
  /**
    * The system-defined attributes for the finding.
    */
  var attributes: AttributeList
  /**
    * This data element is currently not used.
    */
  var confidence: js.UndefOr[IocConfidence] = js.undefined
  /**
    * The time when the finding was generated.
    */
  var createdAt: Timestamp
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[Text] = js.undefined
  /**
    * The ID of the finding.
    */
  var id: js.UndefOr[FindingId] = js.undefined
  /**
    * This data element is currently not used.
    */
  var indicatorOfCompromise: js.UndefOr[Bool] = js.undefined
  /**
    * The numeric value of the finding severity.
    */
  var numericSeverity: js.UndefOr[NumericSeverity] = js.undefined
  /**
    * The recommendation for the finding.
    */
  var recommendation: js.UndefOr[Text] = js.undefined
  /**
    * The schema version of this data type.
    */
  var schemaVersion: js.UndefOr[NumericVersion] = js.undefined
  /**
    * The data element is set to "Inspector".
    */
  var service: js.UndefOr[ServiceName] = js.undefined
  /**
    * This data type is used in the Finding data type.
    */
  var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.undefined
  /**
    * The finding severity. Values can be set to High, Medium, Low, and Informational.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  /**
    * The name of the finding.
    */
  var title: js.UndefOr[Text] = js.undefined
  /**
    * The time when AddAttributesToFindings is called.
    */
  var updatedAt: Timestamp
  /**
    * The user-defined attributes that are assigned to the finding.
    */
  var userAttributes: UserAttributeList
}

object Finding {
  @scala.inline
  def apply(
    arn: Arn,
    attributes: AttributeList,
    createdAt: Timestamp,
    updatedAt: Timestamp,
    userAttributes: UserAttributeList,
    assetAttributes: AssetAttributes = null,
    assetType: AssetType = null,
    confidence: js.UndefOr[IocConfidence] = js.undefined,
    description: Text = null,
    id: FindingId = null,
    indicatorOfCompromise: js.UndefOr[Bool] = js.undefined,
    numericSeverity: js.UndefOr[NumericSeverity] = js.undefined,
    recommendation: Text = null,
    schemaVersion: js.UndefOr[NumericVersion] = js.undefined,
    service: ServiceName = null,
    serviceAttributes: InspectorServiceAttributes = null,
    severity: Severity = null,
    title: Text = null
  ): Finding = {
    val __obj = js.Dynamic.literal(arn = arn, attributes = attributes, createdAt = createdAt, updatedAt = updatedAt, userAttributes = userAttributes)
    if (assetAttributes != null) __obj.updateDynamic("assetAttributes")(assetAttributes)
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(indicatorOfCompromise)) __obj.updateDynamic("indicatorOfCompromise")(indicatorOfCompromise)
    if (!js.isUndefined(numericSeverity)) __obj.updateDynamic("numericSeverity")(numericSeverity)
    if (recommendation != null) __obj.updateDynamic("recommendation")(recommendation)
    if (!js.isUndefined(schemaVersion)) __obj.updateDynamic("schemaVersion")(schemaVersion)
    if (service != null) __obj.updateDynamic("service")(service)
    if (serviceAttributes != null) __obj.updateDynamic("serviceAttributes")(serviceAttributes)
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Finding]
  }
}

