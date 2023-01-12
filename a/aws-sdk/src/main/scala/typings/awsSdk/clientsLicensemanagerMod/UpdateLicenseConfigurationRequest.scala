package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLicenseConfigurationRequest extends StObject {
  
  /**
    * New description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * When true, disassociates a resource when software is uninstalled.
    */
  var DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String
  
  /**
    * New status of the license configuration.
    */
  var LicenseConfigurationStatus: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseConfigurationStatus] = js.undefined
  
  /**
    * New number of licenses managed by the license configuration.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * New hard limit of the number of available licenses.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * New license rule. The only rule that you can add after you create a license configuration is licenseAffinityToHost.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  
  /**
    * New name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * New product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ProductInformationList] = js.undefined
}
object UpdateLicenseConfigurationRequest {
  
  inline def apply(LicenseConfigurationArn: String): UpdateLicenseConfigurationRequest = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLicenseConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLicenseConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisassociateWhenNotFound(value: BoxBoolean): Self = StObject.set(x, "DisassociateWhenNotFound", value.asInstanceOf[js.Any])
    
    inline def setDisassociateWhenNotFoundUndefined: Self = StObject.set(x, "DisassociateWhenNotFound", js.undefined)
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationStatus(value: LicenseConfigurationStatus): Self = StObject.set(x, "LicenseConfigurationStatus", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationStatusUndefined: Self = StObject.set(x, "LicenseConfigurationStatus", js.undefined)
    
    inline def setLicenseCount(value: BoxLong): Self = StObject.set(x, "LicenseCount", value.asInstanceOf[js.Any])
    
    inline def setLicenseCountHardLimit(value: BoxBoolean): Self = StObject.set(x, "LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    inline def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "LicenseCountHardLimit", js.undefined)
    
    inline def setLicenseCountUndefined: Self = StObject.set(x, "LicenseCount", js.undefined)
    
    inline def setLicenseRules(value: StringList): Self = StObject.set(x, "LicenseRules", value.asInstanceOf[js.Any])
    
    inline def setLicenseRulesUndefined: Self = StObject.set(x, "LicenseRules", js.undefined)
    
    inline def setLicenseRulesVarargs(value: String*): Self = StObject.set(x, "LicenseRules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProductInformationList(value: ProductInformationList): Self = StObject.set(x, "ProductInformationList", value.asInstanceOf[js.Any])
    
    inline def setProductInformationListUndefined: Self = StObject.set(x, "ProductInformationList", js.undefined)
    
    inline def setProductInformationListVarargs(value: ProductInformation*): Self = StObject.set(x, "ProductInformationList", js.Array(value*))
  }
}
