package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBInstanceFromS3Result extends StObject {
  
  var DBInstance: js.UndefOr[typings.awsSdk.clientsRdsMod.DBInstance] = js.undefined
}
object RestoreDBInstanceFromS3Result {
  
  inline def apply(): RestoreDBInstanceFromS3Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBInstanceFromS3Result]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreDBInstanceFromS3Result] (val x: Self) extends AnyVal {
    
    inline def setDBInstance(value: DBInstance): Self = StObject.set(x, "DBInstance", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceUndefined: Self = StObject.set(x, "DBInstance", js.undefined)
  }
}
