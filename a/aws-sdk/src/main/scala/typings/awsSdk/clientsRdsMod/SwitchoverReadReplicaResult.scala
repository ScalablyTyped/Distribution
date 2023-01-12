package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchoverReadReplicaResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object SwitchoverReadReplicaResult {
  
  inline def apply(): SwitchoverReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchoverReadReplicaResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchoverReadReplicaResult] (val x: Self) extends AnyVal {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
