package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): Parameter = js.native
  def apply(Index: scala.Double): Parameter = js.native
  def Append(Object: js.Any): scala.Unit = js.native
  def Delete(Index: java.lang.String): scala.Unit = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  def Item(Index: java.lang.String): Parameter = js.native
  def Item(Index: scala.Double): Parameter = js.native
  def Refresh(): scala.Unit = js.native
}

