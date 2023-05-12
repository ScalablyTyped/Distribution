package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDateTimeControlDisplayOptions extends StObject {
  
  /**
    * Customize how dates are formatted in controls.
    */
  var DateTimeFormat: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeFormat] = js.undefined
  
  /**
    * The options to configure the title visibility, name, and font size.
    */
  var TitleOptions: js.UndefOr[LabelOptions] = js.undefined
}
object RelativeDateTimeControlDisplayOptions {
  
  inline def apply(): RelativeDateTimeControlDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeDateTimeControlDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeDateTimeControlDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setDateTimeFormat(value: DateTimeFormat): Self = StObject.set(x, "DateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDateTimeFormatUndefined: Self = StObject.set(x, "DateTimeFormat", js.undefined)
    
    inline def setTitleOptions(value: LabelOptions): Self = StObject.set(x, "TitleOptions", value.asInstanceOf[js.Any])
    
    inline def setTitleOptionsUndefined: Self = StObject.set(x, "TitleOptions", js.undefined)
  }
}
