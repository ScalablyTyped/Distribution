package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionAssociations extends StObject {
  
  /**
    * The CloudFront functions that are associated with a cache behavior in a CloudFront distribution. CloudFront functions must be published to the LIVE stage to associate them with a cache behavior.
    */
  var Items: js.UndefOr[FunctionAssociationList] = js.undefined
  
  /**
    * The number of CloudFront functions in the list.
    */
  var Quantity: integer
}
object FunctionAssociations {
  
  inline def apply(Quantity: integer): FunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionAssociations]
  }
  
  extension [Self <: FunctionAssociations](x: Self) {
    
    inline def setItems(value: FunctionAssociationList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: FunctionAssociation*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
