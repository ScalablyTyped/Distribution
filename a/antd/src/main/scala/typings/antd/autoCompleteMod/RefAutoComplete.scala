package typings.antd.autoCompleteMod

import typings.antd.anon.PartialAutoCompletePropsR
import typings.antd.anon.WeakValidationMapAutoComp
import typings.antd.selectMod.OptionType
import typings.antd.selectMod.SelectValue
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ForwardRefExoticComponent<antd.antd/lib/auto-complete.AutoCompleteProps & react.react.RefAttributes<antd.antd/lib/select.default<antd.antd/lib/select.SelectValue>>> & {  Option :antd.antd/lib/select.OptionType} */
@js.native
trait RefAutoComplete extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  var Option: OptionType = js.native
  var defaultProps: js.UndefOr[PartialAutoCompletePropsR] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapAutoComp] = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: AutoCompleteProps with RefAttributes[typings.antd.selectMod.default[SelectValue]]): ReactElement | Null = js.native
}

