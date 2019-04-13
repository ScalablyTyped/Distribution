package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDomainConfigType extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the subdomain of your custom domain.
    */
  var CertificateArn: ArnType
}

object CustomDomainConfigType {
  @scala.inline
  def apply(CertificateArn: ArnType): CustomDomainConfigType = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn)
  
    __obj.asInstanceOf[CustomDomainConfigType]
  }
}

