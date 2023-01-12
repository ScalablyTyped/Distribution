package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartQueryResponse extends StObject {
  
  /**
    * The ID of the started query.
    */
  var QueryId: js.UndefOr[UUID] = js.undefined
}
object StartQueryResponse {
  
  inline def apply(): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setQueryId(value: UUID): Self = StObject.set(x, "QueryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "QueryId", js.undefined)
  }
}
