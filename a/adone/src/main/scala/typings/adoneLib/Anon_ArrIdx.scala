package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrIdx extends js.Object {
  var arr: js.Array[java.lang.String]
  var idx: scala.Double
  var str: java.lang.String
  var `val`: java.lang.String
}

object Anon_ArrIdx {
  @scala.inline
  def apply(arr: js.Array[java.lang.String], idx: scala.Double, str: java.lang.String, `val`: java.lang.String): Anon_ArrIdx = {
    val __obj = js.Dynamic.literal(arr = arr, idx = idx, str = str)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[Anon_ArrIdx]
  }
}

