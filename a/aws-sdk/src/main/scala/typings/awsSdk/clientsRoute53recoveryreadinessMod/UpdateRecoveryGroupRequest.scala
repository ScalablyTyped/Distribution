package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRecoveryGroupRequest extends StObject {
  
  /**
    * A list of cell Amazon Resource Names (ARNs). This list completely replaces the previous list.
    */
  var Cells: listOfString
  
  /**
    * The name of a recovery group.
    */
  var RecoveryGroupName: string
}
object UpdateRecoveryGroupRequest {
  
  inline def apply(Cells: listOfString, RecoveryGroupName: string): UpdateRecoveryGroupRequest = {
    val __obj = js.Dynamic.literal(Cells = Cells.asInstanceOf[js.Any], RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRecoveryGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRecoveryGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setRecoveryGroupName(value: string): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
  }
}
