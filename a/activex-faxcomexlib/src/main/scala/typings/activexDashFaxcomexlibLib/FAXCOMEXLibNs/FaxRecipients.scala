package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxRecipients Class */
@js.native
trait FaxRecipients extends js.Object {
  val Count: scala.Double = js.native
  def apply(lIndex: scala.Double): FaxRecipient = js.native
  /**
           * Add a recipient
           * @param string [bstrRecipientName='']
           */
  def Add(bstrFaxNumber: java.lang.String): FaxRecipient = js.native
  /**
           * Add a recipient
           * @param string [bstrRecipientName='']
           */
  def Add(bstrFaxNumber: java.lang.String, bstrRecipientName: java.lang.String): FaxRecipient = js.native
  def Item(lIndex: scala.Double): FaxRecipient = js.native
  /** Remove a recipient */
  def Remove(lIndex: scala.Double): scala.Unit = js.native
}

