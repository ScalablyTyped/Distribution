package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantRequest extends StObject {
  
  /**
    * Allowed operations for the grant.
    */
  var AllowedOperations: AllowedOperationList
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: typings.awsSdk.clientsLicensemanagerMod.ClientToken
  
  /**
    * Grant name.
    */
  var GrantName: String
  
  /**
    * Home Region of the grant.
    */
  var HomeRegion: String
  
  /**
    * Amazon Resource Name (ARN) of the license.
    */
  var LicenseArn: Arn
  
  /**
    * The grant principals.
    */
  var Principals: PrincipalArnList
}
object CreateGrantRequest {
  
  inline def apply(
    AllowedOperations: AllowedOperationList,
    ClientToken: ClientToken,
    GrantName: String,
    HomeRegion: String,
    LicenseArn: Arn,
    Principals: PrincipalArnList
  ): CreateGrantRequest = {
    val __obj = js.Dynamic.literal(AllowedOperations = AllowedOperations.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], GrantName = GrantName.asInstanceOf[js.Any], HomeRegion = HomeRegion.asInstanceOf[js.Any], LicenseArn = LicenseArn.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantRequest]
  }
  
  extension [Self <: CreateGrantRequest](x: Self) {
    
    inline def setAllowedOperations(value: AllowedOperationList): Self = StObject.set(x, "AllowedOperations", value.asInstanceOf[js.Any])
    
    inline def setAllowedOperationsVarargs(value: AllowedOperation*): Self = StObject.set(x, "AllowedOperations", js.Array(value*))
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setGrantName(value: String): Self = StObject.set(x, "GrantName", value.asInstanceOf[js.Any])
    
    inline def setHomeRegion(value: String): Self = StObject.set(x, "HomeRegion", value.asInstanceOf[js.Any])
    
    inline def setLicenseArn(value: Arn): Self = StObject.set(x, "LicenseArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipals(value: PrincipalArnList): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: Arn*): Self = StObject.set(x, "Principals", js.Array(value*))
  }
}
