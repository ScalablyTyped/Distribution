package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ldap {
  
  /**
    * Indicates failure to connect to an LDAP server, usually because of wrong parameters (host/port) or down server.
    * @since OOo 1.1.2
    */
  type LdapConnectionException = Exception
  
  /**
    * Generic exception occurring during access to an LDAP server. The actual LDAP error code is provided for more refined error management.
    * @since OOo 1.1.2
    */
  trait LdapGenericException
    extends StObject
       with Exception {
    
    /** LDAP error code, see LDAP SDK documentation for complete list of possible values and their meaning. */
    var ErrorCode: Double
  }
  object LdapGenericException {
    
    @scala.inline
    def apply(Context: XInterface, ErrorCode: Double, Message: String): LdapGenericException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LdapGenericException]
    }
    
    @scala.inline
    implicit class LdapGenericExceptionMutableBuilder[Self <: LdapGenericException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    }
  }
}
