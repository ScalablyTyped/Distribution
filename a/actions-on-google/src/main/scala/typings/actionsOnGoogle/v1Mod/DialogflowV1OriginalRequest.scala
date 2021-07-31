package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2AppRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1OriginalRequest extends StObject {
  
  var data: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DialogflowV1OriginalRequest {
  
  @scala.inline
  def apply(): DialogflowV1OriginalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1OriginalRequest]
  }
  
  @scala.inline
  implicit class DialogflowV1OriginalRequestMutableBuilder[Self <: DialogflowV1OriginalRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: GoogleActionsV2AppRequest): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
