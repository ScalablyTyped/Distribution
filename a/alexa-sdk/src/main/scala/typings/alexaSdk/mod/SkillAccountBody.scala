package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillAccountBody extends js.Object {
  var accessToken: String = js.native
}

object SkillAccountBody {
  @scala.inline
  def apply(accessToken: String): SkillAccountBody = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillAccountBody]
  }
  @scala.inline
  implicit class SkillAccountBodyOps[Self <: SkillAccountBody] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
  }
  
}

