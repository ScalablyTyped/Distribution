package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsDbUserDetails extends StObject {
  
  /**
    * The application name used in the anomalous login attempt.
    */
  var Application: js.UndefOr[String] = js.undefined
  
  /**
    * The authentication method used by the user involved in the finding.
    */
  var AuthMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the database instance involved in the anomalous login attempt.
    */
  var Database: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the Secure Socket Layer (SSL) used for the network.
    */
  var Ssl: js.UndefOr[String] = js.undefined
  
  /**
    * The user name used in the anomalous login attempt.
    */
  var User: js.UndefOr[String] = js.undefined
}
object RdsDbUserDetails {
  
  inline def apply(): RdsDbUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsDbUserDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsDbUserDetails] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setAuthMethod(value: String): Self = StObject.set(x, "AuthMethod", value.asInstanceOf[js.Any])
    
    inline def setAuthMethodUndefined: Self = StObject.set(x, "AuthMethod", js.undefined)
    
    inline def setDatabase(value: String): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "Database", js.undefined)
    
    inline def setSsl(value: String): Self = StObject.set(x, "Ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "Ssl", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
