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
    
    @scala.inline
    def apply(): AdjustCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustCfg]
    }
    
    @scala.inline
    implicit class AdjustCfgMutableBuilder[Self <: AdjustCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      @scala.inline
      def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value :_*))
      
      @scala.inline
      def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      @scala.inline
      def setDodgeRatio(value: Double): Self = StObject.set(x, "dodgeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgeRatioUndefined: Self = StObject.set(x, "dodgeRatio", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      @scala.inline
      def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXFieldUndefined: Self = StObject.set(x, "xField", js.undefined)
      
      @scala.inline
      def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  type Data = StringDictionary[js.Any]
  
  trait DodgeCfg extends StObject {
    
    val adjustNames: js.UndefOr[js.Array[String]] = js.undefined
    
    val columnWidthRatio: js.UndefOr[Double] = js.undefined
    
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
    
    @scala.inline
    def apply(xField: String): DodgeCfg = {
      val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
      __obj.asInstanceOf[DodgeCfg]
    }
    
    @scala.inline
    implicit class DodgeCfgMutableBuilder[Self <: DodgeCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      @scala.inline
      def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value :_*))
      
      @scala.inline
      def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      @scala.inline
      def setDefaultSize(value: Double): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      @scala.inline
      def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      @scala.inline
      def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
      
      @scala.inline
      def setDodgeRatio(value: Double): Self = StObject.set(x, "dodgeRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgeRatioUndefined: Self = StObject.set(x, "dodgeRatio", js.undefined)
      
      @scala.inline
      def setGroupNum(value: Double): Self = StObject.set(x, "groupNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNumUndefined: Self = StObject.set(x, "groupNum", js.undefined)
      
      @scala.inline
      def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
      
      @scala.inline
      def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      @scala.inline
      def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      @scala.inline
      def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      @scala.inline
      def setXDimensionLength(value: Double): Self = StObject.set(x, "xDimensionLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXDimensionLengthUndefined: Self = StObject.set(x, "xDimensionLength", js.undefined)
      
      @scala.inline
      def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
  
  trait Range extends StObject {
    
    var next: Double
    
    var pre: Double
  }
  object Range {
    
    @scala.inline
    def apply(next: Double, pre: Double): Range = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre(value: Double): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(xField: String): StackCfg = {
      val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackCfg]
    }
    
    @scala.inline
    implicit class StackCfgMutableBuilder[Self <: StackCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustNames(value: js.Array[String]): Self = StObject.set(x, "adjustNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustNamesUndefined: Self = StObject.set(x, "adjustNames", js.undefined)
      
      @scala.inline
      def setAdjustNamesVarargs(value: String*): Self = StObject.set(x, "adjustNames", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setReverseOrder(value: Boolean): Self = StObject.set(x, "reverseOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseOrderUndefined: Self = StObject.set(x, "reverseOrder", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
    }
  }
}
