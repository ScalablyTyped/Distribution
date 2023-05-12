package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DonutOptions extends StObject {
  
  /**
    * The option for define the arc of the chart shape. Valid values are as follows:    WHOLE - A pie chart    SMALL- A small-sized donut chart    MEDIUM- A medium-sized donut chart    LARGE- A large-sized donut chart  
    */
  var ArcOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ArcOptions] = js.undefined
  
  /**
    * The label options of the label that is displayed in the center of a donut chart. This option isn't available for pie charts.
    */
  var DonutCenterOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DonutCenterOptions] = js.undefined
}
object DonutOptions {
  
  inline def apply(): DonutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DonutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DonutOptions] (val x: Self) extends AnyVal {
    
    inline def setArcOptions(value: ArcOptions): Self = StObject.set(x, "ArcOptions", value.asInstanceOf[js.Any])
    
    inline def setArcOptionsUndefined: Self = StObject.set(x, "ArcOptions", js.undefined)
    
    inline def setDonutCenterOptions(value: DonutCenterOptions): Self = StObject.set(x, "DonutCenterOptions", value.asInstanceOf[js.Any])
    
    inline def setDonutCenterOptionsUndefined: Self = StObject.set(x, "DonutCenterOptions", js.undefined)
  }
}
