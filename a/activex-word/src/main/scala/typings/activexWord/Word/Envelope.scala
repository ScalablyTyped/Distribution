package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Envelope extends StObject {
  
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
  
  def Insert(
    ExtractAddress: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    OmitReturnAddress: js.UndefOr[Any],
    ReturnAddress: js.UndefOr[Any],
    ReturnAutoText: js.UndefOr[Any],
    PrintBarCode: js.UndefOr[Any],
    PrintFIMA: js.UndefOr[Any],
    Size: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    FeedSource: js.UndefOr[Any],
    AddressFromLeft: js.UndefOr[Any],
    AddressFromTop: js.UndefOr[Any],
    ReturnAddressFromLeft: js.UndefOr[Any],
    ReturnAddressFromTop: js.UndefOr[Any],
    DefaultFaceUp: js.UndefOr[Any],
    DefaultOrientation: js.UndefOr[Any],
    PrintEPostage: js.UndefOr[Any],
    Vertical: js.UndefOr[Any],
    RecipientNamefromLeft: js.UndefOr[Any],
    RecipientNamefromTop: js.UndefOr[Any],
    RecipientPostalfromLeft: js.UndefOr[Any],
    RecipientPostalfromTop: js.UndefOr[Any],
    SenderNamefromLeft: js.UndefOr[Any],
    SenderNamefromTop: js.UndefOr[Any],
    SenderPostalfromLeft: js.UndefOr[Any],
    SenderPostalfromTop: js.UndefOr[Any]
  ): Unit
  
  def Insert2000(
    ExtractAddress: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    OmitReturnAddress: js.UndefOr[Any],
    ReturnAddress: js.UndefOr[Any],
    ReturnAutoText: js.UndefOr[Any],
    PrintBarCode: js.UndefOr[Any],
    PrintFIMA: js.UndefOr[Any],
    Size: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    FeedSource: js.UndefOr[Any],
    AddressFromLeft: js.UndefOr[Any],
    AddressFromTop: js.UndefOr[Any],
    ReturnAddressFromLeft: js.UndefOr[Any],
    ReturnAddressFromTop: js.UndefOr[Any],
    DefaultFaceUp: js.UndefOr[Any],
    DefaultOrientation: js.UndefOr[Any]
  ): Unit
  
  def Options(): Unit
  
  val Parent: Any
  
  def PrintOut(
    ExtractAddress: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    OmitReturnAddress: js.UndefOr[Any],
    ReturnAddress: js.UndefOr[Any],
    ReturnAutoText: js.UndefOr[Any],
    PrintBarCode: js.UndefOr[Any],
    PrintFIMA: js.UndefOr[Any],
    Size: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    FeedSource: js.UndefOr[Any],
    AddressFromLeft: js.UndefOr[Any],
    AddressFromTop: js.UndefOr[Any],
    ReturnAddressFromLeft: js.UndefOr[Any],
    ReturnAddressFromTop: js.UndefOr[Any],
    DefaultFaceUp: js.UndefOr[Any],
    DefaultOrientation: js.UndefOr[Any],
    PrintEPostage: js.UndefOr[Any],
    Vertical: js.UndefOr[Any],
    RecipientNamefromLeft: js.UndefOr[Any],
    RecipientNamefromTop: js.UndefOr[Any],
    RecipientPostalfromLeft: js.UndefOr[Any],
    RecipientPostalfromTop: js.UndefOr[Any],
    SenderNamefromLeft: js.UndefOr[Any],
    SenderNamefromTop: js.UndefOr[Any],
    SenderPostalfromLeft: js.UndefOr[Any],
    SenderPostalfromTop: js.UndefOr[Any]
  ): Unit
  
  def PrintOut2000(
    ExtractAddress: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    OmitReturnAddress: js.UndefOr[Any],
    ReturnAddress: js.UndefOr[Any],
    ReturnAutoText: js.UndefOr[Any],
    PrintBarCode: js.UndefOr[Any],
    PrintFIMA: js.UndefOr[Any],
    Size: js.UndefOr[Any],
    Height: js.UndefOr[Any],
    Width: js.UndefOr[Any],
    FeedSource: js.UndefOr[Any],
    AddressFromLeft: js.UndefOr[Any],
    AddressFromTop: js.UndefOr[Any],
    ReturnAddressFromLeft: js.UndefOr[Any],
    ReturnAddressFromTop: js.UndefOr[Any],
    DefaultFaceUp: js.UndefOr[Any],
    DefaultOrientation: js.UndefOr[Any]
  ): Unit
  
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
  
  def UpdateDocument(): Unit
  
  var Vertical: Boolean
  
  /* private */ @JSName("Word.Envelope_typekey")
  var WordDotEnvelope_typekey: Envelope
}
object Envelope {
  
  inline def apply(
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
    Insert2000: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit,
    Options: () => Unit,
    Parent: Any,
    PrintOut2000: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit,
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
  
  extension [Self <: Envelope](x: Self) {
    
    inline def setAddress(value: Range): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressFromLeft(value: Double): Self = StObject.set(x, "AddressFromLeft", value.asInstanceOf[js.Any])
    
    inline def setAddressFromTop(value: Double): Self = StObject.set(x, "AddressFromTop", value.asInstanceOf[js.Any])
    
    inline def setAddressStyle(value: Style): Self = StObject.set(x, "AddressStyle", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDefaultFaceUp(value: Boolean): Self = StObject.set(x, "DefaultFaceUp", value.asInstanceOf[js.Any])
    
    inline def setDefaultHeight(value: Double): Self = StObject.set(x, "DefaultHeight", value.asInstanceOf[js.Any])
    
    inline def setDefaultOmitReturnAddress(value: Boolean): Self = StObject.set(x, "DefaultOmitReturnAddress", value.asInstanceOf[js.Any])
    
    inline def setDefaultOrientation(value: WdEnvelopeOrientation): Self = StObject.set(x, "DefaultOrientation", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrintBarCode(value: Boolean): Self = StObject.set(x, "DefaultPrintBarCode", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrintFIMA(value: Boolean): Self = StObject.set(x, "DefaultPrintFIMA", value.asInstanceOf[js.Any])
    
    inline def setDefaultSize(value: String): Self = StObject.set(x, "DefaultSize", value.asInstanceOf[js.Any])
    
    inline def setDefaultWidth(value: Double): Self = StObject.set(x, "DefaultWidth", value.asInstanceOf[js.Any])
    
    inline def setFeedSource(value: WdPaperTray): Self = StObject.set(x, "FeedSource", value.asInstanceOf[js.Any])
    
    inline def setInsert2000(
      value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "Insert2000", js.Any.fromFunction18(value))
    
    inline def setOptions(value: () => Unit): Self = StObject.set(x, "Options", js.Any.fromFunction0(value))
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPrintOut2000(
      value: (js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any], js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "PrintOut2000", js.Any.fromFunction18(value))
    
    inline def setRecipientNamefromLeft(value: Double): Self = StObject.set(x, "RecipientNamefromLeft", value.asInstanceOf[js.Any])
    
    inline def setRecipientNamefromTop(value: Double): Self = StObject.set(x, "RecipientNamefromTop", value.asInstanceOf[js.Any])
    
    inline def setRecipientPostalfromLeft(value: Double): Self = StObject.set(x, "RecipientPostalfromLeft", value.asInstanceOf[js.Any])
    
    inline def setRecipientPostalfromTop(value: Double): Self = StObject.set(x, "RecipientPostalfromTop", value.asInstanceOf[js.Any])
    
    inline def setReturnAddress(value: Range): Self = StObject.set(x, "ReturnAddress", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressFromLeft(value: Double): Self = StObject.set(x, "ReturnAddressFromLeft", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressFromTop(value: Double): Self = StObject.set(x, "ReturnAddressFromTop", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressStyle(value: Style): Self = StObject.set(x, "ReturnAddressStyle", value.asInstanceOf[js.Any])
    
    inline def setSenderNamefromLeft(value: Double): Self = StObject.set(x, "SenderNamefromLeft", value.asInstanceOf[js.Any])
    
    inline def setSenderNamefromTop(value: Double): Self = StObject.set(x, "SenderNamefromTop", value.asInstanceOf[js.Any])
    
    inline def setSenderPostalfromLeft(value: Double): Self = StObject.set(x, "SenderPostalfromLeft", value.asInstanceOf[js.Any])
    
    inline def setSenderPostalfromTop(value: Double): Self = StObject.set(x, "SenderPostalfromTop", value.asInstanceOf[js.Any])
    
    inline def setUpdateDocument(value: () => Unit): Self = StObject.set(x, "UpdateDocument", js.Any.fromFunction0(value))
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "Vertical", value.asInstanceOf[js.Any])
    
    inline def setWordDotEnvelope_typekey(value: Envelope): Self = StObject.set(x, "Word.Envelope_typekey", value.asInstanceOf[js.Any])
  }
}
