package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageImage
  extends StObject
     with DialogflowV1BaseMessage[`3`]
     with DialogflowV1Message {
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object DialogflowV1MessageImage {
  
  @scala.inline
  def apply(): DialogflowV1MessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageImage]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageImageMutableBuilder[Self <: DialogflowV1MessageImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
