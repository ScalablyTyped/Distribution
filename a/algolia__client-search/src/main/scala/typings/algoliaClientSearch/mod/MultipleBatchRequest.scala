package typings.algoliaClientSearch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleBatchRequest extends StObject {
  
  /**
    * The action used.
    */
  val action: BatchActionType = js.native
  
  /**
    * The body associated with the request.
    */
  val body: Record[String, _] = js.native
  
  /**
    * The index name where the multiple batch are going to be applied.
    */
  val indexName: String = js.native
}
object MultipleBatchRequest {
  
  @scala.inline
  def apply(action: BatchActionType, body: Record[String, _], indexName: String): MultipleBatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleBatchRequest]
  }
  
  @scala.inline
  implicit class MultipleBatchRequestMutableBuilder[Self <: MultipleBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: BatchActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: Record[String, _]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
  }
}
