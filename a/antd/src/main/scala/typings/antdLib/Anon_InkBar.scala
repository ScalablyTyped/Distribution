package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InkBar extends js.Object {
  var inkBar: scala.Boolean
  var tabPane: scala.Boolean
}

object Anon_InkBar {
  @scala.inline
  def apply(inkBar: scala.Boolean, tabPane: scala.Boolean): Anon_InkBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inkBar")(inkBar)
    __obj.updateDynamic("tabPane")(tabPane)
    __obj.asInstanceOf[Anon_InkBar]
  }
}

