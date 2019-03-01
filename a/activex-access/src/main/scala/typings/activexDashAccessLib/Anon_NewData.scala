package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewData extends js.Object {
  var NewData: java.lang.String
  var Response: scala.Double
}

object Anon_NewData {
  @scala.inline
  def apply(NewData: java.lang.String, Response: scala.Double): Anon_NewData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NewData")(NewData)
    __obj.updateDynamic("Response")(Response)
    __obj.asInstanceOf[Anon_NewData]
  }
}

