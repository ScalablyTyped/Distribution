package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverGlobalClusterMessage extends StObject {
  
  /**
    * Identifier of the Aurora global database (GlobalCluster) that should be failed over. The identifier is the unique key assigned by the user when the Aurora global database was created. In other words, it's the name of the Aurora global database that you want to fail over. Constraints:   Must match the identifier of an existing GlobalCluster (Aurora global database).  
    */
  var GlobalClusterIdentifier: typings.awsSdk.clientsRdsMod.GlobalClusterIdentifier
  
  /**
    * Identifier of the secondary Aurora DB cluster that you want to promote to primary for the Aurora global database (GlobalCluster.) Use the Amazon Resource Name (ARN) for the identifier so that Aurora can locate the cluster in its Amazon Web Services Region.
    */
  var TargetDbClusterIdentifier: DBClusterIdentifier
}
object FailoverGlobalClusterMessage {
  
  inline def apply(GlobalClusterIdentifier: GlobalClusterIdentifier, TargetDbClusterIdentifier: DBClusterIdentifier): FailoverGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any], TargetDbClusterIdentifier = TargetDbClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailoverGlobalClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailoverGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setGlobalClusterIdentifier(value: GlobalClusterIdentifier): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetDbClusterIdentifier(value: DBClusterIdentifier): Self = StObject.set(x, "TargetDbClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
