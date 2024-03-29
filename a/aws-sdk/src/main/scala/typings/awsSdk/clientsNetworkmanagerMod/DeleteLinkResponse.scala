package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Link] = js.undefined
}
object DeleteLinkResponse {
  
  inline def apply(): DeleteLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLinkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLinkResponse] (val x: Self) extends AnyVal {
    
    inline def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
