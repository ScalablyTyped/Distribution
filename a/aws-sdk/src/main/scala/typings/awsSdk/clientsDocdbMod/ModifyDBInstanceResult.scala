package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBInstance] = js.undefined
}
object ModifyDBInstanceResult {
  
  inline def apply(): ModifyDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBInstanceResult]
  }
  
  extension [Self <: ModifyDBInstanceResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
