package typings.atAntDashDesignProDashLayout.libSettingDrawerBlockCheckboxMod

import typings.atAntDashDesignProDashLayout.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockCheckboxProps extends js.Object {
  var list: js.Array[Anon_Key]
  var value: String
  def onChange(key: String): Unit
}

object BlockCheckboxProps {
  @scala.inline
  def apply(list: js.Array[Anon_Key], onChange: String => Unit, value: String): BlockCheckboxProps = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockCheckboxProps]
  }
}

