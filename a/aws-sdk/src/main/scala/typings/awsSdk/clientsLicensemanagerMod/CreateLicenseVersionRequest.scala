package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLicenseVersionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * Configuration for consumption of the license. Choose a provisional configuration for workloads running with continuous connectivity. Choose a borrow configuration for workloads with offline usage.
    */
  var ConsumptionConfiguration: typings.awsSdk.clientsLicensemanagerMod.ConsumptionConfiguration
  
  /**
    * License entitlements.
    */
  var Entitlements: EntitlementList
  
  /**
    * Home Region of the license.
    */
  var HomeRegion: String
  
  /**
    * License issuer.
    */
  var Issuer: typings.awsSdk.clientsLicensemanagerMod.Issuer
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
  
  /**
    * Information about the license.
    */
  var LicenseMetadata: js.UndefOr[MetadataList] = js.undefined
  
  /**
    * License name.
    */
  var LicenseName: String
  
  /**
    * Product name.
    */
  var ProductName: String
  
  /**
    * Current version of the license.
    */
  var SourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * License status.
    */
  var Status: LicenseStatus
  
  /**
    * Date and time range during which the license is valid, in ISO8601-UTC format.
    */
  var Validity: DatetimeRange
}
object CreateLicenseVersionRequest {
  
  inline def apply(
    ClientToken: ClientToken,
    ConsumptionConfiguration: ConsumptionConfiguration,
    Entitlements: EntitlementList,
    HomeRegion: String,
    Issuer: Issuer,
    LicenseArn: Arn,
    LicenseName: String,
    ProductName: String,
    Status: LicenseStatus,
    Validity: DatetimeRange
  ): CreateLicenseVersionRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], ConsumptionConfiguration = ConsumptionConfiguration.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], HomeRegion = HomeRegion.asInstanceOf[js.Any], Issuer = Issuer.asInstanceOf[js.Any], LicenseArn = LicenseArn.asInstanceOf[js.Any], LicenseName = LicenseName.asInstanceOf[js.Any], ProductName = ProductName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLicenseVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLicenseVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setConsumptionConfiguration(value: ConsumptionConfiguration): Self = StObject.set(x, "ConsumptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEntitlements(value: EntitlementList): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    inline def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value*))
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Issuer): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setLicenseMetadata(value: MetadataList): Self = StObject.set(x, "LicenseMetadata", value.asInstanceOf[js.Any])
    
    inline def setLicenseMetadataUndefined: Self = StObject.set(x, "LicenseMetadata", js.undefined)
    
    inline def setLicenseMetadataVarargs(value: Metadata*): Self = StObject.set(x, "LicenseMetadata", js.Array(value*))
    
    inline def setLicenseName(value: String): Self = StObject.set(x, "LicenseName", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "SourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "SourceVersion", js.undefined)
    
    inline def setStatus(value: LicenseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: DatetimeRange): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
  }
}
