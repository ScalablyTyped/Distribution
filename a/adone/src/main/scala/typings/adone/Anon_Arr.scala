package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arr extends js.Object {
  var arr: js.Array[String]
  var idx: Double
  var str: String
  var `val`: String
}

object Anon_Arr {
  @scala.inline
  def apply(arr: js.Array[String], idx: Double, str: String, `val`: String): Anon_Arr = {
    val __obj = js.Dynamic.literal(arr = arr, idx = idx, str = str)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_Arr]
  }
}

