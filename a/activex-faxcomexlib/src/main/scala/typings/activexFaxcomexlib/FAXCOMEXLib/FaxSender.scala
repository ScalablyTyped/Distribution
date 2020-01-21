package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSender Class */
@JSGlobal("FAXCOMEXLib.FaxSender")
@js.native
class FaxSender protected () extends js.Object {
  /** Sender's billing code */
  var BillingCode: String = js.native
  /** City */
  var City: String = js.native
  /** Sender's company */
  var Company: String = js.native
  /** Sender's country or region */
  var Country: String = js.native
  /** Sender's department */
  var Department: String = js.native
  /** Sender's e-mail address */
  var Email: String = js.native
  @JSName("FAXCOMEXLib.FaxSender_typekey")
  var FAXCOMEXLibDotFaxSender_typekey: FaxSender = js.native
  /** Sender's fax number */
  var FaxNumber: String = js.native
  /** Sender's home phone */
  var HomePhone: String = js.native
  /** Sender's name */
  var Name: String = js.native
  /** Sender's office location */
  var OfficeLocation: String = js.native
  /** Sender's office phone */
  var OfficePhone: String = js.native
  /** Sender's state */
  var State: String = js.native
  /** Sender's street address */
  var StreetAddress: String = js.native
  /** Transmitting Station ID */
  var TSID: String = js.native
  /** Sender's title */
  var Title: String = js.native
  /** Sender's zip code */
  var ZipCode: String = js.native
  /** Load default sender */
  def LoadDefaultSender(): Unit = js.native
  /** Save default sender */
  def SaveDefaultSender(): Unit = js.native
}

