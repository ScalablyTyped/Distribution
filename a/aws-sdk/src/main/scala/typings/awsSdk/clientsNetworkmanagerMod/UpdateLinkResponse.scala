package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Link] = js.undefined
}
object UpdateLinkResponse {
  
  inline def apply(): UpdateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLinkResponse]
  }
  
  extension [Self <: UpdateLinkResponse](x: Self) {
    
    inline def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
