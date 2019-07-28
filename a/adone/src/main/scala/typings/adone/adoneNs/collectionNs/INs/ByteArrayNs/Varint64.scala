package typings.adone.adoneNs.collectionNs.INs.ByteArrayNs

import typings.adone.adoneNs.collectionNs.INs.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Varint64 extends js.Object {
  var length: Double
  var value: Long
}

object Varint64 {
  @scala.inline
  def apply(length: Double, value: Long): Varint64 = {
    val __obj = js.Dynamic.literal(length = length, value = value)
  
    __obj.asInstanceOf[Varint64]
  }
}

