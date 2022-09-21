package typings.antvScale

import typings.antvScale.baseMod.Base
import typings.antvScale.typesMod.ConstantOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantMod {
  
  @JSImport("@antv/scale/lib/scales/constant", "Constant")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Constant () extends Base[ConstantOptions] {
    def this(options: ConstantOptions) = this()
    
    def getTicks(): js.Array[Double] = js.native
  }
}
