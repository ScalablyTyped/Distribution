package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLoggingStatusMessage extends StObject {
  
  /**
    * The identifier of the cluster from which to get the logging status. Example: examplecluster 
    */
  var ClusterIdentifier: String
}
object DescribeLoggingStatusMessage {
  
  inline def apply(ClusterIdentifier: String): DescribeLoggingStatusMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoggingStatusMessage]
  }
  
  extension [Self <: DescribeLoggingStatusMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
