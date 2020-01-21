package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCNYILP extends js.Object {
  var CNY: js.Array[String]
  var ILP: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonCNYILP {
  @scala.inline
  def apply(CNY: js.Array[String], ILP: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonCNYILP = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCNYILP]
  }
}

