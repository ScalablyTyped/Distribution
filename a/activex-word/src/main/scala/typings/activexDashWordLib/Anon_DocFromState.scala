package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFromState extends js.Object {
  val Doc: activexDashWordLib.WordNs.Document
  val FromState: scala.Double
  val Handled: scala.Boolean
  val ToState: scala.Double
}

object Anon_DocFromState {
  @scala.inline
  def apply(
    Doc: activexDashWordLib.WordNs.Document,
    FromState: scala.Double,
    Handled: scala.Boolean,
    ToState: scala.Double
  ): Anon_DocFromState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Doc")(Doc)
    __obj.updateDynamic("FromState")(FromState)
    __obj.updateDynamic("Handled")(Handled)
    __obj.updateDynamic("ToState")(ToState)
    __obj.asInstanceOf[Anon_DocFromState]
  }
}

