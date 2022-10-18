package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  /**
    * If the option requires access to a port, then this DB security group allows access to the port.
    */
  var DBSecurityGroupMemberships: js.UndefOr[DBSecurityGroupMembershipList] = js.undefined
  
  /**
    * The description of the option.
    */
  var OptionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the option.
    */
  var OptionName: js.UndefOr[String] = js.undefined
  
  /**
    * The option settings for this option.
    */
  var OptionSettings: js.UndefOr[OptionSettingConfigurationList] = js.undefined
  
  /**
    * The version of the option.
    */
  var OptionVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Indicate if this option is permanent.
    */
  var Permanent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate if this option is persistent.
    */
  var Persistent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If required, the port configured for this option to use.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If the option requires access to a port, then this VPC security group allows access to the port.
    */
  var VpcSecurityGroupMemberships: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object Option {
  
  inline def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setDBSecurityGroupMemberships(value: DBSecurityGroupMembershipList): Self = StObject.set(x, "DBSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupMembershipsUndefined: Self = StObject.set(x, "DBSecurityGroupMemberships", js.undefined)
    
    inline def setDBSecurityGroupMembershipsVarargs(value: DBSecurityGroupMembership*): Self = StObject.set(x, "DBSecurityGroupMemberships", js.Array(value*))
    
    inline def setOptionDescription(value: String): Self = StObject.set(x, "OptionDescription", value.asInstanceOf[js.Any])
    
    inline def setOptionDescriptionUndefined: Self = StObject.set(x, "OptionDescription", js.undefined)
    
    inline def setOptionName(value: String): Self = StObject.set(x, "OptionName", value.asInstanceOf[js.Any])
    
    inline def setOptionNameUndefined: Self = StObject.set(x, "OptionName", js.undefined)
    
    inline def setOptionSettings(value: OptionSettingConfigurationList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    inline def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    inline def setOptionSettingsVarargs(value: OptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value*))
    
    inline def setOptionVersion(value: String): Self = StObject.set(x, "OptionVersion", value.asInstanceOf[js.Any])
    
    inline def setOptionVersionUndefined: Self = StObject.set(x, "OptionVersion", js.undefined)
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "Permanent", value.asInstanceOf[js.Any])
    
    inline def setPermanentUndefined: Self = StObject.set(x, "Permanent", js.undefined)
    
    inline def setPersistent(value: Boolean): Self = StObject.set(x, "Persistent", value.asInstanceOf[js.Any])
    
    inline def setPersistentUndefined: Self = StObject.set(x, "Persistent", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setVpcSecurityGroupMemberships(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroupMemberships", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupMembershipsUndefined: Self = StObject.set(x, "VpcSecurityGroupMemberships", js.undefined)
    
    inline def setVpcSecurityGroupMembershipsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroupMemberships", js.Array(value*))
  }
}
