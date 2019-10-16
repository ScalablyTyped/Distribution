package typings.antd.esMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var inlineOpenKeys: js.Array[String]
  var openKeys: js.Array[String]
  var prevProps: InternalMenuProps
  var switchingModeFromInline: Boolean
}

object MenuState {
  @scala.inline
  def apply(
    inlineOpenKeys: js.Array[String],
    openKeys: js.Array[String],
    prevProps: InternalMenuProps,
    switchingModeFromInline: Boolean
  ): MenuState = {
    val __obj = js.Dynamic.literal(inlineOpenKeys = inlineOpenKeys, openKeys = openKeys, prevProps = prevProps, switchingModeFromInline = switchingModeFromInline)
  
    __obj.asInstanceOf[MenuState]
  }
}

