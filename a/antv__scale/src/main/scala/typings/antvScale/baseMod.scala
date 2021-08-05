package typings.antvScale

import typings.antvScale.typesMod.ScaleConfig
import typings.antvScale.typesMod.Tick
import typings.antvScale.typesMod.TickMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("@antv/scale/lib/base", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  @js.native
  trait Scale extends StObject {
    
    /* protected */ var __cfg__ : ScaleConfig = js.native
    
    var alias: js.UndefOr[String] = js.native
    
    /** 定义域转 0~1 */
    /* protected */ def calcPercent(value: js.Any, min: Double, max: Double): Double = js.native
    
    /** 0~1转定义域 */
    /* protected */ def calcValue(percent: Double, min: Double, max: Double): Double = js.native
    
    /* protected */ def calculateTicks(): js.Array[js.Any] = js.native
    
    /** 重新初始化 */
    def change(cfg: ScaleConfig): Unit = js.native
    
    var field: js.UndefOr[String] = js.native
    
    var formatter: js.UndefOr[js.Function2[/* v */ js.Any, /* k */ js.UndefOr[Double], js.Any]] = js.native
    
    /* protected */ def getConfig(key: js.Any): js.Any = js.native
    
    /** 获取Tick的格式化结果 */
    def getText(value: js.Any): String = js.native
    def getText(value: js.Any, key: Double): String = js.native
    
    /** 获取坐标轴需要的ticks */
    def getTicks(): js.Array[Tick] = js.native
    
    /* protected */ def init(): Unit = js.native
    
    /* protected */ def initCfg(): Unit = js.native
    
    /** 将值域转换为定义域 */
    def invert(scaled: Double): js.Any = js.native
    
    /**
      * 是否分类类型的度量
      */
    var isCategory: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否连续类型的度量，linear,time,log, pow, quantile, quantize 都支持
      */
    var isContinuous: js.UndefOr[Boolean] = js.native
    
    /**
      * 是否是常量的度量，传入和传出一致
      */
    var isIdentity: Boolean = js.native
    
    /**
      * 是否线性度量，有linear, time 度量
      */
    var isLinear: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[js.Any] = js.native
    
    var maxLimit: js.UndefOr[js.Any] = js.native
    
    var min: js.UndefOr[js.Any] = js.native
    
    var minLimit: js.UndefOr[js.Any] = js.native
    
    var range: js.UndefOr[js.Array[Double]] = js.native
    
    /* protected */ def rangeMax(): js.Any = js.native
    
    /* protected */ def rangeMin(): js.Any = js.native
    
    /** 将定义域转换为值域 */
    def scale(value: js.Any): Double = js.native
    
    /* protected */ def setDomain(): Unit = js.native
    
    var tickCount: js.UndefOr[Double] = js.native
    
    var tickInterval: js.UndefOr[Double] = js.native
    
    var tickMethod: js.UndefOr[String | TickMethod] = js.native
    
    var ticks: js.UndefOr[js.Array[js.Any]] = js.native
    
    def translate(v: js.Any): js.Any = js.native
    
    /**
      * 度量的类型
      */
    var `type`: String = js.native
    
    var values: js.UndefOr[js.Array[js.Any]] = js.native
  }
}
