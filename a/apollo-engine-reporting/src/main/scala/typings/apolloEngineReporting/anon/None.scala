package typings.apolloEngineReporting.anon

import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import typings.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait None extends SendValuesBaseOptions {
  var none: `true` = js.native
}

object None {
  @scala.inline
  def apply(none: `true`): None = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[None]
  }
  @scala.inline
  implicit class NoneOps[Self <: None] (val x: Self) extends AnyVal {
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
    def setNone(value: `true`): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

