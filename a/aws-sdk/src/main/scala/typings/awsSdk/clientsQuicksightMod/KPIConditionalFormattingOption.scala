package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KPIConditionalFormattingOption extends StObject {
  
  /**
    * The conditional formatting for the primary value of a KPI visual.
    */
  var PrimaryValue: js.UndefOr[KPIPrimaryValueConditionalFormatting] = js.undefined
  
  /**
    * The conditional formatting for the progress bar of a KPI visual.
    */
  var ProgressBar: js.UndefOr[KPIProgressBarConditionalFormatting] = js.undefined
}
object KPIConditionalFormattingOption {
  
  inline def apply(): KPIConditionalFormattingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KPIConditionalFormattingOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KPIConditionalFormattingOption] (val x: Self) extends AnyVal {
    
    inline def setPrimaryValue(value: KPIPrimaryValueConditionalFormatting): Self = StObject.set(x, "PrimaryValue", value.asInstanceOf[js.Any])
    
    inline def setPrimaryValueUndefined: Self = StObject.set(x, "PrimaryValue", js.undefined)
    
    inline def setProgressBar(value: KPIProgressBarConditionalFormatting): Self = StObject.set(x, "ProgressBar", value.asInstanceOf[js.Any])
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "ProgressBar", js.undefined)
  }
}
