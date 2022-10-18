package typings.antvScale

import typings.antvScale.libScalesContinuousMod.Continuous
import typings.antvScale.libTypesMod.LogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesLogMod {
  
  @JSImport("@antv/scale/lib/scales/log", "Log")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Log () extends Continuous[LogOptions] {
    def this(options: LogOptions) = this()
  }
}
