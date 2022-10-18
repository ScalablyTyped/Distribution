package typings.antvG2plot

import typings.antvG2plot.anon.PartialLiquidOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsLiquidTypesMod.LiquidOptions
import typings.antvG2plot.libTypesAnimationMod.Animation
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvGBase.libInterfacesMod.IGroup
import typings.antvGBase.libInterfacesMod.IShape
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLiquidMod {
  
  @JSImport("@antv/g2plot/lib/plots/liquid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot/lib/plots/liquid", "Liquid")
  @js.native
  open class Liquid protected () extends Plot[LiquidOptions] {
    def this(container: String, options: LiquidOptions) = this()
    def this(container: HTMLElement, options: LiquidOptions) = this()
    
    /**
      * 更新数据
      * @param percent
      */
    def changeData(percent: Double): Unit = js.native
  }
  /* static members */
  object Liquid {
    
    @JSImport("@antv/g2plot/lib/plots/liquid", "Liquid")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 饼图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialLiquidOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialLiquidOptions]
  }
  
  inline def addWaterWave(
    x: Double,
    y: Double,
    level: Double,
    waveCount: Double,
    waveAttrs: ShapeStyle,
    group: IGroup,
    clip: IShape,
    radius: Double,
    waveLength: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addWaterWave(
    x: Double,
    y: Double,
    level: Double,
    waveCount: Double,
    waveAttrs: ShapeStyle,
    group: IGroup,
    clip: IShape,
    radius: Double,
    waveLength: Double,
    animation: Animation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addWaterWave")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any], waveCount.asInstanceOf[js.Any], waveAttrs.asInstanceOf[js.Any], group.asInstanceOf[js.Any], clip.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], waveLength.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
