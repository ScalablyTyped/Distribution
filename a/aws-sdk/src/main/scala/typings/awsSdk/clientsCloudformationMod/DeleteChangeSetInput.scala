package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteChangeSetInput extends StObject {
  
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
    */
  var ChangeSetName: ChangeSetNameOrId
  
  /**
    * If you specified the name of a change set to delete, specify the stack name or Amazon Resource Name (ARN) that's associated with it.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
}
object DeleteChangeSetInput {
  
  inline def apply(ChangeSetName: ChangeSetNameOrId): DeleteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChangeSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteChangeSetInput] (val x: Self) extends AnyVal {
    
    inline def setChangeSetName(value: ChangeSetNameOrId): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setStackName(value: StackNameOrId): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
  }
}
