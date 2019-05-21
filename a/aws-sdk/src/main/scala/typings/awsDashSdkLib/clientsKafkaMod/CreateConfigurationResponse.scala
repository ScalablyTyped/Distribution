package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time when the configuration was created.
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * Latest revision of the configuration.
    */
  var LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined
  /**
    * The name of the configuration.
    */
  var Name: js.UndefOr[__string] = js.undefined
}

object CreateConfigurationResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTime: __timestampIso8601 = null,
    LatestRevision: ConfigurationRevision = null,
    Name: __string = null
  ): CreateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LatestRevision != null) __obj.updateDynamic("LatestRevision")(LatestRevision)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateConfigurationResponse]
  }
}

