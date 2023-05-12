package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushDomainRequest extends StObject {
  
  /**
    *  Name of the domain. 
    */
  var DomainName: typings.awsSdk.clientsRoute53domainsMod.DomainName
  
  /**
    *  New IPS tag for the domain. 
    */
  var Target: Label
}
object PushDomainRequest {
  
  inline def apply(DomainName: DomainName, Target: Label): PushDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Label): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
