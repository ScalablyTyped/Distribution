package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRequest extends js.Object {
  
  /**
    * The batch action.
    */
  val action: BatchActionType = js.native
  
  /**
    * The body of the given `action`. Note that, bodies difer
    * depending of the action.
    */
  val body: Record[String, _] = js.native
}
object BatchRequest {
  
  @scala.inline
  def apply(action: BatchActionType, body: Record[String, _]): BatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequest]
  }
  
  @scala.inline
  implicit class BatchRequestOps[Self <: BatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: BatchActionType): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Record[String, _]): Self = this.set("body", value.asInstanceOf[js.Any])
  }
}
