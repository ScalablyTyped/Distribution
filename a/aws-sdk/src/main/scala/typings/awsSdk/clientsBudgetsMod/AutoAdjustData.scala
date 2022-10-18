package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoAdjustData extends StObject {
  
  /**
    * The string that defines whether your budget auto-adjusts based on historical or forecasted data.
    */
  var AutoAdjustType: typings.awsSdk.clientsBudgetsMod.AutoAdjustType
  
  /**
    * The parameters that define or describe the historical data that your auto-adjusting budget is based on.
    */
  var HistoricalOptions: js.UndefOr[typings.awsSdk.clientsBudgetsMod.HistoricalOptions] = js.undefined
  
  /**
    * The last time that your budget was auto-adjusted.
    */
  var LastAutoAdjustTime: js.UndefOr[js.Date] = js.undefined
}
object AutoAdjustData {
  
  inline def apply(AutoAdjustType: AutoAdjustType): AutoAdjustData = {
    val __obj = js.Dynamic.literal(AutoAdjustType = AutoAdjustType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAdjustData]
  }
  
  extension [Self <: AutoAdjustData](x: Self) {
    
    inline def setAutoAdjustType(value: AutoAdjustType): Self = StObject.set(x, "AutoAdjustType", value.asInstanceOf[js.Any])
    
    inline def setHistoricalOptions(value: HistoricalOptions): Self = StObject.set(x, "HistoricalOptions", value.asInstanceOf[js.Any])
    
    inline def setHistoricalOptionsUndefined: Self = StObject.set(x, "HistoricalOptions", js.undefined)
    
    inline def setLastAutoAdjustTime(value: js.Date): Self = StObject.set(x, "LastAutoAdjustTime", value.asInstanceOf[js.Any])
    
    inline def setLastAutoAdjustTimeUndefined: Self = StObject.set(x, "LastAutoAdjustTime", js.undefined)
  }
}
