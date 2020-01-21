package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTagProperties extends js.Object {
  val Application: typings.activexAccess.Access.Application = js.native
  val Count: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): SmartTagProperty = js.native
  def apply(Index: Double): SmartTagProperty = js.native
  def Add(Name: String, Value: js.Any): SmartTagProperty = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Item(Index: String): SmartTagProperty = js.native
  def Item(Index: Double): SmartTagProperty = js.native
}

