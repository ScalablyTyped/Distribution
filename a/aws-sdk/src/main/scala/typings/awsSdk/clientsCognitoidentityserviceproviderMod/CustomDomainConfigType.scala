package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomDomainConfigType extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Certificate Manager SSL certificate. You use this certificate for the subdomain of your custom domain.
    */
  var CertificateArn: ArnType
}
object CustomDomainConfigType {
  
  inline def apply(CertificateArn: ArnType): CustomDomainConfigType = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDomainConfigType]
  }
  
  extension [Self <: CustomDomainConfigType](x: Self) {
    
    inline def setCertificateArn(value: ArnType): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
