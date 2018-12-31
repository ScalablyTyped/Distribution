package typings
package antdLib.libTreeDashSelectInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeNormal extends js.Object {
  var children: js.UndefOr[js.Array[TreeNodeNormal]] = js.undefined
  var disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var isLeaf: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  /**
    * @deprecated Please use `title` instead.
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var value: java.lang.String | scala.Double
}

