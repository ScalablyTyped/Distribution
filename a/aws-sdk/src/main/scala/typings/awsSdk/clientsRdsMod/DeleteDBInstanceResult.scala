package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object DeleteDBInstanceResult {
  
  inline def apply(): DeleteDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceResult]
  }
  
  extension [Self <: DeleteDBInstanceResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
