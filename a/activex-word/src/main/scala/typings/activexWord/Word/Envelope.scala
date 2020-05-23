package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  val Address: Range
  var AddressFromLeft: Double
  var AddressFromTop: Double
  val AddressStyle: Style
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var DefaultFaceUp: Boolean
  var DefaultHeight: Double
  var DefaultOmitReturnAddress: Boolean
  var DefaultOrientation: WdEnvelopeOrientation
  var DefaultPrintBarCode: Boolean
  var DefaultPrintFIMA: Boolean
  var DefaultSize: String
  var DefaultWidth: Double
  var FeedSource: WdPaperTray
  val Parent: js.Any
  var RecipientNamefromLeft: Double
  var RecipientNamefromTop: Double
  var RecipientPostalfromLeft: Double
  var RecipientPostalfromTop: Double
  val ReturnAddress: Range
  var ReturnAddressFromLeft: Double
  var ReturnAddressFromTop: Double
  val ReturnAddressStyle: Style
  var SenderNamefromLeft: Double
  var SenderNamefromTop: Double
  var SenderPostalfromLeft: Double
  var SenderPostalfromTop: Double
  var Vertical: Boolean
  @JSName("Word.Envelope_typekey")
  var WordDotEnvelope_typekey: Envelope
  def Insert(
    ExtractAddress: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    OmitReturnAddress: js.UndefOr[js.Any],
    ReturnAddress: js.UndefOr[js.Any],
    ReturnAutoText: js.UndefOr[js.Any],
    PrintBarCode: js.UndefOr[js.Any],
    PrintFIMA: js.UndefOr[js.Any],
    Size: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    FeedSource: js.UndefOr[js.Any],
    AddressFromLeft: js.UndefOr[js.Any],
    AddressFromTop: js.UndefOr[js.Any],
    ReturnAddressFromLeft: js.UndefOr[js.Any],
    ReturnAddressFromTop: js.UndefOr[js.Any],
    DefaultFaceUp: js.UndefOr[js.Any],
    DefaultOrientation: js.UndefOr[js.Any],
    PrintEPostage: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any],
    RecipientNamefromLeft: js.UndefOr[js.Any],
    RecipientNamefromTop: js.UndefOr[js.Any],
    RecipientPostalfromLeft: js.UndefOr[js.Any],
    RecipientPostalfromTop: js.UndefOr[js.Any],
    SenderNamefromLeft: js.UndefOr[js.Any],
    SenderNamefromTop: js.UndefOr[js.Any],
    SenderPostalfromLeft: js.UndefOr[js.Any],
    SenderPostalfromTop: js.UndefOr[js.Any]
  ): Unit
  def Insert2000(
    ExtractAddress: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    OmitReturnAddress: js.UndefOr[js.Any],
    ReturnAddress: js.UndefOr[js.Any],
    ReturnAutoText: js.UndefOr[js.Any],
    PrintBarCode: js.UndefOr[js.Any],
    PrintFIMA: js.UndefOr[js.Any],
    Size: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    FeedSource: js.UndefOr[js.Any],
    AddressFromLeft: js.UndefOr[js.Any],
    AddressFromTop: js.UndefOr[js.Any],
    ReturnAddressFromLeft: js.UndefOr[js.Any],
    ReturnAddressFromTop: js.UndefOr[js.Any],
    DefaultFaceUp: js.UndefOr[js.Any],
    DefaultOrientation: js.UndefOr[js.Any]
  ): Unit
  def Options(): Unit
  def PrintOut(
    ExtractAddress: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    OmitReturnAddress: js.UndefOr[js.Any],
    ReturnAddress: js.UndefOr[js.Any],
    ReturnAutoText: js.UndefOr[js.Any],
    PrintBarCode: js.UndefOr[js.Any],
    PrintFIMA: js.UndefOr[js.Any],
    Size: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    FeedSource: js.UndefOr[js.Any],
    AddressFromLeft: js.UndefOr[js.Any],
    AddressFromTop: js.UndefOr[js.Any],
    ReturnAddressFromLeft: js.UndefOr[js.Any],
    ReturnAddressFromTop: js.UndefOr[js.Any],
    DefaultFaceUp: js.UndefOr[js.Any],
    DefaultOrientation: js.UndefOr[js.Any],
    PrintEPostage: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any],
    RecipientNamefromLeft: js.UndefOr[js.Any],
    RecipientNamefromTop: js.UndefOr[js.Any],
    RecipientPostalfromLeft: js.UndefOr[js.Any],
    RecipientPostalfromTop: js.UndefOr[js.Any],
    SenderNamefromLeft: js.UndefOr[js.Any],
    SenderNamefromTop: js.UndefOr[js.Any],
    SenderPostalfromLeft: js.UndefOr[js.Any],
    SenderPostalfromTop: js.UndefOr[js.Any]
  ): Unit
  def PrintOut2000(
    ExtractAddress: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    OmitReturnAddress: js.UndefOr[js.Any],
    ReturnAddress: js.UndefOr[js.Any],
    ReturnAutoText: js.UndefOr[js.Any],
    PrintBarCode: js.UndefOr[js.Any],
    PrintFIMA: js.UndefOr[js.Any],
    Size: js.UndefOr[js.Any],
    Height: js.UndefOr[js.Any],
    Width: js.UndefOr[js.Any],
    FeedSource: js.UndefOr[js.Any],
    AddressFromLeft: js.UndefOr[js.Any],
    AddressFromTop: js.UndefOr[js.Any],
    ReturnAddressFromLeft: js.UndefOr[js.Any],
    ReturnAddressFromTop: js.UndefOr[js.Any],
    DefaultFaceUp: js.UndefOr[js.Any],
    DefaultOrientation: js.UndefOr[js.Any]
  ): Unit
  def UpdateDocument(): Unit
}

object Envelope {
  @scala.inline
  def apply(
    Address: Range,
    AddressFromLeft: Double,
    AddressFromTop: Double,
    AddressStyle: Style,
    Application: Application,
    Creator: Double,
    DefaultFaceUp: Boolean,
    DefaultHeight: Double,
    DefaultOmitReturnAddress: Boolean,
    DefaultOrientation: WdEnvelopeOrientation,
    DefaultPrintBarCode: Boolean,
    DefaultPrintFIMA: Boolean,
    DefaultSize: String,
    DefaultWidth: Double,
    FeedSource: WdPaperTray,
    Insert2000: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit,
    Options: () => Unit,
    Parent: js.Any,
    PrintOut2000: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit,
    RecipientNamefromLeft: Double,
    RecipientNamefromTop: Double,
    RecipientPostalfromLeft: Double,
    RecipientPostalfromTop: Double,
    ReturnAddress: Range,
    ReturnAddressFromLeft: Double,
    ReturnAddressFromTop: Double,
    ReturnAddressStyle: Style,
    SenderNamefromLeft: Double,
    SenderNamefromTop: Double,
    SenderPostalfromLeft: Double,
    SenderPostalfromTop: Double,
    UpdateDocument: () => Unit,
    Vertical: Boolean,
    WordDotEnvelope_typekey: Envelope
  ): Envelope = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], AddressFromLeft = AddressFromLeft.asInstanceOf[js.Any], AddressFromTop = AddressFromTop.asInstanceOf[js.Any], AddressStyle = AddressStyle.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DefaultFaceUp = DefaultFaceUp.asInstanceOf[js.Any], DefaultHeight = DefaultHeight.asInstanceOf[js.Any], DefaultOmitReturnAddress = DefaultOmitReturnAddress.asInstanceOf[js.Any], DefaultOrientation = DefaultOrientation.asInstanceOf[js.Any], DefaultPrintBarCode = DefaultPrintBarCode.asInstanceOf[js.Any], DefaultPrintFIMA = DefaultPrintFIMA.asInstanceOf[js.Any], DefaultSize = DefaultSize.asInstanceOf[js.Any], DefaultWidth = DefaultWidth.asInstanceOf[js.Any], FeedSource = FeedSource.asInstanceOf[js.Any], Insert2000 = js.Any.fromFunction18(Insert2000), Options = js.Any.fromFunction0(Options), Parent = Parent.asInstanceOf[js.Any], PrintOut2000 = js.Any.fromFunction18(PrintOut2000), RecipientNamefromLeft = RecipientNamefromLeft.asInstanceOf[js.Any], RecipientNamefromTop = RecipientNamefromTop.asInstanceOf[js.Any], RecipientPostalfromLeft = RecipientPostalfromLeft.asInstanceOf[js.Any], RecipientPostalfromTop = RecipientPostalfromTop.asInstanceOf[js.Any], ReturnAddress = ReturnAddress.asInstanceOf[js.Any], ReturnAddressFromLeft = ReturnAddressFromLeft.asInstanceOf[js.Any], ReturnAddressFromTop = ReturnAddressFromTop.asInstanceOf[js.Any], ReturnAddressStyle = ReturnAddressStyle.asInstanceOf[js.Any], SenderNamefromLeft = SenderNamefromLeft.asInstanceOf[js.Any], SenderNamefromTop = SenderNamefromTop.asInstanceOf[js.Any], SenderPostalfromLeft = SenderPostalfromLeft.asInstanceOf[js.Any], SenderPostalfromTop = SenderPostalfromTop.asInstanceOf[js.Any], UpdateDocument = js.Any.fromFunction0(UpdateDocument), Vertical = Vertical.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Envelope_typekey")(WordDotEnvelope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

