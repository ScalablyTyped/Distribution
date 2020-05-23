package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PGK extends js.Object {
  var JPY: js.Array[String]
  var PGK: js.Array[String]
  var USD: js.Array[String]
}

object PGK {
  @scala.inline
  def apply(JPY: js.Array[String], PGK: js.Array[String], USD: js.Array[String]): PGK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PGK = PGK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PGK]
  }
}

