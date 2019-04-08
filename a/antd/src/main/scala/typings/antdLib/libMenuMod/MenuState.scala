package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var inlineOpenKeys: js.Array[java.lang.String]
  var openKeys: js.Array[java.lang.String]
  var prevProps: InternalMenuProps
  var switchingModeFromInline: scala.Boolean
}

object MenuState {
  @scala.inline
  def apply(
    inlineOpenKeys: js.Array[java.lang.String],
    openKeys: js.Array[java.lang.String],
    prevProps: InternalMenuProps,
    switchingModeFromInline: scala.Boolean
  ): MenuState = {
    val __obj = js.Dynamic.literal(inlineOpenKeys = inlineOpenKeys, openKeys = openKeys, prevProps = prevProps, switchingModeFromInline = switchingModeFromInline)
  
    __obj.asInstanceOf[MenuState]
  }
}

