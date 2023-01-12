package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeValidDBInstanceModificationsResult extends StObject {
  
  var ValidDBInstanceModificationsMessage: js.UndefOr[typings.awsSdk.clientsRdsMod.ValidDBInstanceModificationsMessage] = js.undefined
}
object DescribeValidDBInstanceModificationsResult {
  
  inline def apply(): DescribeValidDBInstanceModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeValidDBInstanceModificationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeValidDBInstanceModificationsResult] (val x: Self) extends AnyVal {
    
    inline def setValidDBInstanceModificationsMessage(value: ValidDBInstanceModificationsMessage): Self = StObject.set(x, "ValidDBInstanceModificationsMessage", value.asInstanceOf[js.Any])
    
    inline def setValidDBInstanceModificationsMessageUndefined: Self = StObject.set(x, "ValidDBInstanceModificationsMessage", js.undefined)
  }
}
