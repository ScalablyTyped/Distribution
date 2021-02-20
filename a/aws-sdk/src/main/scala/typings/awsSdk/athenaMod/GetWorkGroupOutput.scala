package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWorkGroupOutput extends StObject {
  
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.athenaMod.WorkGroup] = js.native
}
object GetWorkGroupOutput {
  
  @scala.inline
  def apply(): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
  
  @scala.inline
  implicit class GetWorkGroupOutputMutableBuilder[Self <: GetWorkGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkGroup(value: WorkGroup): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
