package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait References extends js.Object {
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(var_0: java.lang.String): Reference = js.native
  def apply(var_0: scala.Double): Reference = js.native
  def AddFromFile(FileName: java.lang.String): Reference = js.native
  def AddFromGuid(Guid: java.lang.String, Major: scala.Double, Minor: scala.Double): Reference = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(var_0: java.lang.String): Reference = js.native
  def Item(var_0: scala.Double): Reference = js.native
  def Remove(Reference: Reference): scala.Unit = js.native
}

