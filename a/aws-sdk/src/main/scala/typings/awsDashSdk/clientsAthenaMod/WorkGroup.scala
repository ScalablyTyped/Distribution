package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkGroup extends js.Object {
  /**
    * The configuration of the workgroup, which includes the location in Amazon S3 where query results are stored, the encryption configuration, if any, used for query results; whether the Amazon CloudWatch Metrics are enabled for the workgroup; whether workgroup settings override client-side settings; and the data usage limits for the amount of data scanned per query or per workgroup. The workgroup settings override is specified in EnforceWorkGroupConfiguration (true/false) in the WorkGroupConfiguration. See WorkGroupConfiguration$EnforceWorkGroupConfiguration.
    */
  var Configuration: js.UndefOr[WorkGroupConfiguration] = js.undefined
  /**
    * The date and time the workgroup was created.
    */
  var CreationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The workgroup description.
    */
  var Description: js.UndefOr[WorkGroupDescriptionString] = js.undefined
  /**
    * The workgroup name.
    */
  var Name: WorkGroupName
  /**
    * The state of the workgroup: ENABLED or DISABLED.
    */
  var State: js.UndefOr[WorkGroupState] = js.undefined
}

object WorkGroup {
  @scala.inline
  def apply(
    Name: WorkGroupName,
    Configuration: WorkGroupConfiguration = null,
    CreationTime: _Date = null,
    Description: WorkGroupDescriptionString = null,
    State: WorkGroupState = null
  ): WorkGroup = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkGroup]
  }
}

