package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBInstanceReadReplicaResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object CreateDBInstanceReadReplicaResult {
  
  inline def apply(): CreateDBInstanceReadReplicaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBInstanceReadReplicaResult]
  }
  
  extension [Self <: CreateDBInstanceReadReplicaResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
