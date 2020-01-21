package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillAccountBody extends js.Object {
  var accessToken: String
}

object SkillAccountBody {
  @scala.inline
  def apply(accessToken: String): SkillAccountBody = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkillAccountBody]
  }
}

