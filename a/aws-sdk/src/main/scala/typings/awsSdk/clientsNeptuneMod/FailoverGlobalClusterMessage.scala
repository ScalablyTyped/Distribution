package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverGlobalClusterMessage extends StObject {
  
  /**
    * Identifier of the Neptune global database that should be failed over. The identifier is the unique key assigned by the user when the Neptune global database was created. In other words, it's the name of the global database that you want to fail over. Constraints: Must match the identifier of an existing Neptune global database.
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsNeptuneMod.GlobalClusterIdentifier
  
  /**
    * The Amazon Resource Name (ARN) of the secondary Neptune DB cluster that you want to promote to primary for the global database.
    */
  var TargetDbClusterIdentifier: String
}
object FailoverGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier, TargetDbClusterIdentifier: String): FailoverGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any], TargetDbClusterIdentifier = TargetDbClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverGlobalClusterMessage]
  }
  
  extension [Self <: FailoverGlobalClusterMessage](x: Self) {
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDbClusterIdentifier(value: String): Self = StObject.set(x, "TargetDbClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
