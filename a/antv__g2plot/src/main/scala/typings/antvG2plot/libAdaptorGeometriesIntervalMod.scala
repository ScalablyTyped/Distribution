package typings.antvG2plot

import typings.antvG2plot.anon.Style
import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesIntervalMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interval[O /* <: IntervalGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait IntervalGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** 柱子的背景样式设置 */
    val columnBackground: js.UndefOr[Style] = js.undefined
    
    /** 分组中柱子之间的组内间距(像素级)，仅对分组柱状图适用 */
    val dodgePadding: js.UndefOr[Double] = js.undefined
    
    /** 分组字段，优先级高于 seriesField , isGroup: true 时会根据 groupField 进行分组。*/
    val groupField: js.UndefOr[String] = js.undefined
    
    /** 柱子视觉通道配置（含 color、shape、size、style、tooltip） */
    val interval: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组间柱子之间的组间间距(像素级)，仅对分组柱状图适用 */
    val intervalPadding: js.UndefOr[Double] = js.undefined
    
    /** 是否分组柱形图 */
    val isGroup: js.UndefOr[Boolean] = js.undefined
    
    /** 是否堆积柱状图 */
    val isStack: js.UndefOr[Boolean] = js.undefined
    
    /** 分组中柱子之间的间距 [0-1]，仅对分组柱状图适用 */
    val marginRatio: js.UndefOr[Double] = js.undefined
    
    /** 柱状图最大宽度（像素） */
    val maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    /** 柱状图最小宽度（像素） */
    val minColumnWidth: js.UndefOr[Double] = js.undefined
    
    /** 拆分字段，在分组柱状图下同 groupField、colorField，在堆积柱状图下同 stackField、colorField  */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /** 柱状图宽度占比 [0-1] */
    val widthRatio: js.UndefOr[Double] = js.undefined
    
    /** x 轴字段 */
    @JSName("xField")
    val xField_IntervalGeometryOptions: String
    
    /** y 轴字段 */
    @JSName("yField")
    val yField_IntervalGeometryOptions: String
  }
  object IntervalGeometryOptions {
    
    inline def apply(xField: String, yField: String): IntervalGeometryOptions = {
      val __obj = js.Dynamic.literal(xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntervalGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setColumnBackground(value: Style): Self = StObject.set(x, "columnBackground", value.asInstanceOf[js.Any])
      
      inline def setColumnBackgroundUndefined: Self = StObject.set(x, "columnBackground", js.undefined)
      
      inline def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
      
      inline def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setInterval(value: MappingOptions): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
      
      inline def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
      
      inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setWidthRatio(value: Double): Self = StObject.set(x, "widthRatio", value.asInstanceOf[js.Any])
      
      inline def setWidthRatioUndefined: Self = StObject.set(x, "widthRatio", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
