package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIProgressBarConditionalFormatting extends StObject {
  
  /**
    * The conditional formatting of the progress bar's foreground color.
    */
  var ForegroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
}
object KPIProgressBarConditionalFormatting {
  
  inline def apply(): KPIProgressBarConditionalFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIProgressBarConditionalFormatting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIProgressBarConditionalFormatting] (val x: Self) extends AnyVal {
    
    inline def setForegroundColor(value: ConditionalFormattingColor): Self = StObject.set(x, "ForegroundColor", value.asInstanceOf[js.Any])
    
    inline def setForegroundColorUndefined: Self = StObject.set(x, "ForegroundColor", js.undefined)
  }
}
