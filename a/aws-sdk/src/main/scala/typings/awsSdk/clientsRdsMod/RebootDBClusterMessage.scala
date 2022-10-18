package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootDBClusterMessage extends StObject {
  
  /**
    * The DB cluster identifier. This parameter is stored as a lowercase string. Constraints:   Must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: String
}
object RebootDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): RebootDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootDBClusterMessage]
  }
  
  extension [Self <: RebootDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
