package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSMBSecurityStrategyInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * Specifies the type of security strategy. ClientSpecified: if you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment. Supported only in S3 File Gateway. MandatorySigning: if you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer. MandatoryEncryption: if you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
    */
  var SMBSecurityStrategy: typings.awsSdk.clientsStoragegatewayMod.SMBSecurityStrategy
}
object UpdateSMBSecurityStrategyInput {
  
  inline def apply(GatewayARN: GatewayARN, SMBSecurityStrategy: SMBSecurityStrategy): UpdateSMBSecurityStrategyInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], SMBSecurityStrategy = SMBSecurityStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBSecurityStrategyInput]
  }
  
  extension [Self <: UpdateSMBSecurityStrategyInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setSMBSecurityStrategy(value: SMBSecurityStrategy): Self = StObject.set(x, "SMBSecurityStrategy", value.asInstanceOf[js.Any])
  }
}
