package typings.antvScale

import typings.antvScale.typesMod.BandOptions
import typings.antvScale.typesMod.BaseOptions
import typings.antvScale.typesMod.ConstantOptions
import typings.antvScale.typesMod.ContinuousOptions
import typings.antvScale.typesMod.DivergingOptions
import typings.antvScale.typesMod.IdentityOptions
import typings.antvScale.typesMod.Interpolate
import typings.antvScale.typesMod.LinearOptions
import typings.antvScale.typesMod.LogOptions
import typings.antvScale.typesMod.OrdinalOptions
import typings.antvScale.typesMod.PointOptions
import typings.antvScale.typesMod.PowOptions
import typings.antvScale.typesMod.QuantileOptions
import typings.antvScale.typesMod.QuantizeOptions
import typings.antvScale.typesMod.SequentialOptions
import typings.antvScale.typesMod.SqrtOptions
import typings.antvScale.typesMod.ThresholdOptions
import typings.antvScale.typesMod.TickMethod
import typings.antvScale.typesMod.TimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/scale", "Band")
  @js.native
  open class Band[O /* <: BandOptions */] ()
    extends typings.antvScale.bandMod.Band[O] {
    def this(options: BandOptions) = this()
  }
  
  @JSImport("@antv/scale", "Base")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  abstract class Base[O /* <: BaseOptions */] ()
    extends typings.antvScale.baseMod.Base[O] {
    def this(options: O) = this()
  }
  
  @JSImport("@antv/scale", "Constant")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Constant ()
    extends typings.antvScale.constantMod.Constant {
    def this(options: ConstantOptions) = this()
  }
  
  @JSImport("@antv/scale", "Continuous")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  abstract class Continuous[O /* <: ContinuousOptions */] ()
    extends typings.antvScale.continuousMod.Continuous[O] {
    def this(options: O) = this()
  }
  
  @JSImport("@antv/scale", "DURATION_DAY")
  @js.native
  val DURATION_DAY: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_HOUR")
  @js.native
  val DURATION_HOUR: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_MINUTE")
  @js.native
  val DURATION_MINUTE: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_MONTH")
  @js.native
  val DURATION_MONTH: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_SECOND")
  @js.native
  val DURATION_SECOND: /* 1000 */ Double = js.native
  
  @JSImport("@antv/scale", "DURATION_WEEK")
  @js.native
  val DURATION_WEEK: Double = js.native
  
  @JSImport("@antv/scale", "DURATION_YEAR")
  @js.native
  val DURATION_YEAR: Double = js.native
  
  @JSImport("@antv/scale", "Diverging")
  @js.native
  open class Diverging ()
    extends typings.antvScale.divergingMod.Diverging {
    def this(options: DivergingOptions) = this()
  }
  
  @JSImport("@antv/scale", "Identity")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Identity ()
    extends typings.antvScale.identityMod.Identity {
    def this(options: IdentityOptions) = this()
  }
  
  @JSImport("@antv/scale", "Linear")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Linear ()
    extends typings.antvScale.linearMod.Linear {
    def this(options: LinearOptions) = this()
  }
  
  @JSImport("@antv/scale", "Log")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Log ()
    extends typings.antvScale.logMod.Log {
    def this(options: LogOptions) = this()
  }
  
  @JSImport("@antv/scale", "Ordinal")
  @js.native
  open class Ordinal[O /* <: OrdinalOptions */] ()
    extends typings.antvScale.ordinalMod.Ordinal[O] {
    def this(options: OrdinalOptions) = this()
  }
  
  @JSImport("@antv/scale", "Point")
  @js.native
  open class Point ()
    extends typings.antvScale.pointMod.Point {
    def this(options: PointOptions) = this()
  }
  
  @JSImport("@antv/scale", "Pow")
  @js.native
  open class Pow[O /* <: PowOptions */] ()
    extends typings.antvScale.powMod.Pow[O] {
    def this(options: PowOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantile")
  @js.native
  open class Quantile ()
    extends typings.antvScale.quantileMod.Quantile {
    def this(options: QuantileOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantize")
  @js.native
  open class Quantize ()
    extends typings.antvScale.quantizeMod.Quantize {
    def this(options: QuantizeOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sequential")
  @js.native
  open class Sequential ()
    extends typings.antvScale.sequentialMod.Sequential {
    def this(options: SequentialOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sqrt")
  @js.native
  open class Sqrt ()
    extends typings.antvScale.sqrtMod.Sqrt {
    def this(options: SqrtOptions) = this()
  }
  
  @JSImport("@antv/scale", "Threshold")
  @js.native
  open class Threshold[O /* <: ThresholdOptions */] ()
    extends typings.antvScale.thresholdMod.Threshold[O] {
    def this(options: ThresholdOptions) = this()
  }
  
  @JSImport("@antv/scale", "Time")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Time ()
    extends typings.antvScale.timeMod.Time {
    def this(options: TimeOptions) = this()
  }
  
  @JSImport("@antv/scale", "createInterpolateColor")
  @js.native
  val createInterpolateColor: Interpolate[String] = js.native
  
  @JSImport("@antv/scale", "createInterpolateNumber")
  @js.native
  val createInterpolateNumber: Interpolate[Double] = js.native
  
  @JSImport("@antv/scale", "createInterpolateValue")
  @js.native
  val createInterpolateValue: Interpolate[Double | String] = js.native
  
  @JSImport("@antv/scale", "d3Log")
  @js.native
  val d3Log: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "d3Ticks")
  @js.native
  val d3Ticks: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "d3Time")
  @js.native
  val d3Time: TickMethod[js.Date] = js.native
  
  @JSImport("@antv/scale", "rPretty")
  @js.native
  val rPretty: TickMethod[Double] = js.native
  
  @JSImport("@antv/scale", "wilkinsonExtended")
  @js.native
  val wilkinsonExtended: TickMethod[Double] = js.native
}
