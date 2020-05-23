package typings.asn1js.anon

import typings.asn1js.mod.LocalBaseBlock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: Double
  var result: LocalBaseBlock
}

object Offset {
  @scala.inline
  def apply(offset: Double, result: LocalBaseBlock): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

