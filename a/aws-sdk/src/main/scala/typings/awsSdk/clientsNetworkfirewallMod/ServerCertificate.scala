package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCertificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ResourceArn] = js.undefined
}
object ServerCertificate {
  
  inline def apply(): ServerCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerCertificate] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
