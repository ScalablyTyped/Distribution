package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Procedures extends js.Object {
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Procedure = js.native
  def apply(Item: scala.Double): Procedure = js.native
  def Append(Name: java.lang.String, Command: activexDashAdodbLib.ADODBNs.Command): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Procedure = js.native
  def Item(Item: scala.Double): Procedure = js.native
  def Refresh(): scala.Unit = js.native
}

