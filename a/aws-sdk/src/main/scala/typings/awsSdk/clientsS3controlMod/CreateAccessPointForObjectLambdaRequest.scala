package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointForObjectLambdaRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for owner of the specified Object Lambda Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * Object Lambda Access Point configuration as a JSON document.
    */
  var Configuration: ObjectLambdaConfiguration
  
  /**
    * The name you want to assign to this Object Lambda Access Point.
    */
  var Name: ObjectLambdaAccessPointName
}
object CreateAccessPointForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId, Configuration: ObjectLambdaConfiguration, Name: ObjectLambdaAccessPointName): CreateAccessPointForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointForObjectLambdaRequest]
  }
  
  extension [Self <: CreateAccessPointForObjectLambdaRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ObjectLambdaConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
