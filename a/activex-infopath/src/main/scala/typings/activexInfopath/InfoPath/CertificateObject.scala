package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateObject extends StObject {
  
  val ExpirationDate: String
  
  @JSName("InfoPath.CertificateObject_typekey")
  var InfoPathDotCertificateObject_typekey: CertificateObject
  
  val IssuedBy: String
  
  val IssuedTo: String
  
  val Status: XdCertificateStatus
}
object CertificateObject {
  
  @scala.inline
  def apply(
    ExpirationDate: String,
    InfoPathDotCertificateObject_typekey: CertificateObject,
    IssuedBy: String,
    IssuedTo: String,
    Status: XdCertificateStatus
  ): CertificateObject = {
    val __obj = js.Dynamic.literal(ExpirationDate = ExpirationDate.asInstanceOf[js.Any], IssuedBy = IssuedBy.asInstanceOf[js.Any], IssuedTo = IssuedTo.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.CertificateObject_typekey")(InfoPathDotCertificateObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateObject]
  }
  
  @scala.inline
  implicit class CertificateObjectMutableBuilder[Self <: CertificateObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotCertificateObject_typekey(value: CertificateObject): Self = StObject.set(x, "InfoPath.CertificateObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedBy(value: String): Self = StObject.set(x, "IssuedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedTo(value: String): Self = StObject.set(x, "IssuedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: XdCertificateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
