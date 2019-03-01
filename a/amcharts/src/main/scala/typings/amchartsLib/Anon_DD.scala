package typings
package amchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DD extends js.Object {
  var DD: java.lang.String
  var hh: java.lang.String
  var mm: java.lang.String
  var ss: java.lang.String
}

object Anon_DD {
  @scala.inline
  def apply(DD: java.lang.String, hh: java.lang.String, mm: java.lang.String, ss: java.lang.String): Anon_DD = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DD")(DD)
    __obj.updateDynamic("hh")(hh)
    __obj.updateDynamic("mm")(mm)
    __obj.updateDynamic("ss")(ss)
    __obj.asInstanceOf[Anon_DD]
  }
}

