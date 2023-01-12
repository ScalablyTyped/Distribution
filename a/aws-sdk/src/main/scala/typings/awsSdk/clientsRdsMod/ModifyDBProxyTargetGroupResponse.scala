package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBProxyTargetGroupResponse extends StObject {
  
  /**
    * The settings of the modified DBProxyTarget.
    */
  var DBProxyTargetGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxyTargetGroup] = js.undefined
}
object ModifyDBProxyTargetGroupResponse {
  
  inline def apply(): ModifyDBProxyTargetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBProxyTargetGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBProxyTargetGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setDBProxyTargetGroup(value: DBProxyTargetGroup): Self = StObject.set(x, "DBProxyTargetGroup", value.asInstanceOf[js.Any])
    
    inline def setDBProxyTargetGroupUndefined: Self = StObject.set(x, "DBProxyTargetGroup", js.undefined)
  }
}
