package typings.atAntDashDesignProDashLayout.libSiderMenuSiderMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiderMenuState extends js.Object {
  var flatMenuKeysLen: js.UndefOr[Double] = js.undefined
  var openKeys: js.UndefOr[js.Array[String]] = js.undefined
  var pathname: js.UndefOr[String] = js.undefined
}

object SiderMenuState {
  @scala.inline
  def apply(flatMenuKeysLen: Int | Double = null, openKeys: js.Array[String] = null, pathname: String = null): SiderMenuState = {
    val __obj = js.Dynamic.literal()
    if (flatMenuKeysLen != null) __obj.updateDynamic("flatMenuKeysLen")(flatMenuKeysLen.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys)
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[SiderMenuState]
  }
}

