package typings.activexFaxcomexlib.FAXCOMEXLib

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessage Class */
trait FaxIncomingMessage extends IFaxIncomingMessage {
  @JSName("FAXCOMEXLib.FaxIncomingMessage_typekey")
  var FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage
  /** Has Cover page */
  var HasCoverPage: Boolean
  /** Read flag on the message */
  var Read: Boolean
  /** Set of recipient names */
  var Recipients: String
  /** Sender's fax number */
  var SenderFaxNumber: String
  /** Sender's name */
  var SenderName: String
  /** Contents of cover page subject field */
  var Subject: String
  /** Is message reassigned? */
  val WasReAssigned: Boolean
  /** Reassigns the message */
  def ReAssign(): Unit
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxIncomingMessage {
  @scala.inline
  def apply(
    CSID: String,
    CallerId: String,
    CopyTiff: String => Unit,
    Delete: () => Unit,
    DeviceName: String,
    FAXCOMEXLibDotFaxIncomingMessage_typekey: FaxIncomingMessage,
    HasCoverPage: Boolean,
    Id: String,
    Pages: Double,
    ReAssign: () => Unit,
    Read: Boolean,
    Recipients: String,
    Refresh: () => Unit,
    Retries: Double,
    RoutingInformation: String,
    Save: () => Unit,
    SenderFaxNumber: String,
    SenderName: String,
    Size: Double,
    Subject: String,
    TSID: String,
    TransmissionEnd: VarDate,
    TransmissionStart: VarDate,
    WasReAssigned: Boolean
  ): FaxIncomingMessage = {
    val __obj = js.Dynamic.literal(CSID = CSID.asInstanceOf[js.Any], CallerId = CallerId.asInstanceOf[js.Any], CopyTiff = js.Any.fromFunction1(CopyTiff), Delete = js.Any.fromFunction0(Delete), DeviceName = DeviceName.asInstanceOf[js.Any], HasCoverPage = HasCoverPage.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], ReAssign = js.Any.fromFunction0(ReAssign), Read = Read.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Retries = Retries.asInstanceOf[js.Any], RoutingInformation = RoutingInformation.asInstanceOf[js.Any], Save = js.Any.fromFunction0(Save), SenderFaxNumber = SenderFaxNumber.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TSID = TSID.asInstanceOf[js.Any], TransmissionEnd = TransmissionEnd.asInstanceOf[js.Any], TransmissionStart = TransmissionStart.asInstanceOf[js.Any], WasReAssigned = WasReAssigned.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessage_typekey")(FAXCOMEXLibDotFaxIncomingMessage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessage]
  }
}

