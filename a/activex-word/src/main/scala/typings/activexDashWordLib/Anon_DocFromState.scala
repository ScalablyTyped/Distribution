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
    val __obj = js.Dynamic.literal(Doc = Doc, FromState = FromState, Handled = Handled, ToState = ToState)
  
    __obj.asInstanceOf[Anon_DocFromState]
  }
}

