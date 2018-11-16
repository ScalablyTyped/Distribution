package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionItem extends js.Object {
  var key: java.lang.String = js.native
  @JSName("onSelect")
  var onSelect_Original: SelectionItemSelectFn = js.native
  var text: reactLib.reactMod.ReactNs.ReactNode = js.native
  def onSelect(key: js.Array[java.lang.String]): js.Any = js.native
}

