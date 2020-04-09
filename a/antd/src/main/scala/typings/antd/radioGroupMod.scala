package typings.antd

import typings.antd.contextMod.ConfigConsumerProps
import typings.antd.radioInterfaceMod.RadioChangeEvent
import typings.antd.radioInterfaceMod.RadioGroupProps
import typings.antd.radioInterfaceMod.RadioGroupState
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/group", JSImport.Namespace)
@js.native
object radioGroupMod extends js.Object {
  @js.native
  trait RadioGroup
    extends Component[RadioGroupProps, RadioGroupState, js.Any] {
    def onRadioChange(ev: RadioChangeEvent): Unit = js.native
    def renderGroup(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default protected () extends RadioGroup {
    def this(props: RadioGroupProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps, prevState: RadioGroupState): PartialRadioGroupState = js.native
  }
  
}

