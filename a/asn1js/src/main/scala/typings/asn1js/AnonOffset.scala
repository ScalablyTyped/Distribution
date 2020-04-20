package typings.asn1js

import typings.asn1js.mod.LocalBaseBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: Double
  var result: LocalBaseBlock
}

object AnonOffset {
  @scala.inline
  def apply(offset: Double, result: LocalBaseBlock): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

