package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceToPointInTimeResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object RestoreDBInstanceToPointInTimeResult {
  
  inline def apply(): RestoreDBInstanceToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceToPointInTimeResult]
  }
  
  extension [Self <: RestoreDBInstanceToPointInTimeResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
