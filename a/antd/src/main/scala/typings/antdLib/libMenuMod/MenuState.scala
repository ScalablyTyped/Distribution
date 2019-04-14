package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuState extends js.Object {
  var inlineOpenKeys: js.Array[java.lang.String]
  var mounted: scala.Boolean
  var openKeys: js.Array[java.lang.String]
  var prevProps: InternalMenuProps
  var switchingModeFromInline: scala.Boolean
}

object MenuState {
  @scala.inline
  def apply(
    inlineOpenKeys: js.Array[java.lang.String],
    mounted: scala.Boolean,
    openKeys: js.Array[java.lang.String],
    prevProps: InternalMenuProps,
    switchingModeFromInline: scala.Boolean
  ): MenuState = {
    val __obj = js.Dynamic.literal(inlineOpenKeys = inlineOpenKeys, mounted = mounted, openKeys = openKeys, prevProps = prevProps, switchingModeFromInline = switchingModeFromInline)
  
    __obj.asInstanceOf[MenuState]
  }
}

