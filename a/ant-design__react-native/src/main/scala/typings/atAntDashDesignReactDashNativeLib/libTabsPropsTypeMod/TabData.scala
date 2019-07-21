package typings
package atAntDashDesignReactDashNativeLib.libTabsPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabData
  extends /** for user's custom extends */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var title: reactLib.reactMod.ReactNode
}

object TabData {
  @scala.inline
  def apply(
    title: reactLib.reactMod.ReactNode,
    StringDictionary: /** for user's custom extends */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: java.lang.String = null
  ): TabData = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[TabData]
  }
}

