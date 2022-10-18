package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBInstance] = js.undefined
}
object CreateDBInstanceResult {
  
  inline def apply(): CreateDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBInstanceResult]
  }
  
  extension [Self <: CreateDBInstanceResult](x: Self) {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
