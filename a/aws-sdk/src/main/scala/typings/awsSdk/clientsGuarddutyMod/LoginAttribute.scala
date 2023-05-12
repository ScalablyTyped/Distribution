package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginAttribute extends StObject {
  
  /**
    * Indicates the application name used to attempt log in.
    */
  var Application: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the sum of failed (unsuccessful) login attempts made to establish a connection to the database instance.
    */
  var FailedLoginAttempts: js.UndefOr[Integer] = js.undefined
  
  /**
    * Represents the sum of successful connections (a correct combination of login attributes) made to the database instance by the actor.
    */
  var SuccessfulLoginAttempts: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates the user name which attempted to log in.
    */
  var User: js.UndefOr[String] = js.undefined
}
object LoginAttribute {
  
  inline def apply(): LoginAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginAttribute] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: String): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "Application", js.undefined)
    
    inline def setFailedLoginAttempts(value: Integer): Self = StObject.set(x, "FailedLoginAttempts", value.asInstanceOf[js.Any])
    
    inline def setFailedLoginAttemptsUndefined: Self = StObject.set(x, "FailedLoginAttempts", js.undefined)
    
    inline def setSuccessfulLoginAttempts(value: Integer): Self = StObject.set(x, "SuccessfulLoginAttempts", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulLoginAttemptsUndefined: Self = StObject.set(x, "SuccessfulLoginAttempts", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
