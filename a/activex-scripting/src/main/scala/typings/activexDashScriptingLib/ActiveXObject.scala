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

