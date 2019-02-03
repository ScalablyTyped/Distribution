package typings
package antdLib.antdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Select")
@js.native
class Select[T] protected ()
  extends antdLib.libSelectMod.default[T] {
  def this(props: antdLib.libSelectMod.SelectProps[T]) = this()
}

/* static members */
@JSImport("antd", "Select")
@js.native
object Select extends js.Object {
  var OptGroup: reactLib.reactMod.ReactNs.ClassicComponentClass[antdLib.libSelectMod.OptGroupProps] = js.native
  var Option: reactLib.reactMod.ReactNs.ClassicComponentClass[antdLib.libSelectMod.OptionProps] = js.native
  var SECRET_COMBOBOX_MODE_DO_NOT_USE: java.lang.String = js.native
  var defaultProps: antdLib.Anon_ChoiceTransitionNameShowSearch = js.native
  var propTypes: antdLib.Anon_ChoiceTransitionNameClassName = js.native
}

