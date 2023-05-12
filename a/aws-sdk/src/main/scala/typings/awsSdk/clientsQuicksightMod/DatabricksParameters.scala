package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabricksParameters extends StObject {
  
  /**
    * The host name of the Databricks data source.
    */
  var Host: typings.awsSdk.clientsQuicksightMod.Host
  
  /**
    * The port for the Databricks data source.
    */
  var Port: typings.awsSdk.clientsQuicksightMod.Port
  
  /**
    * The HTTP path of the Databricks data source.
    */
  var SqlEndpointPath: typings.awsSdk.clientsQuicksightMod.SqlEndpointPath
}
object DatabricksParameters {
  
  inline def apply(Host: Host, Port: Port, SqlEndpointPath: SqlEndpointPath): DatabricksParameters = {
    val __obj = js.Dynamic.literal(Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any], SqlEndpointPath = SqlEndpointPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabricksParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabricksParameters] (val x: Self) extends AnyVal {
    
    inline def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setSqlEndpointPath(value: SqlEndpointPath): Self = StObject.set(x, "SqlEndpointPath", value.asInstanceOf[js.Any])
  }
}
