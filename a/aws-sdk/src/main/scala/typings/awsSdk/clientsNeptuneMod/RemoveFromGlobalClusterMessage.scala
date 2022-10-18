package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveFromGlobalClusterMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) identifying the cluster to be detached from the Neptune global database cluster.
    */
  var DbClusterIdentifier: String
  
  /**
    * The identifier of the Neptune global database from which to detach the specified Neptune DB cluster.
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier
}
object RemoveFromGlobalClusterMessage {
  
  inline def apply(DbClusterIdentifier: String, GlobalClusterIdentifier: GlobalClusterIdentifier): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(DbClusterIdentifier = DbClusterIdentifier.asInstanceOf[js.Any], GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
  
  extension [Self <: RemoveFromGlobalClusterMessage](x: Self) {
    
    inline def setDbClusterIdentifier(value: String): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
