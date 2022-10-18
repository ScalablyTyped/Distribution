package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrestoParameters extends StObject {
  
  /**
    * Catalog.
    */
  var Catalog: typings.awsSdk.clientsQuicksightMod.Catalog
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.clientsQuicksightMod.Host
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.clientsQuicksightMod.Port
}
object PrestoParameters {
  
  inline def apply(Catalog: Catalog, Host: Host, Port: Port): PrestoParameters = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrestoParameters]
  }
  
  extension [Self <: PrestoParameters](x: Self) {
    
    inline def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
