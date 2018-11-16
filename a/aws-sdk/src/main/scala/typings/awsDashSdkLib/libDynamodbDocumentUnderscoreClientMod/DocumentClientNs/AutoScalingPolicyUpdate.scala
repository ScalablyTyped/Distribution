package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoScalingPolicyUpdate extends js.Object {
  /**
       * The name of the scaling policy.
       */
  var PolicyName: js.UndefOr[AutoScalingPolicyName] = js.undefined
  /**
       * Represents a target tracking scaling policy configuration.
       */
  var TargetTrackingScalingPolicyConfiguration: AutoScalingTargetTrackingScalingPolicyConfigurationUpdate
}

