package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuState[T] extends js.Object {
  var keyPathOfSelectedItem: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var prevProps: FilterMenuProps[T]
  var selectedKeys: js.Array[java.lang.String]
  var valueKeys: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterMenuState {
  @scala.inline
  def apply[T](
    keyPathOfSelectedItem: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    prevProps: FilterMenuProps[T],
    selectedKeys: js.Array[java.lang.String],
    valueKeys: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): FilterMenuState[T] = {
    val __obj = js.Dynamic.literal(keyPathOfSelectedItem = keyPathOfSelectedItem, prevProps = prevProps, selectedKeys = selectedKeys, valueKeys = valueKeys)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[FilterMenuState[T]]
  }
}

