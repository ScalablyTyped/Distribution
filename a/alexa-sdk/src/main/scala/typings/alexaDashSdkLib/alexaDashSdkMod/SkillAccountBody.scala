package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillAccountBody extends js.Object {
  var accessToken: java.lang.String
}

object SkillAccountBody {
  @scala.inline
  def apply(accessToken: java.lang.String): SkillAccountBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.asInstanceOf[SkillAccountBody]
  }
}

