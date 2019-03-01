package typings
package activexDashMshtmlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  val description: java.lang.String
  val line: scala.Double
  val url: java.lang.String
}

object Anon_Description {
  @scala.inline
  def apply(description: java.lang.String, line: scala.Double, url: java.lang.String): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Description]
  }
}

