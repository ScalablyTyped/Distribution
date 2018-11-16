package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Group = js.native
  def apply(Item: scala.Double): Group = js.native
  def Append(Item: Group): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Group = js.native
  def Item(Item: scala.Double): Group = js.native
  def Refresh(): scala.Unit = js.native
}

