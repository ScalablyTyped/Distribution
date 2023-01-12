package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSecurityGroupResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSecurityGroup] = js.undefined
}
object CreateDBSecurityGroupResult {
  
  inline def apply(): CreateDBSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBSecurityGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBSecurityGroupResult] (val x: Self) extends AnyVal {
    
    inline def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
