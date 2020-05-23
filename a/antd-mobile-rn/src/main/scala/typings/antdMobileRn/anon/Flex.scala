package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flex extends js.Object {
  var alignItems: String
  var flex: Double
  var flexDirection: String
}

object Flex {
  @scala.inline
  def apply(alignItems: String, flex: Double, flexDirection: String): Flex = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], flexDirection = flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
}

