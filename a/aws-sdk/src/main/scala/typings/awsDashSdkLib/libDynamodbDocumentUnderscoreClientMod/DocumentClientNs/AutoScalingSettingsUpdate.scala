package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoScalingSettingsUpdate extends js.Object {
  /**
       * Disabled autoscaling for this global table or global secondary index.
       */
  var AutoScalingDisabled: js.UndefOr[BooleanObject] = js.undefined
  /**
       * Role ARN used for configuring autoscaling policy.
       */
  var AutoScalingRoleArn: js.UndefOr[AutoScalingRoleArn] = js.undefined
  /**
       * The maximum capacity units that a global table or global secondary index should be scaled up to.
       */
  var MaximumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
       * The minimum capacity units that a global table or global secondary index should be scaled down to.
       */
  var MinimumUnits: js.UndefOr[PositiveLongObject] = js.undefined
  /**
       * The scaling policy to apply for scaling target global table or global secondary index capacity units.
       */
  var ScalingPolicyUpdate: js.UndefOr[AutoScalingPolicyUpdate] = js.undefined
}

