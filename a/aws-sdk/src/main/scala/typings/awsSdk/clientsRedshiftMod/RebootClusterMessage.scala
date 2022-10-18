package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootClusterMessage extends StObject {
  
  /**
    * The cluster identifier.
    */
  var ClusterIdentifier: String
}
object RebootClusterMessage {
  
  inline def apply(ClusterIdentifier: String): RebootClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootClusterMessage]
  }
  
  extension [Self <: RebootClusterMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
