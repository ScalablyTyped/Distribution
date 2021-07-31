package typings.antvComponent.typesMod

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueLegendCfg
  extends StObject
     with LegendBaseCfg {
  
  /**
    * 图例的颜色，可以写多个颜色
    * @type {number[]}
    */
  var colors: js.Array[Double]
  
  /**
    * 滑块的配置项
    * @type {ContinueLegendHandlerCfg}
    */
  var handler: ContinueLegendHandlerCfg
  
  /**
    * 文本的配置项
    * @type {ContinueLegendLabelCfg}
    */
  var label: ContinueLegendLabelCfg
  
  /**
    * 选择范围的最大值
    * @type {number}
    */
  var max: Double
  
  /**
    * 选择范围的最小值
    * @type {number}
    */
  var min: Double
  
  /**
    * 图例滑轨（背景）的配置项
    * @type {ContinueLegendRailCfg}
    */
  var rail: ContinueLegendRailCfg
  
  /**
    * 是否可以滑动
    * @type {boolean}
    */
  var slidable: Boolean
  
  /**
    * 选择范围的色块配置项
    * @type {ContinueLegendTrackCfg}
    */
  var track: ContinueLegendTrackCfg
  
  /**
    * 选择的值
    * @type {number[]}
    */
  var value: js.Array[Double]
}
object ContinueLegendCfg {
  
  @scala.inline
  def apply(
    colors: js.Array[Double],
    container: IGroup,
    handler: ContinueLegendHandlerCfg,
    label: ContinueLegendLabelCfg,
    max: Double,
    min: Double,
    rail: ContinueLegendRailCfg,
    slidable: Boolean,
    track: ContinueLegendTrackCfg,
    value: js.Array[Double]
  ): ContinueLegendCfg = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], rail = rail.asInstanceOf[js.Any], slidable = slidable.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueLegendCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendCfgMutableBuilder[Self <: ContinueLegendCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setHandler(value: ContinueLegendHandlerCfg): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ContinueLegendLabelCfg): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRail(value: ContinueLegendRailCfg): Self = StObject.set(x, "rail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidable(value: Boolean): Self = StObject.set(x, "slidable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: ContinueLegendTrackCfg): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Double*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
