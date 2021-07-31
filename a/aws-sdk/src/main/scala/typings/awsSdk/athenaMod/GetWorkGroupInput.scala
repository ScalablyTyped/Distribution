package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkGroupInput extends StObject {
  
  /**
    * The name of the workgroup.
    */
  var WorkGroup: WorkGroupName
}
object GetWorkGroupInput {
  
  @scala.inline
  def apply(WorkGroup: WorkGroupName): GetWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkGroupInput]
  }
  
  @scala.inline
  implicit class GetWorkGroupInputMutableBuilder[Self <: GetWorkGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
  }
}
