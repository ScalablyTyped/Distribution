package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIpRestrictionRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the IP rules.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * A value that specifies whether IP rules are turned on.
    */
  var Enabled: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A map that describes the updated IP rules with CIDR ranges and descriptions.
    */
  var IpRestrictionRuleMap: js.UndefOr[typings.awsSdk.clientsQuicksightMod.IpRestrictionRuleMap] = js.undefined
}
object UpdateIpRestrictionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): UpdateIpRestrictionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIpRestrictionRequest]
  }
  
  extension [Self <: UpdateIpRestrictionRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: NullableBoolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setIpRestrictionRuleMap(value: IpRestrictionRuleMap): Self = StObject.set(x, "IpRestrictionRuleMap", value.asInstanceOf[js.Any])
    
    inline def setIpRestrictionRuleMapUndefined: Self = StObject.set(x, "IpRestrictionRuleMap", js.undefined)
  }
}
