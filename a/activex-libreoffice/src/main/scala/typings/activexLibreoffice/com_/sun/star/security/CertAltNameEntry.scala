package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** struct contains a single entry within a Subject Alternative Name Extension of a X509 certificate. */
@js.native
trait CertAltNameEntry extends js.Object {
  
  /**
    * defines the type of the value . With this information you can determine how to interprete the Any value.
    * @see com.sun.star.security.ExtAltNameType
    */
  var Type: ExtAltNameType = js.native
  
  /** stores the value of entry. */
  var Value: js.Any = js.native
}
object CertAltNameEntry {
  
  @scala.inline
  def apply(Type: ExtAltNameType, Value: js.Any): CertAltNameEntry = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertAltNameEntry]
  }
  
  @scala.inline
  implicit class CertAltNameEntryOps[Self <: CertAltNameEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: ExtAltNameType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
