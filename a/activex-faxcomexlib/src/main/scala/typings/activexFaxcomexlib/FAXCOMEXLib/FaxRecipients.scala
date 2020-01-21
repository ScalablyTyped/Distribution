package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxRecipients Class */
@js.native
trait FaxRecipients extends js.Object {
  val Count: Double = js.native
  def apply(lIndex: Double): FaxRecipient = js.native
  /**
    * Add a recipient
    * @param string [bstrRecipientName='']
    */
  def Add(bstrFaxNumber: String): FaxRecipient = js.native
  def Add(bstrFaxNumber: String, bstrRecipientName: String): FaxRecipient = js.native
  def Item(lIndex: Double): FaxRecipient = js.native
  /** Remove a recipient */
  def Remove(lIndex: Double): Unit = js.native
}

