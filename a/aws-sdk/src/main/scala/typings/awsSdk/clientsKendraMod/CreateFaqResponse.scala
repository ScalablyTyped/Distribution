package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFaqResponse extends StObject {
  
  /**
    * The unique identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.undefined
}
object CreateFaqResponse {
  
  inline def apply(): CreateFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFaqResponse]
  }
  
  extension [Self <: CreateFaqResponse](x: Self) {
    
    inline def setId(value: FaqId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
