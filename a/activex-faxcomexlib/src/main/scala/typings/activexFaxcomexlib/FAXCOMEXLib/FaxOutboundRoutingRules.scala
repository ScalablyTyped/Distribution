package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRules Class */
@js.native
trait FaxOutboundRoutingRules extends js.Object {
  val Count: Double = js.native
  def apply(lIndex: Double): FaxOutboundRoutingRule = js.native
  /** Add a rule */
  def Add(
    lCountryCode: Double,
    lAreaCode: Double,
    bUseDevice: Boolean,
    bstrGroupName: String,
    lDeviceId: Double
  ): FaxOutboundRoutingRule = js.native
  def Item(lIndex: Double): FaxOutboundRoutingRule = js.native
  /** Get a rule by criteria */
  def ItemByCountryAndArea(lCountryCode: Double, lAreaCode: Double): FaxOutboundRoutingRule = js.native
  /** Remove a rule */
  def Remove(lIndex: Double): Unit = js.native
  /** Remove a rule by criteria */
  def RemoveByCountryAndArea(lCountryCode: Double, lAreaCode: Double): Unit = js.native
}

