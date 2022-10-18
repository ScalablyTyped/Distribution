package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDBClusterMessage extends StObject {
  
  /**
    * The DB cluster identifier of the Neptune DB cluster to be stopped. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String
}
object StopDBClusterMessage {
  
  inline def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBClusterMessage]
  }
  
  extension [Self <: StopDBClusterMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
