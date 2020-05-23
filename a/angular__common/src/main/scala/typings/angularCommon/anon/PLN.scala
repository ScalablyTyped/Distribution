package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PLN extends js.Object {
  var AUD: js.Array[js.UndefOr[String]]
  var PLN: js.Array[String]
  var THB: js.Array[String]
}

object PLN {
  @scala.inline
  def apply(AUD: js.Array[js.UndefOr[String]], PLN: js.Array[String], THB: js.Array[String]): PLN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PLN]
  }
}

