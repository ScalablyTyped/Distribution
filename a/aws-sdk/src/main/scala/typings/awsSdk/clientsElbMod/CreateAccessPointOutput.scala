package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointOutput extends StObject {
  
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.clientsElbMod.DNSName] = js.undefined
}
object CreateAccessPointOutput {
  
  inline def apply(): CreateAccessPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointOutput]
  }
  
  extension [Self <: CreateAccessPointOutput](x: Self) {
    
    inline def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
  }
}
