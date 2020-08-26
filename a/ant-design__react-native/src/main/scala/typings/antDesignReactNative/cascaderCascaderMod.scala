package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ColsData
import typings.antDesignReactNative.anon.DataValue
import typings.antDesignReactNative.anon.ValueArray
import typings.antDesignReactNative.cascaderTypesMod.CascaderProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", JSImport.Namespace)
@js.native
object cascaderCascaderMod extends js.Object {
  @js.native
  trait Cascader
    extends Component[CascaderProps, js.Any, js.Any] {
    @JSName("state")
    var state_Cascader: ValueArray = js.native
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCascader(nextProps: DataValue): Unit = js.native
    def getCols(): js.Array[Element] = js.native
    def getValue(d: js.Any, `val`: js.Any): js.Array[_] = js.native
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Cascader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: ColsData = js.native
  }
  
}

