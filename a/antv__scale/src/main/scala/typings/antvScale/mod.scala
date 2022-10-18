package typings.antvScale

import typings.antvScale.libTypesMod.BandOptions
import typings.antvScale.libTypesMod.BaseOptions
import typings.antvScale.libTypesMod.ConstantOptions
import typings.antvScale.libTypesMod.ContinuousOptions
import typings.antvScale.libTypesMod.DivergingOptions
import typings.antvScale.libTypesMod.IdentityOptions
import typings.antvScale.libTypesMod.Interpolate
import typings.antvScale.libTypesMod.LinearOptions
import typings.antvScale.libTypesMod.LogOptions
import typings.antvScale.libTypesMod.OrdinalOptions
import typings.antvScale.libTypesMod.PointOptions
import typings.antvScale.libTypesMod.PowOptions
import typings.antvScale.libTypesMod.QuantileOptions
import typings.antvScale.libTypesMod.QuantizeOptions
import typings.antvScale.libTypesMod.SequentialOptions
import typings.antvScale.libTypesMod.SqrtOptions
import typings.antvScale.libTypesMod.ThresholdOptions
import typings.antvScale.libTypesMod.TickMethod
import typings.antvScale.libTypesMod.TimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/scale", "Band")
  @js.native
  open class Band[O /* <: BandOptions */] ()
    extends typings.antvScale.libScalesBandMod.Band[O] {
    def this(options: BandOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/scale", "Base")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Base[O /* <: BaseOptions */] ()
    extends typings.antvScale.libScalesBaseMod.Base[O] {
    def this(options: O) = this()
  }
  
  @JSImport("@antv/scale", "Constant")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Constant ()
    extends typings.antvScale.libScalesConstantMod.Constant {
    def this(options: ConstantOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/scale", "Continuous")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Continuous[O /* <: ContinuousOptions */] ()
    extends typings.antvScale.libScalesContinuousMod.Continuous[O] {
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
    extends typings.antvScale.libScalesDivergingMod.Diverging {
    def this(options: DivergingOptions) = this()
  }
  
  @JSImport("@antv/scale", "Identity")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Identity ()
    extends typings.antvScale.libScalesIdentityMod.Identity {
    def this(options: IdentityOptions) = this()
  }
  
  @JSImport("@antv/scale", "Linear")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Linear ()
    extends typings.antvScale.libScalesLinearMod.Linear {
    def this(options: LinearOptions) = this()
  }
  
  @JSImport("@antv/scale", "Log")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Log ()
    extends typings.antvScale.libScalesLogMod.Log {
    def this(options: LogOptions) = this()
  }
  
  @JSImport("@antv/scale", "Ordinal")
  @js.native
  open class Ordinal[O /* <: OrdinalOptions */] ()
    extends typings.antvScale.libScalesOrdinalMod.Ordinal[O] {
    def this(options: OrdinalOptions) = this()
  }
  
  @JSImport("@antv/scale", "Point")
  @js.native
  open class Point ()
    extends typings.antvScale.libScalesPointMod.Point {
    def this(options: PointOptions) = this()
  }
  
  @JSImport("@antv/scale", "Pow")
  @js.native
  open class Pow[O /* <: PowOptions */] ()
    extends typings.antvScale.libScalesPowMod.Pow[O] {
    def this(options: PowOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantile")
  @js.native
  open class Quantile ()
    extends typings.antvScale.libScalesQuantileMod.Quantile {
    def this(options: QuantileOptions) = this()
  }
  
  @JSImport("@antv/scale", "Quantize")
  @js.native
  open class Quantize ()
    extends typings.antvScale.libScalesQuantizeMod.Quantize {
    def this(options: QuantizeOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sequential")
  @js.native
  open class Sequential ()
    extends typings.antvScale.libScalesSequentialMod.Sequential {
    def this(options: SequentialOptions) = this()
  }
  
  @JSImport("@antv/scale", "Sqrt")
  @js.native
  open class Sqrt ()
    extends typings.antvScale.libScalesSqrtMod.Sqrt {
    def this(options: SqrtOptions) = this()
  }
  
  @JSImport("@antv/scale", "Threshold")
  @js.native
  open class Threshold[O /* <: ThresholdOptions */] ()
    extends typings.antvScale.libScalesThresholdMod.Threshold[O] {
    def this(options: ThresholdOptions) = this()
  }
  
  @JSImport("@antv/scale", "Time")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Time ()
    extends typings.antvScale.libScalesTimeMod.Time {
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
