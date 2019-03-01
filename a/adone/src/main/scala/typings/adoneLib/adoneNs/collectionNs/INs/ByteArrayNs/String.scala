package typings
package adoneLib.adoneNs.collectionNs.INs.ByteArrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var length: scala.Double
  var string: java.lang.String
}

object String {
  @scala.inline
  def apply(length: scala.Double, string: java.lang.String): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[String]
  }
}

