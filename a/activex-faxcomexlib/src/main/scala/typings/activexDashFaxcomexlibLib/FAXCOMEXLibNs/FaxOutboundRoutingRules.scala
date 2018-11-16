package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRules Class */
@js.native
trait FaxOutboundRoutingRules extends js.Object {
  val Count: scala.Double = js.native
  def apply(lIndex: scala.Double): FaxOutboundRoutingRule = js.native
  /** Add a rule */
  def Add(
    lCountryCode: scala.Double,
    lAreaCode: scala.Double,
    bUseDevice: scala.Boolean,
    bstrGroupName: java.lang.String,
    lDeviceId: scala.Double
  ): FaxOutboundRoutingRule = js.native
  def Item(lIndex: scala.Double): FaxOutboundRoutingRule = js.native
  /** Get a rule by criteria */
  def ItemByCountryAndArea(lCountryCode: scala.Double, lAreaCode: scala.Double): FaxOutboundRoutingRule = js.native
  /** Remove a rule */
  def Remove(lIndex: scala.Double): scala.Unit = js.native
  /** Remove a rule by criteria */
  def RemoveByCountryAndArea(lCountryCode: scala.Double, lAreaCode: scala.Double): scala.Unit = js.native
}

