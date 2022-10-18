package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryOption extends StObject {
  
  var geometryOption: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption
  
  var xField: String
  
  var yField: String
}
object GeometryOption {
  
  inline def apply(
    geometryOption: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption,
    xField: String,
    yField: String
  ): GeometryOption = {
    val __obj = js.Dynamic.literal(geometryOption = geometryOption.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryOption]
  }
  
  extension [Self <: GeometryOption](x: Self) {
    
    inline def setGeometryOption(value: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption): Self = StObject.set(x, "geometryOption", value.asInstanceOf[js.Any])
    
    inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
  }
}
