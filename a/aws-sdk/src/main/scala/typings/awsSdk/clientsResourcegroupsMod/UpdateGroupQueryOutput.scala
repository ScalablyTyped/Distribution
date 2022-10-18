package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupQueryOutput extends StObject {
  
  /**
    * The updated resource query associated with the resource group after the update.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupQuery] = js.undefined
}
object UpdateGroupQueryOutput {
  
  inline def apply(): UpdateGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupQueryOutput]
  }
  
  extension [Self <: UpdateGroupQueryOutput](x: Self) {
    
    inline def setGroupQuery(value: GroupQuery): Self = StObject.set(x, "GroupQuery", value.asInstanceOf[js.Any])
    
    inline def setGroupQueryUndefined: Self = StObject.set(x, "GroupQuery", js.undefined)
  }
}
