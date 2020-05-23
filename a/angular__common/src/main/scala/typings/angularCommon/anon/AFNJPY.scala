package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFNJPY extends js.Object {
  var AFN: js.Array[String]
  var JPY: js.Array[String]
  var PKR: js.Array[String]
}

object AFNJPY {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String], PKR: js.Array[String]): AFNJPY = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNJPY]
  }
}

