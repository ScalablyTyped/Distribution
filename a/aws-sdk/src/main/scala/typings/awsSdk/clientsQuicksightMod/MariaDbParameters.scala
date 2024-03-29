package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MariaDbParameters extends StObject {
  
  /**
    * Database.
    */
  var Database: typings.awsSdk.clientsQuicksightMod.Database
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.clientsQuicksightMod.Host
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.clientsQuicksightMod.Port
}
object MariaDbParameters {
  
  inline def apply(Database: Database, Host: Host, Port: Port): MariaDbParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaDbParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MariaDbParameters] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
