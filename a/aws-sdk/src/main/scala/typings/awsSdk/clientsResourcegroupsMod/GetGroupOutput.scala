package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupOutput extends StObject {
  
  /**
    * A structure that contains the metadata details for the specified resource group. Use GetGroupQuery and GetGroupConfiguration to get those additional details of the resource group.
    */
  var Group: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.Group] = js.undefined
}
object GetGroupOutput {
  
  inline def apply(): GetGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetGroupOutput] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: Group): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
