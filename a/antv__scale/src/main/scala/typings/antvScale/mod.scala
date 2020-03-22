package typings.antvScale

import typings.antvScale.baseMod.default
import typings.antvScale.factoryMod.ScaleConstructor
import typings.antvScale.typesMod.ScaleConfig
import typings.antvScale.typesMod.TickMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * 分类度量
    * @class
    */
  @js.native
  class Category ()
    extends typings.antvScale.categoryBaseMod.Category
  
  @js.native
  class Identity ()
    extends typings.antvScale.identityMod.Identity
  
  @js.native
  class Linear ()
    extends typings.antvScale.linearMod.Linear
  
  /**
    * Log 度量，处理非均匀分布
    */
  @js.native
  class Log ()
    extends typings.antvScale.logMod.Log
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @js.native
  class Pow ()
    extends typings.antvScale.powMod.Pow
  
  @js.native
  class Quantile ()
    extends typings.antvScale.quantileMod.Quantile
  
  /**
    * 分段度量
    */
  @js.native
  class Quantize ()
    extends typings.antvScale.quantizeMod.Quantize
  
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
    extends typings.antvScale.continuousTimeMod.Time
  
  /**
    * 时间分类度量
    * @class
    */
  @js.native
  class TimeCat ()
    extends typings.antvScale.timeMod.TimeCat
  
  def getScale(key: String): ScaleConstructor[default] = js.native
  def getTickMethod(key: String): TickMethod = js.native
  def registerScale(key: String, cls: ScaleConstructor[default]): Unit = js.native
}

