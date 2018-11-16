package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pages extends js.Object {
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): Page = js.native
  def apply(Index: scala.Double): Page = js.native
  def Add(): Page = js.native
  def Add(Before: scala.Double): Page = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(Index: java.lang.String): Page = js.native
  def Item(Index: scala.Double): Page = js.native
  def Remove(): scala.Unit = js.native
  def Remove(Item: scala.Double): scala.Unit = js.native
}

