package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tls extends js.Object {
  /**
    * 
    List of ACM Certificate Authority ARNs.
    
    */
  var CertificateAuthorityArnList: js.UndefOr[__listOf__string] = js.undefined
}

object Tls {
  @scala.inline
  def apply(CertificateAuthorityArnList: __listOf__string = null): Tls = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityArnList != null) __obj.updateDynamic("CertificateAuthorityArnList")(CertificateAuthorityArnList)
    __obj.asInstanceOf[Tls]
  }
}

