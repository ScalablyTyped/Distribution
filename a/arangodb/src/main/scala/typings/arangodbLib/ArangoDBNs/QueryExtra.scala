package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExtra extends js.Object {
  var stats: arangodbLib.Anon_ExecutionTime
  var warnings: js.Array[java.lang.String]
}

object QueryExtra {
  @scala.inline
  def apply(stats: arangodbLib.Anon_ExecutionTime, warnings: js.Array[java.lang.String]): QueryExtra = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[QueryExtra]
  }
}

