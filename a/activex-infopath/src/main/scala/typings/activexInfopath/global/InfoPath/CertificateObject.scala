package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdCertificateStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.CertificateObject")
@js.native
/* private */ open class CertificateObject ()
  extends StObject
     with typings.activexInfopath.InfoPath.CertificateObject {
  
  /* CompleteClass */
  override val ExpirationDate: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.CertificateObject_typekey")
  var InfoPathDotCertificateObject_typekey: typings.activexInfopath.InfoPath.CertificateObject = js.native
  
  /* CompleteClass */
  override val IssuedBy: String = js.native
  
  /* CompleteClass */
  override val IssuedTo: String = js.native
  
  /* CompleteClass */
  override val Status: XdCertificateStatus = js.native
}
