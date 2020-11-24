package typings.antd.autoCompleteMod

import typings.antd.anon.PartialAutoCompletePropsR
import typings.antd.anon.WeakValidationMapAutoComp
import typings.antd.selectMod.OptionType
import typings.antd.selectMod.RefSelectProps
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<antd.antd/lib/auto-complete.AutoCompleteProps & react.react.RefAttributes<antd.antd/lib/select.RefSelectProps>> & {  Option :antd.antd/lib/select.OptionType} */
@js.native
trait RefAutoCompleteWithOption extends js.Object {
  
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: AutoCompleteProps with RefAttributes[RefSelectProps]): ReactElement | Null = js.native
  
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  
  var Option: OptionType = js.native
  
  var defaultProps: js.UndefOr[PartialAutoCompletePropsR] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapAutoComp] = js.native
}
