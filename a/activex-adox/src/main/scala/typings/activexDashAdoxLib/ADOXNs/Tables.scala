package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tables extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Table = js.native
  def apply(Item: scala.Double): Table = js.native
  def Append(Item: Table): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Table = js.native
  def Item(Item: scala.Double): Table = js.native
  def Refresh(): scala.Unit = js.native
}

