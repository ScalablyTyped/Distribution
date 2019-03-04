package typings
package adoneLib.adoneNs.collectionNs.INs.ByteArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Varint64 extends js.Object {
  var length: scala.Double
  var value: adoneLib.adoneNs.collectionNs.INs.Long
}

object Varint64 {
  @scala.inline
  def apply(length: scala.Double, value: adoneLib.adoneNs.collectionNs.INs.Long): Varint64 = {
    val __obj = js.Dynamic.literal(length = length, value = value)
  
    __obj.asInstanceOf[Varint64]
  }
}

