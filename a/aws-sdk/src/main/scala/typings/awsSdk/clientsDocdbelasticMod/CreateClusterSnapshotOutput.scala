package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSnapshotOutput extends StObject {
  
  /**
    * Returns information about the new Elastic DocumentDB snapshot.
    */
  var snapshot: ClusterSnapshot
}
object CreateClusterSnapshotOutput {
  
  inline def apply(snapshot: ClusterSnapshot): CreateClusterSnapshotOutput = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSnapshotOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterSnapshotOutput] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: ClusterSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
