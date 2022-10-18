package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.link_out_chip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageLinkOut
  extends StObject
     with DialogflowV1BaseGoogleMessage[link_out_chip]
     with DialogflowV1Message {
  
  var destinationName: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageLinkOut {
  
  inline def apply(): DialogflowV1MessageLinkOut = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageLinkOut]
  }
  
  extension [Self <: DialogflowV1MessageLinkOut](x: Self) {
    
    inline def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    inline def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
