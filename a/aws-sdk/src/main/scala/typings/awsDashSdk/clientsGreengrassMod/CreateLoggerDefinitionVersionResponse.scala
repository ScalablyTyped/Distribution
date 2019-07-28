package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoggerDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID of the version.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object CreateLoggerDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Id: __string = null,
    Version: __string = null
  ): CreateLoggerDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[CreateLoggerDefinitionVersionResponse]
  }
}

