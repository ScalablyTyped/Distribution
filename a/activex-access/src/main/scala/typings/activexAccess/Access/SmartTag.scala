package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartTag extends js.Object {
  @JSName("Access.SmartTag_typekey")
  var AccessDotSmartTag_typekey: SmartTag = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  val IsMissing: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: SmartTagProperties = js.native
  @JSName("SmartTagActions")
  val SmartTagActions_Original: SmartTagActions = js.native
  val XML: String = js.native
  def Delete(): Unit = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Index: String): SmartTagProperty = js.native
  def Properties(Index: Double): SmartTagProperty = js.native
  def SmartTagActions(Index: String): SmartTagAction = js.native
  def SmartTagActions(Index: Double): SmartTagAction = js.native
}

