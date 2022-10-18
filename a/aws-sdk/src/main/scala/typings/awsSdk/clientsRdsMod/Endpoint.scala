package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  /**
    * Specifies the DNS address of the DB instance.
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}
object Endpoint {
  
  inline def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setHostedZoneId(value: String): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
