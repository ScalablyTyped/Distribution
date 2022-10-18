package typings.antvScale

import typings.antvScale.libTypesMod.BaseOptions
import typings.antvScale.libTypesMod.Domain
import typings.antvScale.libTypesMod.Range
import typings.antvScale.libTypesMod.Unknown
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesBaseMod {
  
  /* note: abstract class */ @JSImport("@antv/scale/lib/scales/base", "Base")
  @js.native
  /**
    * 构造函数，根据自定义的选项和默认选项生成当前选项
    * @param options 需要自定义配置的选项
    */
  open class Base[O /* <: BaseOptions */] () extends StObject {
    def this(options: O) = this()
    
    /**
      * 子类需要覆盖的默认配置
      */
    /* protected */ def getDefaultOptions(): Partial[O] = js.native
    
    /**
      * 返回当前的所有选项
      * @returns 当前的所有选项
      */
    def getOptions(): O = js.native
    
    /**
      * 将值域里的一个值，据转换规则，逆向转换为定义域里的一个值或者一个区间
      * @param x 需要转换的值
      */
    def invert(x: Range[O]): Domain[O] | js.Array[Domain[O]] | Unknown[O] = js.native
    
    /**
      * 将定义域里面的一个值，根据转换规则，转换为值域的一个值。
      * 如果该值不合法，则返回 options.unknown
      * @param x 需要转换的值
      */
    def map(x: Domain[O]): Range[O] | Unknown[O] = js.native
    
    /**
      * 比例尺的选项，用于配置数据映射的规则和 ticks 的生成方式
      */
    /* protected */ var options: O = js.native
    
    /**
      * 根据需要更新 options 和更新后的 options 更新 scale 的内部状态，
      * 在函数内部可以用 this.options 获得更新后的 options
      * @param options 需要更新的 options
      */
    /* protected */ def rescale(): Unit = js.native
    /* protected */ def rescale(options: Partial[O]): Unit = js.native
    
    /**
      * 更新选项和比例尺的内部状态
      * @param updateOptions 需要更新的选项
      */
    def update(): Unit = js.native
    def update(updateOptions: Partial[O]): Unit = js.native
  }
}
