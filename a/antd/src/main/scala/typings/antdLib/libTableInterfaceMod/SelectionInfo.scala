package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionInfo[T] extends js.Object {
  var changeRowKeys: js.UndefOr[js.Array[reactLib.reactMod.ReactNs.Key]] = js.undefined
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var nativeEvent: js.UndefOr[reactLib.Event] = js.undefined
  var record: js.UndefOr[T] = js.undefined
  var selectWay: TableSelectWay
}

