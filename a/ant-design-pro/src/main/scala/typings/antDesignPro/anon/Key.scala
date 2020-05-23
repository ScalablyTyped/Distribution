package typings.antDesignPro.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var tab: ReactNode
}

object Key {
  @scala.inline
  def apply(key: String, tab: ReactNode = null): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

