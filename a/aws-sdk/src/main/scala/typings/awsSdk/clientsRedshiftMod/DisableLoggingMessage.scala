package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableLoggingMessage extends StObject {
  
  /**
    * The identifier of the cluster on which logging is to be stopped. Example: examplecluster 
    */
  var ClusterIdentifier: String
}
object DisableLoggingMessage {
  
  inline def apply(ClusterIdentifier: String): DisableLoggingMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableLoggingMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableLoggingMessage] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
