package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludePeriodConfiguration extends StObject {
  
  /**
    * The amount or number of the exclude period.
    */
  var Amount: Integer
  
  /**
    * The granularity or unit (day, month, year) of the exclude period.
    */
  var Granularity: TimeGranularity
  
  /**
    * The status of the exclude period. Choose from the following options:    ENABLED     DISABLED   
    */
  var Status: js.UndefOr[WidgetStatus] = js.undefined
}
object ExcludePeriodConfiguration {
  
  inline def apply(Amount: Integer, Granularity: TimeGranularity): ExcludePeriodConfiguration = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Granularity = Granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludePeriodConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExcludePeriodConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Integer): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setGranularity(value: TimeGranularity): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WidgetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
