package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginDetails extends StObject {
  
  /**
    * The product ID of the origin of the data set.
    */
  var ProductId: _String
}
object OriginDetails {
  
  inline def apply(ProductId: _String): OriginDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginDetails] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: _String): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
  }
}
