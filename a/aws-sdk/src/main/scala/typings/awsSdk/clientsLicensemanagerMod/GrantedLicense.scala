package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantedLicense extends StObject {
  
  /**
    * Granted license beneficiary.
    */
  var Beneficiary: js.UndefOr[String] = js.undefined
  
  /**
    * Configuration for consumption of the license.
    */
  var ConsumptionConfiguration: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ConsumptionConfiguration] = js.undefined
  
  /**
    * Creation time of the granted license.
    */
  var CreateTime: js.UndefOr[ISO8601DateTime] = js.undefined
  
  /**
    * License entitlements.
    */
  var Entitlements: js.UndefOr[EntitlementList] = js.undefined
  
  /**
    * Home Region of the granted license.
    */
  var HomeRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Granted license issuer.
    */
  var Issuer: js.UndefOr[IssuerDetails] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Granted license metadata.
    */
  var LicenseMetadata: js.UndefOr[MetadataList] = js.undefined
  
  /**
    * License name.
    */
  var LicenseName: js.UndefOr[String] = js.undefined
  
  /**
    * Product name.
    */
  var ProductName: js.UndefOr[String] = js.undefined
  
  /**
    * Product SKU.
    */
  var ProductSKU: js.UndefOr[String] = js.undefined
  
  /**
    * Granted license received metadata.
    */
  var ReceivedMetadata: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ReceivedMetadata] = js.undefined
  
  /**
    * Granted license status.
    */
  var Status: js.UndefOr[LicenseStatus] = js.undefined
  
  /**
    * Date and time range during which the granted license is valid, in ISO8601-UTC format.
    */
  var Validity: js.UndefOr[DatetimeRange] = js.undefined
  
  /**
    * Version of the granted license.
    */
  var Version: js.UndefOr[String] = js.undefined
}
object GrantedLicense {
  
  inline def apply(): GrantedLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantedLicense]
  }
  
  extension [Self <: GrantedLicense](x: Self) {
    
    inline def setBeneficiary(value: String): Self = StObject.set(x, "Beneficiary", value.asInstanceOf[js.Any])
    
    inline def setBeneficiaryUndefined: Self = StObject.set(x, "Beneficiary", js.undefined)
    
    inline def setConsumptionConfiguration(value: ConsumptionConfiguration): Self = StObject.set(x, "ConsumptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setConsumptionConfigurationUndefined: Self = StObject.set(x, "ConsumptionConfiguration", js.undefined)
    
    inline def setCreateTime(value: ISO8601DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEntitlements(value: EntitlementList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsUndefined: Self = StObject.set(x, "Entitlements", js.undefined)
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionUndefined: Self = StObject.set(x, "HomeRegion", js.undefined)
    
    inline def setIssuer(value: IssuerDetails): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseArnUndefined: Self = StObject.set(x, "LicenseArn", js.undefined)
    
    inline def setLicenseMetadata(value: MetadataList): Self = StObject.set(x, "LicenseMetadata", value.asInstanceOf[js.Any])
    
    inline def setLicenseMetadataUndefined: Self = StObject.set(x, "LicenseMetadata", js.undefined)
    
    inline def setLicenseMetadataVarargs(value: Metadata*): Self = StObject.set(x, "LicenseMetadata", js.Array(value*))
    
    inline def setLicenseName(value: String): Self = StObject.set(x, "LicenseName", value.asInstanceOf[js.Any])
    
    inline def setLicenseNameUndefined: Self = StObject.set(x, "LicenseName", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    inline def setProductSKU(value: String): Self = StObject.set(x, "ProductSKU", value.asInstanceOf[js.Any])
    
    inline def setProductSKUUndefined: Self = StObject.set(x, "ProductSKU", js.undefined)
    
    inline def setReceivedMetadata(value: ReceivedMetadata): Self = StObject.set(x, "ReceivedMetadata", value.asInstanceOf[js.Any])
    
    inline def setReceivedMetadataUndefined: Self = StObject.set(x, "ReceivedMetadata", js.undefined)
    
    inline def setStatus(value: LicenseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setValidity(value: DatetimeRange): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "Validity", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
