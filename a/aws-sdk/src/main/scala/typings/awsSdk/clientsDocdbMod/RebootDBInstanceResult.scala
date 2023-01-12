package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootDBInstanceResult extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBInstance] = js.undefined
}
object RebootDBInstanceResult {
  
  inline def apply(): RebootDBInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootDBInstanceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RebootDBInstanceResult] (val x: Self) extends AnyVal {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
