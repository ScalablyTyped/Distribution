package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select[T]
  extends reactLib.reactMod.Component[SelectProps[T], js.Object, js.Any] {
  var rcSelect: js.Any = js.native
  def blur(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def getNotFoundContent(locale: SelectLocale): js.UndefOr[js.Object | scala.Null] = js.native
  def isCombobox(): scala.Boolean = js.native
  def renderSelect(locale: SelectLocale): reactLib.reactMod.Global.JSXNs.Element = js.native
  def saveSelect(node: js.Any): scala.Unit = js.native
}

