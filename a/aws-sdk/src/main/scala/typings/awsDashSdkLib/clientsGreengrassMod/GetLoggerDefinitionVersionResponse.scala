package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoggerDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the logger definition version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the logger definition version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * Information about the logger definition version.
    */
  var Definition: js.UndefOr[LoggerDefinitionVersion] = js.undefined
  /**
    * The ID of the logger definition version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The version of the logger definition version.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object GetLoggerDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: LoggerDefinitionVersion = null,
    Id: __string = null,
    Version: __string = null
  ): GetLoggerDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetLoggerDefinitionVersionResponse]
  }
}

