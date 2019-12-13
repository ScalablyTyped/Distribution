package typings.atAntDashDesignProDashLayout.libSettingDrawerBlockCheckboxMod

import typings.atAntDashDesignProDashLayout.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockCheckboxProps extends js.Object {
  var list: js.UndefOr[js.Array[Anon_Key]] = js.undefined
  var value: String
  def onChange(key: String): Unit
}

object BlockCheckboxProps {
  @scala.inline
  def apply(onChange: String => Unit, value: String, list: js.Array[Anon_Key] = null): BlockCheckboxProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockCheckboxProps]
  }
}

