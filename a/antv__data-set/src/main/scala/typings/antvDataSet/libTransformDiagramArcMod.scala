package typings.antvDataSet

import typings.antvDataSet.antvDataSetStrings.frequency
import typings.antvDataSet.antvDataSetStrings.id
import typings.antvDataSet.antvDataSetStrings.weigth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformDiagramArcMod {
  
  trait Options extends StObject {
    
    var id: js.UndefOr[js.Function1[/* node */ Any, Any]] = js.undefined
    
    var marginRatio: js.UndefOr[Double] = js.undefined
    
    var sortBy: js.UndefOr[
        id | weigth | frequency | Null | (js.Function2[/* a */ Any, /* b */ Any, Double])
      ] = js.undefined
    
    var source: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var sourceWeight: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    var target: js.UndefOr[js.Function1[/* edge */ Any, Any]] = js.undefined
    
    var targetWeight: js.UndefOr[js.Function1[/* edge */ Any, Double]] = js.undefined
    
    var thickness: js.UndefOr[Double] = js.undefined
    
    var weight: js.UndefOr[Boolean] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setId(value: /* node */ Any => Any): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setSortBy(value: id | weigth | frequency | (js.Function2[/* a */ Any, /* b */ Any, Double])): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
      
      inline def setSortByFunction2(value: (/* a */ Any, /* b */ Any) => Double): Self = StObject.set(x, "sortBy", js.Any.fromFunction2(value))
      
      inline def setSortByNull: Self = StObject.set(x, "sortBy", null)
      
      inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
      
      inline def setSource(value: /* edge */ Any => Any): Self = StObject.set(x, "source", js.Any.fromFunction1(value))
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceWeight(value: /* edge */ Any => Double): Self = StObject.set(x, "sourceWeight", js.Any.fromFunction1(value))
      
      inline def setSourceWeightUndefined: Self = StObject.set(x, "sourceWeight", js.undefined)
      
      inline def setTarget(value: /* edge */ Any => Any): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetWeight(value: /* edge */ Any => Double): Self = StObject.set(x, "targetWeight", js.Any.fromFunction1(value))
      
      inline def setTargetWeightUndefined: Self = StObject.set(x, "targetWeight", js.undefined)
      
      inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setWeight(value: Boolean): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
