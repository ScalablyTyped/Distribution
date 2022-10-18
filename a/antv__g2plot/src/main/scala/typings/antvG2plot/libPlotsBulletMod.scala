package typings.antvG2plot

import typings.antvG2plot.anon.PartialBulletOptions
import typings.antvG2plot.libCorePlotMod.Plot
import typings.antvG2plot.libPlotsBulletTypesMod.BulletOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBulletMod {
  
  @JSImport("@antv/g2plot/lib/plots/bullet", "Bullet")
  @js.native
  open class Bullet protected () extends Plot[BulletOptions] {
    def this(container: String, options: BulletOptions) = this()
    def this(container: HTMLElement, options: BulletOptions) = this()
  }
  /* static members */
  object Bullet {
    
    @JSImport("@antv/g2plot/lib/plots/bullet", "Bullet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 获取 子弹图 默认配置项
      * 供外部使用
      */
    inline def getDefaultOptions(): PartialBulletOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBulletOptions]
  }
}
