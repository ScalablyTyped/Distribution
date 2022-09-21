package typings.antvAdjust

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait AdjustCfg extends StObject {
    
    val adjustNames: js.UndefOr[js.Array[String]] = js.undefined
    
    val dodgeBy: js.UndefOr[String] = js.undefined
    
    val dodgeRatio: js.UndefOr[Double] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val marginRatio: js.UndefOr[Double] = js.undefined
    
    val reverseOrder: js.UndefOr[Boolean] = js.undefined
    
    val size: js.UndefOr[Double] = js.undefined
    
    val xField: js.UndefOr[String] = js.undefined
    
    val yField: js.UndefOr[String] = js.undefined
  }
  object AdjustCfg {
    
    inline def apply(): AdjustCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustCfg]
    }
    
    extension [Self <: AdjustCfg](x: Self) {
      
      inline def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      inline def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      inline def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value*))
      
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
  
  type Data = StringDictionary[Any]
  
  trait DodgeCfg extends StObject {
    
    val adjustNames: js.UndefOr[js.Array[String]] = js.undefined
    
    val columnWidthRatio: js.UndefOr[Double] = js.undefined
    
    val customOffset: js.UndefOr[(js.Function2[/* data */ Any, /* range */ Any, Double]) | Double] = js.undefined
    
    val defaultSize: js.UndefOr[Double] = js.undefined
    
    val dodgeBy: js.UndefOr[String] = js.undefined
    
    val dodgePadding: js.UndefOr[Double] = js.undefined
    
    val dodgeRatio: js.UndefOr[Double] = js.undefined
    
    val groupNum: js.UndefOr[Double] = js.undefined
    
    val intervalPadding: js.UndefOr[Double] = js.undefined
    
    val marginRatio: js.UndefOr[Double] = js.undefined
    
    val maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    val minColumnWidth: js.UndefOr[Double] = js.undefined
    
    val xDimensionLength: js.UndefOr[Double] = js.undefined
    
    val xField: String
    
    val yField: js.UndefOr[String] = js.undefined
  }
  object DodgeCfg {
    
    inline def apply(xField: String): DodgeCfg = {
      val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
      __obj.asInstanceOf[DodgeCfg]
    }
    
    extension [Self <: DodgeCfg](x: Self) {
      
      inline def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      inline def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      inline def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value*))
      
      inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      inline def setCustomOffset(value: (js.Function2[/* data */ Any, /* range */ Any, Double]) | Double): Self = StObject.set(x, "customOffset", value.asInstanceOf[js.Any])
      
      inline def setCustomOffsetFunction2(value: (/* data */ Any, /* range */ Any) => Double): Self = StObject.set(x, "customOffset", js.Any.fromFunction2(value))
      
      inline def setCustomOffsetUndefined: Self = StObject.set(x, "customOffset", js.undefined)
      
      inline def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      inline def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      inline def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
      
      inline def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
      
      inline def setDodgeRatio(value: Double): Self = StObject.set(x, "dodgeRatio", value.asInstanceOf[js.Any])
      
      inline def setDodgeRatioUndefined: Self = StObject.set(x, "dodgeRatio", js.undefined)
      
      inline def setGroupNum(value: Double): Self = StObject.set(x, "groupNum", value.asInstanceOf[js.Any])
      
      inline def setGroupNumUndefined: Self = StObject.set(x, "groupNum", js.undefined)
      
      inline def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
      
      inline def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      inline def setXDimensionLength(value: Double): Self = StObject.set(x, "xDimensionLength", value.asInstanceOf[js.Any])
      
      inline def setXDimensionLengthUndefined: Self = StObject.set(x, "xDimensionLength", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var next: Double
    
    var pre: Double
  }
  object Range {
    
    inline def apply(next: Double, pre: Double): Range = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    extension [Self <: Range](x: Self) {
      
      inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPre(value: Double): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
    }
  }
  
  trait StackCfg extends StObject {
    
    val adjustNames: js.UndefOr[js.Array[String]] = js.undefined
    
    val height: js.UndefOr[Double] = js.undefined
    
    val reverseOrder: js.UndefOr[Boolean] = js.undefined
    
    val size: js.UndefOr[Double] = js.undefined
    
    val xField: String
    
    val yField: js.UndefOr[String] = js.undefined
  }
  object StackCfg {
    
    inline def apply(xField: String): StackCfg = {
      val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackCfg]
    }
    
    extension [Self <: StackCfg](x: Self) {
      
      inline def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      inline def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      inline def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
      
      inline def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
}
