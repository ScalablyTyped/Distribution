package typings.autoLaunch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseLaunchAgent extends js.Object {
  /**
    * By default, AppleScript is used to add a Login Item. If this is `true`, Launch Agent will be used to auto-launch your app. Defaults is `false`.
    */
  var useLaunchAgent: js.UndefOr[Boolean] = js.native
}

object UseLaunchAgent {
  @scala.inline
  def apply(): UseLaunchAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseLaunchAgent]
  }
  @scala.inline
  implicit class UseLaunchAgentOps[Self <: UseLaunchAgent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUseLaunchAgent(value: Boolean): Self = this.set("useLaunchAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLaunchAgent: Self = this.set("useLaunchAgent", js.undefined)
  }
  
}

