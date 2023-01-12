package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBParameterGroupResult extends StObject {
  
  var DBParameterGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBParameterGroup] = js.undefined
}
object CopyDBParameterGroupResult {
  
  inline def apply(): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyDBParameterGroupResult] (val x: Self) extends AnyVal {
    
    inline def setDBParameterGroup(value: DBParameterGroup): Self = StObject.set(x, "DBParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupUndefined: Self = StObject.set(x, "DBParameterGroup", js.undefined)
  }
}
