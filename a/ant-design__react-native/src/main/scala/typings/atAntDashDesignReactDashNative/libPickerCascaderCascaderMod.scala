package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libPickerCascaderCascaderTypesMod.CascaderProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/picker/cascader/Cascader", JSImport.Namespace)
@js.native
object libPickerCascaderCascaderMod extends js.Object {
  @js.native
  trait Cascader
    extends Component[CascaderProps, js.Any, js.Any] {
    @JSName("state")
    var state_Cascader: Anon_ValueAnyArray = js.native
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCascader(nextProps: Anon_Data): Unit = js.native
    def getCols(): js.Array[Element] = js.native
    def getValue(d: js.Any, `val`: js.Any): js.Array[_] = js.native
    def onValueChange(value: js.Any, index: js.Any): Unit = js.native
  }
  
  @js.native
  class default () extends Cascader
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_ColsData = js.native
  }
  
}

