package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyAccessControlAllowMethods extends StObject {
  
  /**
    * The list of HTTP methods. Valid values are:    GET     DELETE     HEAD     OPTIONS     PATCH     POST     PUT     ALL     ALL is a special value that includes all of the listed HTTP methods.
    */
  var Items: AccessControlAllowMethodsList
  
  /**
    * The number of HTTP methods in the list.
    */
  var Quantity: integer
}
object ResponseHeadersPolicyAccessControlAllowMethods {
  
  inline def apply(Items: AccessControlAllowMethodsList, Quantity: integer): ResponseHeadersPolicyAccessControlAllowMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyAccessControlAllowMethods]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyAccessControlAllowMethods] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessControlAllowMethodsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ResponseHeadersPolicyAccessControlAllowMethodsValues*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
