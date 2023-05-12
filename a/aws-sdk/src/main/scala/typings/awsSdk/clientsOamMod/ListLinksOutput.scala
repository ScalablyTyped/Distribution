package typings.awsSdk.clientsOamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLinksOutput extends StObject {
  
  /**
    * An array of structures that contain the information about the returned links.
    */
  var Items: ListLinksItems
  
  /**
    * The token to use when requesting the next set of links.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListLinksOutput {
  
  inline def apply(Items: ListLinksItems): ListLinksOutput = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLinksOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListLinksOutput] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListLinksItems): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ListLinksItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
