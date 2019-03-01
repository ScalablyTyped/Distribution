package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentOnChange extends js.Object {
  var current: scala.Double
  var pageSize: scala.Double
  var total: scala.Double
  def onChange(page: scala.Double, pageSize: scala.Double): scala.Unit
}

object Anon_CurrentOnChange {
  @scala.inline
  def apply(
    current: scala.Double,
    onChange: js.Function2[scala.Double, scala.Double, scala.Unit],
    pageSize: scala.Double,
    total: scala.Double
  ): Anon_CurrentOnChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("onChange")(onChange)
    __obj.updateDynamic("pageSize")(pageSize)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Anon_CurrentOnChange]
  }
}

