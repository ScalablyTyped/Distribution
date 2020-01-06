package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Finding extends js.Object {
  /**
    * The ARN that specifies the finding.
    */
  var arn: Arn = js.native
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var assetAttributes: js.UndefOr[AssetAttributes] = js.native
  /**
    * The type of the host from which the finding is generated.
    */
  var assetType: js.UndefOr[AssetType] = js.native
  /**
    * The system-defined attributes for the finding.
    */
  var attributes: AttributeList = js.native
  /**
    * This data element is currently not used.
    */
  var confidence: js.UndefOr[IocConfidence] = js.native
  /**
    * The time when the finding was generated.
    */
  var createdAt: Timestamp = js.native
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[Text] = js.native
  /**
    * The ID of the finding.
    */
  var id: js.UndefOr[FindingId] = js.native
  /**
    * This data element is currently not used.
    */
  var indicatorOfCompromise: js.UndefOr[Bool] = js.native
  /**
    * The numeric value of the finding severity.
    */
  var numericSeverity: js.UndefOr[NumericSeverity] = js.native
  /**
    * The recommendation for the finding.
    */
  var recommendation: js.UndefOr[Text] = js.native
  /**
    * The schema version of this data type.
    */
  var schemaVersion: js.UndefOr[NumericVersion] = js.native
  /**
    * The data element is set to "Inspector".
    */
  var service: js.UndefOr[ServiceName] = js.native
  /**
    * This data type is used in the Finding data type.
    */
  var serviceAttributes: js.UndefOr[InspectorServiceAttributes] = js.native
  /**
    * The finding severity. Values can be set to High, Medium, Low, and Informational.
    */
  var severity: js.UndefOr[Severity] = js.native
  /**
    * The name of the finding.
    */
  var title: js.UndefOr[Text] = js.native
  /**
    * The time when AddAttributesToFindings is called.
    */
  var updatedAt: Timestamp = js.native
  /**
    * The user-defined attributes that are assigned to the finding.
    */
  var userAttributes: UserAttributeList = js.native
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
    confidence: Int | Double = null,
    description: Text = null,
    id: FindingId = null,
    indicatorOfCompromise: js.UndefOr[Boolean] = js.undefined,
    numericSeverity: Int | Double = null,
    recommendation: Text = null,
    schemaVersion: Int | Double = null,
    service: ServiceName = null,
    serviceAttributes: InspectorServiceAttributes = null,
    severity: Severity = null,
    title: Text = null
  ): Finding = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], userAttributes = userAttributes.asInstanceOf[js.Any])
    if (assetAttributes != null) __obj.updateDynamic("assetAttributes")(assetAttributes.asInstanceOf[js.Any])
    if (assetType != null) __obj.updateDynamic("assetType")(assetType.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorOfCompromise)) __obj.updateDynamic("indicatorOfCompromise")(indicatorOfCompromise.asInstanceOf[js.Any])
    if (numericSeverity != null) __obj.updateDynamic("numericSeverity")(numericSeverity.asInstanceOf[js.Any])
    if (recommendation != null) __obj.updateDynamic("recommendation")(recommendation.asInstanceOf[js.Any])
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (serviceAttributes != null) __obj.updateDynamic("serviceAttributes")(serviceAttributes.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finding]
  }
}

