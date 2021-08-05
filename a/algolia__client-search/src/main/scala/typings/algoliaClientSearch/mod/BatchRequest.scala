package typings.algoliaClientSearch.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchRequest extends StObject {
  
  /**
    * The batch action.
    */
  val action: BatchActionType
  
  /**
    * The body of the given `action`. Note that, bodies difer
    * depending of the action.
    */
  val body: Record[String, js.Any]
}
object BatchRequest {
  
  inline def apply(action: BatchActionType, body: Record[String, js.Any]): BatchRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequest]
  }
  
  extension [Self <: BatchRequest](x: Self) {
    
    inline def setAction(value: BatchActionType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBody(value: Record[String, js.Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
