package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempVars extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): TempVar = js.native
  def apply(Index: scala.Double): TempVar = js.native
  def Add(Name: java.lang.String, Value: java.lang.String): scala.Unit = js.native
  def Add(Name: java.lang.String, Value: scala.Boolean): scala.Unit = js.native
  def Add(Name: java.lang.String, Value: scala.Double): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(Index: java.lang.String): TempVar = js.native
  def Item(Index: scala.Double): TempVar = js.native
  def Remove(Index: java.lang.String): scala.Unit = js.native
  def Remove(Index: scala.Double): scala.Unit = js.native
  def RemoveAll(): scala.Unit = js.native
}

