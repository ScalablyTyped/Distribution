package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSService extends StObject {
  
  /**
    *  The name of the Amazon Web Service. 
    */
  var serviceName: js.UndefOr[AWSServiceName] = js.undefined
}
object AWSService {
  
  inline def apply(): AWSService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AWSService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AWSService] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: AWSServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
