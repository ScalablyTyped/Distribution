package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupOutput extends StObject {
  
  /**
    * The update description of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Group] = js.undefined
}
object UpdateGroupOutput {
  
  inline def apply(): UpdateGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupOutput]
  }
  
  extension [Self <: UpdateGroupOutput](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
