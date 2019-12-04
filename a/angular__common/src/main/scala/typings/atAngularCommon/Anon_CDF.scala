package typings.atAngularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CDF extends js.Object {
  var CDF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object Anon_CDF {
  @scala.inline
  def apply(CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): Anon_CDF = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CDF]
  }
}

