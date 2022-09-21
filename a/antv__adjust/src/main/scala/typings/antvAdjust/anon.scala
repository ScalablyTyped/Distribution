package typings.antvAdjust

import typings.antvAdjust.adjustMod.DimValuesMapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @antv/adjust.@antv/adjust/lib/interface.AdjustCfg & {  dimValuesMap :@antv/adjust.@antv/adjust/lib/adjusts/adjust.DimValuesMapType | undefined} */
  trait AdjustCfgdimValuesMapDimV extends StObject {
    
    val adjustNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var dimValuesMap: js.UndefOr[DimValuesMapType] = js.undefined
    
    val dodgeBy: js.UndefOr[String] = js.undefined
    
    val dodgeRatio: js.UndefOr[Double] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val marginRatio: js.UndefOr[Double] = js.undefined
    
    val reverseOrder: js.UndefOr[Boolean] = js.undefined
    
    val size: js.UndefOr[Double] = js.undefined
    
    val xField: js.UndefOr[String] = js.undefined
    
    val yField: js.UndefOr[String] = js.undefined
  }
  object AdjustCfgdimValuesMapDimV {
    
    inline def apply(): AdjustCfgdimValuesMapDimV = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustCfgdimValuesMapDimV]
    }
    
    extension [Self <: AdjustCfgdimValuesMapDimV](x: Self) {
      
      inline def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      inline def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      inline def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value*))
      
      inline def setDimValuesMap(value: DimValuesMapType): Self = StObject.set(x, "dimValuesMap", value.asInstanceOf[js.Any])
      
      inline def setDimValuesMapUndefined: Self = StObject.set(x, "dimValuesMap", js.undefined)
      
      inline def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      inline def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      inline def setDodgeRatio(value: Double): Self = StObject.set(x, "dodgeRatio", value.asInstanceOf[js.Any])
      
      inline def setDodgeRatioUndefined: Self = StObject.set(x, "dodgeRatio", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
      
      inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
}
