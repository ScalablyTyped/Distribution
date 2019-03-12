package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.RoutingSlip")
@js.native
class RoutingSlip protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  var Delivery: WdRoutingSlipDelivery = js.native
  var Message: java.lang.String = js.native
  val Parent: js.Any = js.native
  var Protect: WdProtectionType = js.native
  var ReturnWhenDone: scala.Boolean = js.native
  val Status: WdRoutingSlipStatus = js.native
  var Subject: java.lang.String = js.native
  var TrackStatus: scala.Boolean = js.native
  var `Word.RoutingSlip_typekey`: RoutingSlip = js.native
  def AddRecipient(Recipient: java.lang.String): scala.Unit = js.native
  def Recipients(): js.Any = js.native
  def Recipients(Index: js.Any): js.Any = js.native
  def Reset(): scala.Unit = js.native
}

