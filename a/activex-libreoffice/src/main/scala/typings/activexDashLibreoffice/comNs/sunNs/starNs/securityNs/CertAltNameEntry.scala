package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** struct contains a single entry within a Subject Alternative Name Extension of a X509 certificate. */
trait CertAltNameEntry extends js.Object {
  /**
    * defines the type of the value . With this information you can determine how to interprete the Any value.
    * @see com.sun.star.security.ExtAltNameType
    */
  var Type: ExtAltNameType
  /** stores the value of entry. */
  var Value: js.Any
}

object CertAltNameEntry {
  @scala.inline
  def apply(Type: ExtAltNameType, Value: js.Any): CertAltNameEntry = {
    val __obj = js.Dynamic.literal(Type = Type, Value = Value)
  
    __obj.asInstanceOf[CertAltNameEntry]
  }
}

