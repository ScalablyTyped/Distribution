package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuroraPostgreSqlParameters extends StObject {
  
  /**
    * The Amazon Aurora PostgreSQL database to connect to.
    */
  var Database: typings.awsSdk.clientsQuicksightMod.Database
  
  /**
    * The Amazon Aurora PostgreSQL-Compatible host to connect to.
    */
  var Host: typings.awsSdk.clientsQuicksightMod.Host
  
  /**
    * The port that Amazon Aurora PostgreSQL is listening on.
    */
  var Port: typings.awsSdk.clientsQuicksightMod.Port
}
object AuroraPostgreSqlParameters {
  
  inline def apply(Database: Database, Host: Host, Port: Port): AuroraPostgreSqlParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuroraPostgreSqlParameters]
  }
  
  extension [Self <: AuroraPostgreSqlParameters](x: Self) {
    
    inline def setDatabase(value: Database): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
