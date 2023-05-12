package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterSnapshotOutput extends StObject {
  
  /**
    * Returns information about the newly deleted Elastic DocumentDB snapshot.
    */
  var snapshot: ClusterSnapshot
}
object DeleteClusterSnapshotOutput {
  
  inline def apply(snapshot: ClusterSnapshot): DeleteClusterSnapshotOutput = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterSnapshotOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterSnapshotOutput] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: ClusterSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
