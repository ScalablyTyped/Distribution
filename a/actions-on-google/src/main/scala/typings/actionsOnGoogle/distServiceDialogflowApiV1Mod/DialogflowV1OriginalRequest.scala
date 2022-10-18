package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2AppRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1OriginalRequest extends StObject {
  
  var data: js.UndefOr[GoogleActionsV2AppRequest] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object DialogflowV1OriginalRequest {
  
  inline def apply(): DialogflowV1OriginalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1OriginalRequest]
  }
  
  extension [Self <: DialogflowV1OriginalRequest](x: Self) {
    
    inline def setData(value: GoogleActionsV2AppRequest): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
