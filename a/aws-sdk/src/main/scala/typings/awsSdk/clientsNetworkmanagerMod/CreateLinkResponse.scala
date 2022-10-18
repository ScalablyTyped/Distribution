package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLinkResponse extends StObject {
  
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Link] = js.undefined
}
object CreateLinkResponse {
  
  inline def apply(): CreateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLinkResponse]
  }
  
  extension [Self <: CreateLinkResponse](x: Self) {
    
    inline def setLink(value: Link): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "Link", js.undefined)
  }
}
