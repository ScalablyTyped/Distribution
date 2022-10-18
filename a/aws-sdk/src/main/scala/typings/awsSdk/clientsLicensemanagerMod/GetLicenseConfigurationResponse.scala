package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLicenseConfigurationResponse extends StObject {
  
  /**
    * Automated discovery information.
    */
  var AutomatedDiscoveryInformation: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.AutomatedDiscoveryInformation] = js.undefined
  
  /**
    * Summaries of the licenses consumed by resources.
    */
  var ConsumedLicenseSummaryList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ConsumedLicenseSummaryList] = js.undefined
  
  /**
    * Number of licenses assigned to resources.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Description of the license configuration.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * When true, disassociates a resource when software is uninstalled.
    */
  var DisassociateWhenNotFound: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: js.UndefOr[String] = js.undefined
  
  /**
    * Unique ID for the license configuration.
    */
  var LicenseConfigurationId: js.UndefOr[String] = js.undefined
  
  /**
    * Number of available licenses.
    */
  var LicenseCount: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Sets the number of available licenses as a hard limit.
    */
  var LicenseCountHardLimit: js.UndefOr[BoxBoolean] = js.undefined
  
  /**
    * Dimension for which the licenses are counted.
    */
  var LicenseCountingType: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.LicenseCountingType] = js.undefined
  
  /**
    * License rules.
    */
  var LicenseRules: js.UndefOr[StringList] = js.undefined
  
  /**
    * Summaries of the managed resources.
    */
  var ManagedResourceSummaryList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ManagedResourceSummaryList] = js.undefined
  
  /**
    * Name of the license configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Account ID of the owner of the license configuration.
    */
  var OwnerAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Product information.
    */
  var ProductInformationList: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ProductInformationList] = js.undefined
  
  /**
    * License configuration status.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Tags for the license configuration.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object GetLicenseConfigurationResponse {
  
  inline def apply(): GetLicenseConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLicenseConfigurationResponse]
  }
  
  extension [Self <: GetLicenseConfigurationResponse](x: Self) {
    
    inline def setAutomatedDiscoveryInformation(value: AutomatedDiscoveryInformation): Self = StObject.set(x, "AutomatedDiscoveryInformation", value.asInstanceOf[js.Any])
    
    inline def setAutomatedDiscoveryInformationUndefined: Self = StObject.set(x, "AutomatedDiscoveryInformation", js.undefined)
    
    inline def setConsumedLicenseSummaryList(value: ConsumedLicenseSummaryList): Self = StObject.set(x, "ConsumedLicenseSummaryList", value.asInstanceOf[js.Any])
    
    inline def setConsumedLicenseSummaryListUndefined: Self = StObject.set(x, "ConsumedLicenseSummaryList", js.undefined)
    
    inline def setConsumedLicenseSummaryListVarargs(value: ConsumedLicenseSummary*): Self = StObject.set(x, "ConsumedLicenseSummaryList", js.Array(value*))
    
    inline def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    inline def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisassociateWhenNotFound(value: BoxBoolean): Self = StObject.set(x, "DisassociateWhenNotFound", value.asInstanceOf[js.Any])
    
    inline def setDisassociateWhenNotFoundUndefined: Self = StObject.set(x, "DisassociateWhenNotFound", js.undefined)
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationArnUndefined: Self = StObject.set(x, "LicenseConfigurationArn", js.undefined)
    
    inline def setLicenseConfigurationId(value: String): Self = StObject.set(x, "LicenseConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setLicenseConfigurationIdUndefined: Self = StObject.set(x, "LicenseConfigurationId", js.undefined)
    
    inline def setLicenseCount(value: BoxLong): Self = StObject.set(x, "LicenseCount", value.asInstanceOf[js.Any])
    
    inline def setLicenseCountHardLimit(value: BoxBoolean): Self = StObject.set(x, "LicenseCountHardLimit", value.asInstanceOf[js.Any])
    
    inline def setLicenseCountHardLimitUndefined: Self = StObject.set(x, "LicenseCountHardLimit", js.undefined)
    
    inline def setLicenseCountUndefined: Self = StObject.set(x, "LicenseCount", js.undefined)
    
    inline def setLicenseCountingType(value: LicenseCountingType): Self = StObject.set(x, "LicenseCountingType", value.asInstanceOf[js.Any])
    
    inline def setLicenseCountingTypeUndefined: Self = StObject.set(x, "LicenseCountingType", js.undefined)
    
    inline def setLicenseRules(value: StringList): Self = StObject.set(x, "LicenseRules", value.asInstanceOf[js.Any])
    
    inline def setLicenseRulesUndefined: Self = StObject.set(x, "LicenseRules", js.undefined)
    
    inline def setLicenseRulesVarargs(value: String*): Self = StObject.set(x, "LicenseRules", js.Array(value*))
    
    inline def setManagedResourceSummaryList(value: ManagedResourceSummaryList): Self = StObject.set(x, "ManagedResourceSummaryList", value.asInstanceOf[js.Any])
    
    inline def setManagedResourceSummaryListUndefined: Self = StObject.set(x, "ManagedResourceSummaryList", js.undefined)
    
    inline def setManagedResourceSummaryListVarargs(value: ManagedResourceSummary*): Self = StObject.set(x, "ManagedResourceSummaryList", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerAccountId(value: String): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setProductInformationList(value: ProductInformationList): Self = StObject.set(x, "ProductInformationList", value.asInstanceOf[js.Any])
    
    inline def setProductInformationListUndefined: Self = StObject.set(x, "ProductInformationList", js.undefined)
    
    inline def setProductInformationListVarargs(value: ProductInformation*): Self = StObject.set(x, "ProductInformationList", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
