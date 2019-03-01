package typings
package activexDashAccessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SourceCtlName extends js.Object {
  val SourceCtlName: java.lang.String
  val SourceFieldList: scala.Double
  val SourceRow: scala.Double
  val X: scala.Double
  val Y: scala.Double
}

object Anon_SourceCtlName {
  @scala.inline
  def apply(
    SourceCtlName: java.lang.String,
    SourceFieldList: scala.Double,
    SourceRow: scala.Double,
    X: scala.Double,
    Y: scala.Double
  ): Anon_SourceCtlName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SourceCtlName")(SourceCtlName)
    __obj.updateDynamic("SourceFieldList")(SourceFieldList)
    __obj.updateDynamic("SourceRow")(SourceRow)
    __obj.updateDynamic("X")(X)
    __obj.updateDynamic("Y")(Y)
    __obj.asInstanceOf[Anon_SourceCtlName]
  }
}

