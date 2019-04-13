package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkGroupInput extends js.Object {
  /**
    * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption configuration, if any, used for encrypting query results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, the limit for the amount of bytes scanned (cutoff) per query, if it is specified, and whether workgroup's settings (specified with EnforceWorkGroupConfiguration) in the WorkGroupConfiguration override client-side settings. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  /**
    * The workgroup name.
    */
  var Name: WorkGroupName
  /**
    * One or more tags, separated by commas, that you want to attach to the workgroup as you create it.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateWorkGroupInput {
  @scala.inline
  def apply(
    Name: WorkGroupName,
    Configuration: WorkGroupConfiguration = null,
    Description: WorkGroupDescriptionString = null,
    Tags: TagList = null
  ): CreateWorkGroupInput = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateWorkGroupInput]
  }
}

