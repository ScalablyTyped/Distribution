package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupConfigurationInput extends StObject {
  
  /**
    * The name or the ARN of the resource group.
    */
  var Group: js.UndefOr[GroupString] = js.undefined
}
object GetGroupConfigurationInput {
  
  inline def apply(): GetGroupConfigurationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
