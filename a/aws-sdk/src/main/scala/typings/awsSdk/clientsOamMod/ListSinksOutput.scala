package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSinksOutput extends StObject {
  
  /**
    * An array of structures that contain the information about the returned sinks.
    */
  var Items: ListSinksItems
  
  /**
    * The token to use when requesting the next set of sinks.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListSinksOutput {
  
  inline def apply(Items: ListSinksItems): ListSinksOutput = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSinksOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSinksOutput] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListSinksItems): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ListSinksItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
