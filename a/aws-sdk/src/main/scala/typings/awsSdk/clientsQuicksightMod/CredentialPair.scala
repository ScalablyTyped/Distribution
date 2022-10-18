package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialPair extends StObject {
  
  /**
    * A set of alternate data source parameters that you want to share for these credentials. The credentials are applied in tandem with the data source parameters when you copy a data source by using a create or update request. The API operation compares the DataSourceParameters structure that's in the request with the structures in the AlternateDataSourceParameters allow list. If the structures are an exact match, the request is allowed to use the new data source with the existing credentials. If the AlternateDataSourceParameters list is null, the DataSourceParameters originally used with these Credentials is automatically allowed.
    */
  var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.undefined
  
  /**
    * Password.
    */
  var Password: typings.awsSdk.clientsQuicksightMod.Password
  
  /**
    * User name.
    */
  var Username: typings.awsSdk.clientsQuicksightMod.Username
}
object CredentialPair {
  
  inline def apply(Password: Password, Username: Username): CredentialPair = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialPair]
  }
  
  extension [Self <: CredentialPair](x: Self) {
    
    inline def setAlternateDataSourceParameters(value: DataSourceParametersList): Self = StObject.set(x, "AlternateDataSourceParameters", value.asInstanceOf[js.Any])
    
    inline def setAlternateDataSourceParametersUndefined: Self = StObject.set(x, "AlternateDataSourceParameters", js.undefined)
    
    inline def setAlternateDataSourceParametersVarargs(value: DataSourceParameters*): Self = StObject.set(x, "AlternateDataSourceParameters", js.Array(value*))
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
