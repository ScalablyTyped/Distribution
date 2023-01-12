package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  var geometryOption: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption
  
  var legend: typings.antvG2plot.libTypesLegendMod.Legend
  
  var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  
  var yField: String
}
object Legend {
  
  inline def apply(
    geometryOption: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption,
    legend: typings.antvG2plot.libTypesLegendMod.Legend,
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    yField: String
  ): Legend = {
    val __obj = js.Dynamic.literal(geometryOption = geometryOption.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
    
    inline def setGeometryOption(value: typings.antvG2plot.libPlotsDualAxesTypesMod.GeometryOption): Self = StObject.set(x, "geometryOption", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: typings.antvG2plot.libTypesLegendMod.Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setView(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
  }
}
