package typings.antvAttr

import org.scalablytyped.runtime.Instantiable1
import typings.antvAttr.interfaceMod.AttributeCfg
import typings.antvAttr.interfaceMod.CallbackType
import typings.antvAttr.interfaceMod.Scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/attr/lib/attributes/base", JSImport.Namespace)
@js.native
object baseMod extends js.Object {
  
  @js.native
  trait Attribute extends js.Object {
    
    var _getAttributeValue: js.Any = js.native
    
    var _parseCfg: js.Any = js.native
    
    /**
      * 通过 scale 拿到数据对应的原始的参数
      * @param param
      * @param scale
      * @private
      */
    var _toOriginParam: js.Any = js.native
    
    def callback(args: js.Any*): js.Array[_] = js.native
    @JSName("callback")
    var callback_Original: CallbackType = js.native
    
    /**
      * 默认的回调函数（用户没有自定义 callback，或者用户自定义 callback 返回空的时候，使用 values 映射）
      * @param params
      */
    var defaultCallback: js.Any = js.native
    
    /**
      * 获取所有的维度名
      */
    def getFields(): js.Array[String] = js.native
    
    /**
      * 如果进行线性映射，返回对应的映射值
      * @param percent
      */
    def getLinearValue(percent: Double): Double | String = js.native
    
    /**
      * 根据度量获取属性名
      */
    def getNames(): js.Array[_] = js.native
    
    /**
      * 根据名称获取度量
      * @param name
      */
    def getScale(name: String): Scale = js.native
    
    var linear: Boolean = js.native
    
    /**
      * 映射的值组成的数组
      * @param params 对应 scale 顺序的值传入
      */
    def mapping(params: js.Any*): js.Array[_] = js.native
    
    var names: js.Array[String] = js.native
    
    var scales: js.Array[Scale] = js.native
    
    var `type`: String = js.native
    
    var values: js.Array[_] = js.native
  }
  
  @js.native
  class default protected () extends Attribute {
    def this(cfg: AttributeCfg) = this()
  }
  
  type AttributeConstructor = Instantiable1[/* cfg */ js.Any, Attribute]
}
