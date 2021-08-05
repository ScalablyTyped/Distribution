package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2DateTimeValueSpec extends StObject {
  
  /**
    * Control datetime prompts.
    */
  var dialogSpec: js.UndefOr[GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec] = js.undefined
}
object GoogleActionsV2DateTimeValueSpec {
  
  inline def apply(): GoogleActionsV2DateTimeValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DateTimeValueSpec]
  }
  
  extension [Self <: GoogleActionsV2DateTimeValueSpec](x: Self) {
    
    inline def setDialogSpec(value: GoogleActionsV2DateTimeValueSpecDateTimeDialogSpec): Self = StObject.set(x, "dialogSpec", value.asInstanceOf[js.Any])
    
    inline def setDialogSpecUndefined: Self = StObject.set(x, "dialogSpec", js.undefined)
  }
}
