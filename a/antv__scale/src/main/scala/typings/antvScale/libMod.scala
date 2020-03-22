package typings.antvScale

import typings.antvScale.libBaseMod.default
import typings.antvScale.libFactoryMod.ScaleConstructor
import typings.antvScale.libTypesMod.ScaleConfig
import typings.antvScale.libTypesMod.TickMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  /**
    * 分类度量
    * @class
    */
  @js.native
  class Category ()
    extends typings.antvScale.libCategoryBaseMod.Category
  
  @js.native
  class Identity ()
    extends typings.antvScale.libIdentityMod.Identity
  
  @js.native
  class Linear ()
    extends typings.antvScale.continuousLinearMod.Linear
  
  /**
    * Log 度量，处理非均匀分布
    */
  @js.native
  class Log ()
    extends typings.antvScale.continuousLogMod.Log
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @js.native
  class Pow ()
    extends typings.antvScale.continuousPowMod.Pow
  
  @js.native
  class Quantile ()
    extends typings.antvScale.continuousQuantileMod.Quantile
  
  /**
    * 分段度量
    */
  @js.native
  class Quantize ()
    extends typings.antvScale.continuousQuantizeMod.Quantize
  
  @js.native
  abstract class Scale protected () extends default {
    def this(cfg: ScaleConfig) = this()
  }
  
  /**
    * 时间度量
    * @class
    */
  @js.native
  class Time ()
    extends typings.antvScale.libContinuousTimeMod.Time
  
  /**
    * 时间分类度量
    * @class
    */
  @js.native
  class TimeCat ()
    extends typings.antvScale.categoryTimeMod.TimeCat
  
  def getScale(key: String): ScaleConstructor[default] = js.native
  def getTickMethod(key: String): TickMethod = js.native
  def registerScale(key: String, cls: ScaleConstructor[default]): Unit = js.native
}

