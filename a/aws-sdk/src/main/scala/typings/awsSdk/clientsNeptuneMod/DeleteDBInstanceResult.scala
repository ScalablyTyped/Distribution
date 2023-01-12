package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBInstance] = js.undefined
}
object DeleteDBInstanceResult {
  
  inline def apply(): DeleteDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDBInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
