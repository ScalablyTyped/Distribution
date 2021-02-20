package typings.awsSdk.augmentedairuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHumanLoopRequest extends StObject {
  
  /**
    * The name of the human loop that you want to delete.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}
object DeleteHumanLoopRequest {
  
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DeleteHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHumanLoopRequest]
  }
  
  @scala.inline
  implicit class DeleteHumanLoopRequestMutableBuilder[Self <: DeleteHumanLoopRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = StObject.set(x, "HumanLoopName", value.asInstanceOf[js.Any])
  }
}
