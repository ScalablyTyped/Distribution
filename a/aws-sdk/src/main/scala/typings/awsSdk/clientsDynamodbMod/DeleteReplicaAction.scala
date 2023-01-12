package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicaAction extends StObject {
  
  /**
    * The Region of the replica to be removed.
    */
  var RegionName: typings.awsSdk.clientsDynamodbMod.RegionName
}
object DeleteReplicaAction {
  
  inline def apply(RegionName: RegionName): DeleteReplicaAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicaAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicaAction] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
  }
}
