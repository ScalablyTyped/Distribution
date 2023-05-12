package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConnectClientAlias extends StObject {
  
  /**
    * The dnsName is the name that you use in the applications of client tasks to connect to this service. The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up to 127 characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and periods (.). The name can't start with a hyphen. If this parameter isn't specified, the default value of discoveryName.namespace is used. If the discoveryName isn't specified, the port mapping name from the task definition is used in portName.namespace. To avoid changing your applications in client Amazon ECS services, set this to the same name that the client application uses by default. For example, a few common names are database, db, or the lowercase name of a database, such as mysql or redis. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var dnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The listening port number for the Service Connect proxy. This port is available inside of all of the tasks within the same namespace. To avoid changing your applications in client Amazon ECS services, set this to the same port that the client application uses by default. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var port: PortNumber
}
object ServiceConnectClientAlias {
  
  inline def apply(port: PortNumber): ServiceConnectClientAlias = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConnectClientAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConnectClientAlias] (val x: Self) extends AnyVal {
    
    inline def setDnsName(value: String): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
