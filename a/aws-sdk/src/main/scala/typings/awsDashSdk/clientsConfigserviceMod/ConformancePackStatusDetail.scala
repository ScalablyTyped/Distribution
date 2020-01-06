package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackStatusDetail extends js.Object {
  /**
    * Amazon Resource Name (ARN) of comformance pack.
    */
  var ConformancePackArn: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackArn = js.native
  /**
    * ID of the conformance pack.
    */
  var ConformancePackId: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackId = js.native
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackName = js.native
  /**
    * Indicates deployment status of conformance pack. AWS Config sets the state of the conformance pack to:   CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.   CREATE_COMPLETE when a conformance pack has been successfully created in your account.   CREATE_FAILED when a conformance pack creation failed in your account.   DELETE_IN_PROGRESS when a conformance pack deletion is in progress.    DELETE_FAILED when a conformance pack deletion failed in your account.  
    */
  var ConformancePackState: typings.awsDashSdk.clientsConfigserviceMod.ConformancePackState = js.native
  /**
    * The reason of conformance pack creation failure.
    */
  var ConformancePackStatusReason: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ConformancePackStatusReason] = js.native
  /**
    * Last time when conformation pack creation and update was successful.
    */
  var LastUpdateCompletedTime: js.UndefOr[_Date] = js.native
  /**
    * Last time when conformation pack creation and update was requested.
    */
  var LastUpdateRequestedTime: _Date = js.native
  /**
    * Amazon Resource Name (ARN) of AWS CloudFormation stack. 
    */
  var StackArn: typings.awsDashSdk.clientsConfigserviceMod.StackArn = js.native
}

object ConformancePackStatusDetail {
  @scala.inline
  def apply(
    ConformancePackArn: ConformancePackArn,
    ConformancePackId: ConformancePackId,
    ConformancePackName: ConformancePackName,
    ConformancePackState: ConformancePackState,
    LastUpdateRequestedTime: _Date,
    StackArn: StackArn,
    ConformancePackStatusReason: ConformancePackStatusReason = null,
    LastUpdateCompletedTime: _Date = null
  ): ConformancePackStatusDetail = {
    val __obj = js.Dynamic.literal(ConformancePackArn = ConformancePackArn.asInstanceOf[js.Any], ConformancePackId = ConformancePackId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackState = ConformancePackState.asInstanceOf[js.Any], LastUpdateRequestedTime = LastUpdateRequestedTime.asInstanceOf[js.Any], StackArn = StackArn.asInstanceOf[js.Any])
    if (ConformancePackStatusReason != null) __obj.updateDynamic("ConformancePackStatusReason")(ConformancePackStatusReason.asInstanceOf[js.Any])
    if (LastUpdateCompletedTime != null) __obj.updateDynamic("LastUpdateCompletedTime")(LastUpdateCompletedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackStatusDetail]
  }
}

