package typings.antDashDesignDashPro

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var tab: ReactNode
}

object Anon_Key {
  @scala.inline
  def apply(key: String, tab: ReactNode = null): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Key]
  }
}

