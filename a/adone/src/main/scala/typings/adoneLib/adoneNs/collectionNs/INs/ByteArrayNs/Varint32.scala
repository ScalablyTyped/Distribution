package typings
package adoneLib.adoneNs.collectionNs.INs.ByteArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Varint32 extends js.Object {
  var length: scala.Double
  var value: scala.Double
}

object Varint32 {
  @scala.inline
  def apply(length: scala.Double, value: scala.Double): Varint32 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Varint32]
  }
}

