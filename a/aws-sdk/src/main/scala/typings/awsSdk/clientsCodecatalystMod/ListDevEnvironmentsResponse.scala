package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevEnvironmentsResponse extends StObject {
  
  /**
    * Information about the Dev Environments in a project.
    */
  var items: DevEnvironmentSummaryList
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListDevEnvironmentsResponse {
  
  inline def apply(items: DevEnvironmentSummaryList): ListDevEnvironmentsResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevEnvironmentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: DevEnvironmentSummaryList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DevEnvironmentSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
