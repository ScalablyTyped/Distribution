package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterSessionCredentialsOutput extends StObject {
  
  /**
    * The credentials that you can use to connect to cluster endpoints that support username and password authentication.
    */
  var Credentials: js.UndefOr[typings.awsSdk.clientsEmrMod.Credentials] = js.undefined
  
  /**
    * The time when the credentials that are returned by the GetClusterSessionCredentials API expire.
    */
  var ExpiresAt: js.UndefOr[js.Date] = js.undefined
}
object GetClusterSessionCredentialsOutput {
  
  inline def apply(): GetClusterSessionCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetClusterSessionCredentialsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterSessionCredentialsOutput] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "ExpiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "ExpiresAt", js.undefined)
  }
}
