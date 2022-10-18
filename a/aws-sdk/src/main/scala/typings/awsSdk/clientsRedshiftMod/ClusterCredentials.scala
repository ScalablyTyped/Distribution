package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCredentials extends StObject {
  
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database permissions as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[js.Date] = js.undefined
}
object ClusterCredentials {
  
  inline def apply(): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCredentials]
  }
  
  extension [Self <: ClusterCredentials](x: Self) {
    
    inline def setDbPassword(value: SensitiveString): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
  }
}
