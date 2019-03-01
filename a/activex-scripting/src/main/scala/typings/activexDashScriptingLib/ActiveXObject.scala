package typings
package activexDashScriptingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObject extends js.Object {
  @JSName("set")
  def set_Item[TKey, TValue](
    obj: activexDashScriptingLib.ScriptingNs.Dictionary[TKey, TValue],
    propertyName: activexDashScriptingLib.activexDashScriptingLibStrings.Item,
    parameterTypes: js.Array[TKey],
    newValue: TValue
  ): scala.Unit
}

object ActiveXObject {
  @scala.inline
  def apply(
    set_Item: js.Function4[
      activexDashScriptingLib.ScriptingNs.Dictionary[js.Any, js.Any], 
      activexDashScriptingLib.activexDashScriptingLibStrings.Item, 
      js.Array[js.Any], 
      js.Any, 
      scala.Unit
    ]
  ): ActiveXObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(set_Item)
    __obj.asInstanceOf[ActiveXObject]
  }
}

