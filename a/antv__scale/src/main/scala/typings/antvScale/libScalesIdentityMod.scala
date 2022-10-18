package typings.antvScale

import typings.antvScale.libScalesBaseMod.Base
import typings.antvScale.libTypesMod.IdentityOptions
import typings.antvScale.libTypesMod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesIdentityMod {
  
  @JSImport("@antv/scale/lib/scales/identity", "Identity")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Identity () extends Base[IdentityOptions] {
    def this(options: IdentityOptions) = this()
    
    /**
      * 根据比例尺的配置去生成 ticks，该 ticks 主要用于生成坐标轴
      * @returns 返回一个 ticks 的数组
      */
    def getTicks(): js.Array[Range[IdentityOptions]] = js.native
  }
}
