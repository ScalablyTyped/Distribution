package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSeriesAxisDisplayOptions extends StObject {
  
  /**
    * The options that determine the presentation of the line series axis.
    */
  var AxisOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
  
  /**
    * The configuration options that determine how missing data is treated during the rendering of a line chart.
    */
  var MissingDataConfigurations: js.UndefOr[MissingDataConfigurationList] = js.undefined
}
object LineSeriesAxisDisplayOptions {
  
  inline def apply(): LineSeriesAxisDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesAxisDisplayOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSeriesAxisDisplayOptions] (val x: Self) extends AnyVal {
    
    inline def setAxisOptions(value: AxisDisplayOptions): Self = StObject.set(x, "AxisOptions", value.asInstanceOf[js.Any])
    
    inline def setAxisOptionsUndefined: Self = StObject.set(x, "AxisOptions", js.undefined)
    
    inline def setMissingDataConfigurations(value: MissingDataConfigurationList): Self = StObject.set(x, "MissingDataConfigurations", value.asInstanceOf[js.Any])
    
    inline def setMissingDataConfigurationsUndefined: Self = StObject.set(x, "MissingDataConfigurations", js.undefined)
    
    inline def setMissingDataConfigurationsVarargs(value: MissingDataConfiguration*): Self = StObject.set(x, "MissingDataConfigurations", js.Array(value*))
  }
}
