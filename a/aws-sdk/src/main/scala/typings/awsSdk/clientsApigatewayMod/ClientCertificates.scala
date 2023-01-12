package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificates extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfClientCertificate] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object ClientCertificates {
  
  inline def apply(): ClientCertificates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCertificates] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListOfClientCertificate): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ClientCertificate*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
