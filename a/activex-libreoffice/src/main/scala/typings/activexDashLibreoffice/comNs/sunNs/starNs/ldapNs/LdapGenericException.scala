package typings.activexDashLibreoffice.comNs.sunNs.starNs.ldapNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic exception occurring during access to an LDAP server. The actual LDAP error code is provided for more refined error management.
  * @since OOo 1.1.2
  */
trait LdapGenericException extends Exception {
  /** LDAP error code, see LDAP SDK documentation for complete list of possible values and their meaning. */
  var ErrorCode: Double
}

object LdapGenericException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String): LdapGenericException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCode = ErrorCode, Message = Message)
  
    __obj.asInstanceOf[LdapGenericException]
  }
}

