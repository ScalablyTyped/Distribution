package typings
package antdLib.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuState extends js.Object {
  var keyPathOfSelectedItem: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var selectedKeys: js.Array[java.lang.String]
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterMenuState {
  @scala.inline
  def apply(
    keyPathOfSelectedItem: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    selectedKeys: js.Array[java.lang.String],
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): FilterMenuState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keyPathOfSelectedItem")(keyPathOfSelectedItem)
    __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[FilterMenuState]
  }
}

