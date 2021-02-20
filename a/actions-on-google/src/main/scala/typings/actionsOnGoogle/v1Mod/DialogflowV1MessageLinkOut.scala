package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.link_out_chip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageLinkOut
  extends DialogflowV1BaseGoogleMessage[link_out_chip]
     with DialogflowV1Message {
  
  var destinationName: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object DialogflowV1MessageLinkOut {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageLinkOut = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageLinkOut]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageLinkOutMutableBuilder[Self <: DialogflowV1MessageLinkOut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
