package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRecoveryGroupRequest extends StObject {
  
  /**
    * A list of the cell Amazon Resource Names (ARNs) in the recovery group.
    */
  var Cells: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The name of the recovery group to create.
    */
  var RecoveryGroupName: string
  
  var Tags: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.Tags] = js.undefined
}
object CreateRecoveryGroupRequest {
  
  inline def apply(RecoveryGroupName: string): CreateRecoveryGroupRequest = {
    val __obj = js.Dynamic.literal(RecoveryGroupName = RecoveryGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecoveryGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRecoveryGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setCells(value: listOfString): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: string*): Self = StObject.set(x, "Cells", js.Array(value*))
    
    inline def setRecoveryGroupName(value: string): Self = StObject.set(x, "RecoveryGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
