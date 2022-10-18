package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBParameterGroupStatus extends StObject {
  
  /**
    * The name of the DB parameter group.
    */
  var DBParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of parameter updates.
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.undefined
}
object DBParameterGroupStatus {
  
  inline def apply(): DBParameterGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBParameterGroupStatus]
  }
  
  extension [Self <: DBParameterGroupStatus](x: Self) {
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupNameUndefined: Self = StObject.set(x, "DBParameterGroupName", js.undefined)
    
    inline def setParameterApplyStatus(value: String): Self = StObject.set(x, "ParameterApplyStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterApplyStatusUndefined: Self = StObject.set(x, "ParameterApplyStatus", js.undefined)
  }
}
