package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPayload extends StObject {
  
  /**
    * The type of content in the event payload.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The data included in the event payload.
    */
  var data: js.UndefOr[String] = js.undefined
}
object EventPayload {
  
  inline def apply(): EventPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventPayload] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
