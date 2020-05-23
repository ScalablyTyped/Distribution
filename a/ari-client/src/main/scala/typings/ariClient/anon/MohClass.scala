package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MohClass extends js.Object {
  var bridgeId: String
  var mohClass: js.UndefOr[String] = js.undefined
}

object MohClass {
  @scala.inline
  def apply(bridgeId: String, mohClass: String = null): MohClass = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any])
    if (mohClass != null) __obj.updateDynamic("mohClass")(mohClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[MohClass]
  }
}

