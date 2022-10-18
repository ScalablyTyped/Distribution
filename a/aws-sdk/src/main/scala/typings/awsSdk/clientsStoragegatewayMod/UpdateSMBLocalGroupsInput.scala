package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSMBLocalGroupsInput extends StObject {
  
  var GatewayARN: typings.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * A list of Active Directory users and groups that you want to grant special permissions for SMB file shares on the gateway.
    */
  var SMBLocalGroups: typings.awsSdk.clientsStoragegatewayMod.SMBLocalGroups
}
object UpdateSMBLocalGroupsInput {
  
  inline def apply(GatewayARN: GatewayARN, SMBLocalGroups: SMBLocalGroups): UpdateSMBLocalGroupsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], SMBLocalGroups = SMBLocalGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSMBLocalGroupsInput]
  }
  
  extension [Self <: UpdateSMBLocalGroupsInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setSMBLocalGroups(value: SMBLocalGroups): Self = StObject.set(x, "SMBLocalGroups", value.asInstanceOf[js.Any])
  }
}
