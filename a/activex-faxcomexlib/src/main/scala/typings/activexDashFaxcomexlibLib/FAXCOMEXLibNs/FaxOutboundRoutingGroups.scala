package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingGroups Class */
@js.native
trait FaxOutboundRoutingGroups extends js.Object {
  val Count: scala.Double = js.native
  def apply(vIndex: java.lang.String): FaxOutboundRoutingGroup = js.native
  def apply(vIndex: scala.Double): FaxOutboundRoutingGroup = js.native
  /** Add a group */
  def Add(bstrName: java.lang.String): FaxOutboundRoutingGroup = js.native
  def Item(vIndex: java.lang.String): FaxOutboundRoutingGroup = js.native
  def Item(vIndex: scala.Double): FaxOutboundRoutingGroup = js.native
  def Remove(vIndex: java.lang.String): scala.Unit = js.native
  /** Remove a group */
  def Remove(vIndex: scala.Double): scala.Unit = js.native
}

