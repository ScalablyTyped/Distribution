package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupOutput extends StObject {
  
  /**
    * A full description of the deleted resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Group] = js.undefined
}
object DeleteGroupOutput {
  
  inline def apply(): DeleteGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGroupOutput]
  }
  
  extension [Self <: DeleteGroupOutput](x: Self) {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
