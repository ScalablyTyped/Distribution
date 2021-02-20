package typings.antvAdjust

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.antvAdjust.interfaceMod.AdjustCfg
import typings.antvAdjust.interfaceMod.Data
import typings.antvAdjust.interfaceMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjustMod {
  
  @JSImport("@antv/adjust/lib/adjusts/adjust", JSImport.Default)
  @js.native
  abstract class default protected () extends Adjust {
    def this(cfg: AdjustCfg) = this()
  }
  
  @js.native
  trait Adjust extends StObject {
    
    /* protected */ def adjustData(groupedDataArray: js.Array[js.Array[Data]], mergedData: js.Array[Data]): Unit = js.native
    
    /** @override */
    /* protected */ def adjustDim(dim: String, values: js.Array[Double], data: js.Array[Data]): Unit = js.native
    /* protected */ def adjustDim(dim: String, values: js.Array[Double], data: js.Array[Data], index: Double): Unit = js.native
    
    /** 参与调整的维度 */
    var adjustNames: js.Array[String] = js.native
    
    /** 宽度比例 */
    var columnWidthRatio: Double = js.native
    
    /** 用户配置宽度 */
    var defaultSize: Double = js.native
    
    /** 指定进行 dodge 的字段 */
    var dodgeBy: String = js.native
    
    /** 像素级组内间距 */
    var dodgePadding: Double = js.native
    
    /** 调整占单位宽度的比例，例如：占 2 个分类间距的 1 / 2 */
    var dodgeRatio: Double = js.native
    
    /* protected */ def getAdjustRange(dim: String, dimValue: Double, values: js.Array[Double]): Range = js.native
    
    /**
      * 获取可调整度量对应的值
      * @param mergedData 数据
      * @return 值的映射
      */
    var getDimValues: js.Any = js.native
    
    /**
      * 对数据进行分组adjustData
      * @param data 数据
      * @param dim 分组的字段
      * @return 分组结果
      */
    /* protected */ def groupData(data: js.Array[Data], dim: String): StringDictionary[js.Array[Data]] = js.native
    
    /** 分组数 */
    var groupNum: Double = js.native
    
    var height: Double = js.native
    
    /** 像素级组间距 */
    var intervalPadding: Double = js.native
    
    /**
      * 查看维度是否是 adjust 字段
      * @param dim
      */
    def isAdjust(dim: String): Boolean = js.native
    
    /** 调整过程中 2 个数据的间距，以 dodgeRatio 为分母 */
    var marginRatio: Double = js.native
    
    /** 最大宽度约束 */
    var maxColumnWidth: Double = js.native
    
    /** 最小宽度约束 */
    var minColumnWidth: Double = js.native
    
    def process(dataArray: js.Array[js.Array[Data]]): js.Array[js.Array[Data]] = js.native
    
    var reverseOrder: Boolean = js.native
    
    var size: Double = js.native
    
    /** x维度长度，计算归一化padding使用 */
    var xDimensionLegenth: Double = js.native
    
    /** x 维度对应的字段 */
    var xField: String = js.native
    
    /** y 维度对应的字段 */
    var yField: String = js.native
  }
  
  type AdjustConstructor = Instantiable1[/* cfg */ js.Any, Adjust]
  
  type DimValuesMapType = StringDictionary[js.Array[Double]]
}
