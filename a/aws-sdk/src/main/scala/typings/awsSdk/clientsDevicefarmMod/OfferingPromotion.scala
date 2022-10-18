package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferingPromotion extends StObject {
  
  /**
    * A string that describes the offering promotion.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The ID of the offering promotion.
    */
  var id: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
}
object OfferingPromotion {
  
  inline def apply(): OfferingPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingPromotion]
  }
  
  extension [Self <: OfferingPromotion](x: Self) {
    
    inline def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
