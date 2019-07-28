package typings.adone.adoneNs.collectionNs.INs.ByteArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Varint32 extends js.Object {
  var length: Double
  var value: Double
}

object Varint32 {
  @scala.inline
  def apply(length: Double, value: Double): Varint32 = {
    val __obj = js.Dynamic.literal(length = length, value = value)
  
    __obj.asInstanceOf[Varint32]
  }
}

