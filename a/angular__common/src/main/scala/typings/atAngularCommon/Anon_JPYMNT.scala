package typings.atAngularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_JPYMNT extends js.Object {
  var JPY: js.Array[String]
  var MNT: js.Array[String]
  var SEK: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object Anon_JPYMNT {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    MNT: js.Array[String],
    SEK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): Anon_JPYMNT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MNT = MNT.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_JPYMNT]
  }
}

