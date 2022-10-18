package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PauseClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to be paused.
    */
  var ClusterIdentifier: String
}
object PauseClusterMessage {
  
  inline def apply(ClusterIdentifier: String): PauseClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseClusterMessage]
  }
  
  extension [Self <: PauseClusterMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
