package typings.antvG2plot.anon

import typings.antvG2plot.annotationMod.Annotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/pie/types.PieOptions, 'annotations' | 'statistic'> */
trait PickPieOptionsannotations extends StObject {
  
  var annotations: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  var statistic: js.UndefOr[typings.antvG2plot.statisticMod.Statistic] = js.undefined
}
object PickPieOptionsannotations {
  
  inline def apply(): PickPieOptionsannotations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPieOptionsannotations]
  }
  
  extension [Self <: PickPieOptionsannotations](x: Self) {
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setStatistic(value: typings.antvG2plot.statisticMod.Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
  }
}
