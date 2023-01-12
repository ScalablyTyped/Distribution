package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnStatisticsConfiguration extends StObject {
  
  /**
    * List of column selectors. Selectors can be used to select columns from the dataset. When selectors are undefined, configuration will be applied to all supported columns. 
    */
  var Selectors: js.UndefOr[ColumnSelectorList] = js.undefined
  
  /**
    * Configuration for evaluations. Statistics can be used to select evaluations and override parameters of evaluations. 
    */
  var Statistics: StatisticsConfiguration
}
object ColumnStatisticsConfiguration {
  
  inline def apply(Statistics: StatisticsConfiguration): ColumnStatisticsConfiguration = {
    val __obj = js.Dynamic.literal(Statistics = Statistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnStatisticsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnStatisticsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSelectors(value: ColumnSelectorList): Self = StObject.set(x, "Selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "Selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: ColumnSelector*): Self = StObject.set(x, "Selectors", js.Array(value*))
    
    inline def setStatistics(value: StatisticsConfiguration): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
  }
}
