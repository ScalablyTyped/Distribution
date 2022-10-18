package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupQueryOutput extends StObject {
  
  /**
    * The resource query associated with the specified group. For more information about resource queries, see Create a tag-based group in Resource Groups.
    */
  var GroupQuery: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupQuery] = js.undefined
}
object GetGroupQueryOutput {
  
  inline def apply(): GetGroupQueryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupQueryOutput]
  }
  
  extension [Self <: GetGroupQueryOutput](x: Self) {
    
    inline def setGroupQuery(value: GroupQuery): Self = StObject.set(x, "GroupQuery", value.asInstanceOf[js.Any])
    
    inline def setGroupQueryUndefined: Self = StObject.set(x, "GroupQuery", js.undefined)
  }
}
