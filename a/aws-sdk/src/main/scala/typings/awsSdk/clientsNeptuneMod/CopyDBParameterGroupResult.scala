package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBParameterGroupResult extends StObject {
  
  var DBParameterGroup: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBParameterGroup] = js.undefined
}
object CopyDBParameterGroupResult {
  
  inline def apply(): CopyDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBParameterGroupResult]
  }
  
  extension [Self <: CopyDBParameterGroupResult](x: Self) {
    
    inline def setDBParameterGroup(value: DBParameterGroup): Self = StObject.set(x, "DBParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupUndefined: Self = StObject.set(x, "DBParameterGroup", js.undefined)
  }
}
