package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourceDefinitionVersionResponse extends js.Object {
  /**
    * Arn of the resource definition version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the resource definition version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * Information about the definition.
    */
  var Definition: js.UndefOr[ResourceDefinitionVersion] = js.undefined
  /**
    * The ID of the resource definition version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The version of the resource definition version.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object GetResourceDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: ResourceDefinitionVersion = null,
    Id: __string = null,
    Version: __string = null
  ): GetResourceDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetResourceDefinitionVersionResponse]
  }
}

