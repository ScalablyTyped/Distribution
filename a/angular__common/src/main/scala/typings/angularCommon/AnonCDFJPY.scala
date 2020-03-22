package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCDFJPY extends js.Object {
  var CDF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonCDFJPY {
  @scala.inline
  def apply(CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonCDFJPY = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCDFJPY]
  }
}

