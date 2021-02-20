package typings.antvScale

import typings.antvScale.categoryBaseMod.default
import typings.antvScale.factoryMod.ScaleConstructor
import typings.antvScale.typesMod.ScaleConfig
import typings.antvScale.typesMod.TickMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * 分类度量
    * @class
    */
  @JSImport("@antv/scale", "Category")
  @js.native
  class Category () extends default
  
  @JSImport("@antv/scale", "Identity")
  @js.native
  class Identity ()
    extends typings.antvScale.identityMod.default
  
  @JSImport("@antv/scale", "Linear")
  @js.native
  class Linear ()
    extends typings.antvScale.linearMod.default
  
  /**
    * Log 度量，处理非均匀分布
    */
  @JSImport("@antv/scale", "Log")
  @js.native
  class Log ()
    extends typings.antvScale.logMod.default
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @JSImport("@antv/scale", "Pow")
  @js.native
  class Pow ()
    extends typings.antvScale.powMod.default
  
  @JSImport("@antv/scale", "Quantile")
  @js.native
  class Quantile ()
    extends typings.antvScale.quantileMod.default
  
  /**
    * 分段度量
    */
  @JSImport("@antv/scale", "Quantize")
  @js.native
  class Quantize ()
    extends typings.antvScale.quantizeMod.default
  
  @JSImport("@antv/scale", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typings.antvScale.baseMod.default {
    def this(cfg: ScaleConfig) = this()
  }
  
  /**
    * 时间度量
    * @class
    */
  @JSImport("@antv/scale", "Time")
  @js.native
  class Time ()
    extends typings.antvScale.continuousTimeMod.default
  
  /**
    * 时间分类度量
    * @class
    */
  @JSImport("@antv/scale", "TimeCat")
  @js.native
  class TimeCat ()
    extends typings.antvScale.timeMod.default
  
  @JSImport("@antv/scale", "getScale")
  @js.native
  def getScale(key: String): ScaleConstructor[typings.antvScale.baseMod.default] = js.native
  
  @JSImport("@antv/scale", "getTickMethod")
  @js.native
  def getTickMethod(key: String): TickMethod = js.native
  
  @JSImport("@antv/scale", "registerScale")
  @js.native
  def registerScale(key: String, cls: ScaleConstructor[typings.antvScale.baseMod.default]): Unit = js.native
  
  @JSImport("@antv/scale", "registerTickMethod")
  @js.native
  def registerTickMethod(key: String, method: TickMethod): Unit = js.native
}
