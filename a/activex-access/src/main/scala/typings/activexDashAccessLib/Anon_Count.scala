package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  val Count: scala.Double
  val Page: scala.Boolean
}

object Anon_Count {
  @scala.inline
  def apply(Count: scala.Double, Page: scala.Boolean): Anon_Count = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Page")(Page)
    __obj.asInstanceOf[Anon_Count]
  }
}

