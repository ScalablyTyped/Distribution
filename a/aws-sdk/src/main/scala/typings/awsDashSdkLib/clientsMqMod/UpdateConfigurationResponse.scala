package typings
package awsDashSdkLib.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateConfigurationResponse extends js.Object {
  /**
    * Required. The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * Required. The date and time of the configuration.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Required. The unique ID that Amazon MQ generates for the configuration.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  /**
    * Required. The name of the configuration. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150 characters long.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The list of the first 20 warnings about the configuration XML elements or attributes that were sanitized.
    */
  var Warnings: js.UndefOr[__listOfSanitizationWarning] = js.undefined
}

object UpdateConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Created: __timestampIso8601 = null,
    Id: __string = null,
    LatestRevision: ConfigurationRevision = null,
    Name: __string = null,
    Warnings: __listOfSanitizationWarning = null
  ): UpdateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Created != null) __obj.updateDynamic("Created")(Created)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings)
    __obj.asInstanceOf[UpdateConfigurationResponse]
  }
}

