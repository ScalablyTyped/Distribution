package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSMBSecurityStrategyInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  /**
    * Specifies the type of security strategy. ClientSpecified: SMBv1 is enabled, SMB signing is offered but not required, SMB encryption is offered but not required. MandatorySigning: SMBv1 is disabled, SMB signing is required, SMB encryption is offered but not required. MandatoryEncryption: SMBv1 is disabled, SMB signing is offered but not required, SMB encryption is required.
    */
  var SMBSecurityStrategy: typings.awsDashSdk.clientsStoragegatewayMod.SMBSecurityStrategy
}

object UpdateSMBSecurityStrategyInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, SMBSecurityStrategy: SMBSecurityStrategy): UpdateSMBSecurityStrategyInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN, SMBSecurityStrategy = SMBSecurityStrategy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSMBSecurityStrategyInput]
  }
}

