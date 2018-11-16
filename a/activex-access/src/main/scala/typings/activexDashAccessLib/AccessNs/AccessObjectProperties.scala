package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessObjectProperties extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): AccessObjectProperty = js.native
  def apply(Index: scala.Double): AccessObjectProperty = js.native
  def Add(PropertyName: java.lang.String, Value: js.Any): scala.Unit = js.native
  def IsMemberSafe(dispid: scala.Double): scala.Boolean = js.native
  def Item(Index: java.lang.String): AccessObjectProperty = js.native
  def Item(Index: scala.Double): AccessObjectProperty = js.native
  def Remove(Item: java.lang.String): scala.Unit = js.native
  def Remove(Item: scala.Double): scala.Unit = js.native
}

