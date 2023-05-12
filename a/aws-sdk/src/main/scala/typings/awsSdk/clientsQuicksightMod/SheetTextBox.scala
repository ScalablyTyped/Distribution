package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetTextBox extends StObject {
  
  /**
    * The content that is displayed in the text box.
    */
  var Content: js.UndefOr[SheetTextBoxContent] = js.undefined
  
  /**
    * The unique identifier for a text box. This identifier must be unique within the context of a dashboard, template, or analysis. Two dashboards, analyses, or templates can have text boxes that share identifiers.
    */
  var SheetTextBoxId: ShortRestrictiveResourceId
}
object SheetTextBox {
  
  inline def apply(SheetTextBoxId: ShortRestrictiveResourceId): SheetTextBox = {
    val __obj = js.Dynamic.literal(SheetTextBoxId = SheetTextBoxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetTextBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetTextBox] (val x: Self) extends AnyVal {
    
    inline def setContent(value: SheetTextBoxContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setSheetTextBoxId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SheetTextBoxId", value.asInstanceOf[js.Any])
  }
}
