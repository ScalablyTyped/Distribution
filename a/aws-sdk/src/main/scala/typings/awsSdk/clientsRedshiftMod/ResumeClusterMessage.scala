package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResumeClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to be resumed.
    */
  var ClusterIdentifier: String
}
object ResumeClusterMessage {
  
  inline def apply(ClusterIdentifier: String): ResumeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResumeClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
