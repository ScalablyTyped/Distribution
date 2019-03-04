package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowHour extends js.Object {
  var showHour: scala.Boolean
  var showMinute: scala.Boolean
  var showSecond: scala.Boolean
}

object Anon_ShowHour {
  @scala.inline
  def apply(showHour: scala.Boolean, showMinute: scala.Boolean, showSecond: scala.Boolean): Anon_ShowHour = {
    val __obj = js.Dynamic.literal(showHour = showHour, showMinute = showMinute, showSecond = showSecond)
  
    __obj.asInstanceOf[Anon_ShowHour]
  }
}

