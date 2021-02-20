package typings.algoliaClientSearch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchRequest extends StObject {
  
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
  implicit class BatchRequestMutableBuilder[Self <: BatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: BatchActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Record[String, _]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
