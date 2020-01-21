package typings.antd.mod

import typings.antd.AnonChoiceTransitionNameClassName
import typings.antd.AnonChoiceTransitionNameShowSearch
import typings.antd.selectMod.ModeOption
import typings.antd.selectMod.OptGroupProps
import typings.antd.selectMod.OptionProps
import typings.antd.selectMod.SelectProps
import typings.antd.selectMod.default
import typings.react.mod.ClassicComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Select")
@js.native
class Select[T] protected () extends default[T] {
  def this(props: SelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "Select")
@js.native
object Select extends js.Object {
  var OptGroup: ClassicComponentClass[OptGroupProps] = js.native
  var Option: ClassicComponentClass[OptionProps] = js.native
  var SECRET_COMBOBOX_MODE_DO_NOT_USE: ModeOption = js.native
  var defaultProps: AnonChoiceTransitionNameShowSearch = js.native
  var propTypes: AnonChoiceTransitionNameClassName = js.native
}

