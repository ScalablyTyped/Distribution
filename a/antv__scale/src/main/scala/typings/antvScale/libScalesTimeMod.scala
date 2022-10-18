package typings.antvScale

import typings.antvScale.libScalesContinuousMod.Continuous
import typings.antvScale.libTypesMod.TimeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesTimeMod {
  
  @JSImport("@antv/scale/lib/scales/time", "Time")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Time () extends Continuous[TimeOptions] {
    def this(options: TimeOptions) = this()
    
    def getFormatter(): js.Function1[/* d */ js.Date, String] = js.native
  }
}
