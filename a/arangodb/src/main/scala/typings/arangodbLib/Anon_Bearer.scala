package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bearer extends js.Object {
  var bearer: java.lang.String
}

object Anon_Bearer {
  @scala.inline
  def apply(bearer: java.lang.String): Anon_Bearer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bearer")(bearer)
    __obj.asInstanceOf[Anon_Bearer]
  }
}

