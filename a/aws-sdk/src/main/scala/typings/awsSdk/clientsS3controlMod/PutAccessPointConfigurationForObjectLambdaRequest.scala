package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccessPointConfigurationForObjectLambdaRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified Object Lambda Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * Object Lambda Access Point configuration document.
    */
  var Configuration: ObjectLambdaConfiguration
  
  /**
    * The name of the Object Lambda Access Point.
    */
  var Name: ObjectLambdaAccessPointName
}
object PutAccessPointConfigurationForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId, Configuration: ObjectLambdaConfiguration, Name: ObjectLambdaAccessPointName): PutAccessPointConfigurationForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Configuration = Configuration.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessPointConfigurationForObjectLambdaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAccessPointConfigurationForObjectLambdaRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: ObjectLambdaConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
