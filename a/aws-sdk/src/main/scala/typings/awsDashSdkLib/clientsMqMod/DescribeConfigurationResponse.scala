package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeConfigurationResponse extends js.Object {
  /**
    * Required. The ARN of the configuration.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * Required. The date and time of the configuration revision.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Required. The description of the configuration.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[EngineType] = js.undefined
  /**
    * Required. The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[__string] = js.undefined
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Required. The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The list of all tags associated with this configuration.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object DescribeConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Created: __timestampIso8601 = null,
    Description: __string = null,
    EngineType: EngineType = null,
    EngineVersion: __string = null,
    Id: __string = null,
    LatestRevision: ConfigurationRevision = null,
    Name: __string = null,
    Tags: __mapOf__string = null
  ): DescribeConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[DescribeConfigurationResponse]
  }
}

