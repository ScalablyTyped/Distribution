package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LetterContent extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  var AttentionLine: String
  
  var CCList: String
  
  var Closing: String
  
  val Creator: Double
  
  var DateFormat: String
  
  val Duplicate: LetterContent
  
  var EnclosureNumber: Double
  
  var IncludeHeaderFooter: Boolean
  
  var InfoBlock: Boolean
  
  var LetterStyle: WdLetterStyle
  
  var Letterhead: Boolean
  
  var LetterheadLocation: WdLetterheadLocation
  
  var LetterheadSize: Double
  
  var MailingInstructions: String
  
  var PageDesign: String
  
  val Parent: Any
  
  var RecipientAddress: String
  
  var RecipientCode: String
  
  var RecipientGender: WdSalutationGender
  
  var RecipientName: String
  
  var RecipientReference: String
  
  var ReturnAddress: String
  
  var ReturnAddressShortForm: String
  
  var Salutation: String
  
  var SalutationType: WdSalutationType
  
  var SenderCity: String
  
  var SenderCode: String
  
  var SenderCompany: String
  
  var SenderGender: WdSalutationGender
  
  var SenderInitials: String
  
  var SenderJobTitle: String
  
  var SenderName: String
  
  var SenderReference: String
  
  var Subject: String
  
  /* private */ @JSName("Word.LetterContent_typekey")
  var WordDotLetterContent_typekey: LetterContent
}
object LetterContent {
  
  inline def apply(
    Application: Application,
    AttentionLine: String,
    CCList: String,
    Closing: String,
    Creator: Double,
    DateFormat: String,
    Duplicate: LetterContent,
    EnclosureNumber: Double,
    IncludeHeaderFooter: Boolean,
    InfoBlock: Boolean,
    LetterStyle: WdLetterStyle,
    Letterhead: Boolean,
    LetterheadLocation: WdLetterheadLocation,
    LetterheadSize: Double,
    MailingInstructions: String,
    PageDesign: String,
    Parent: Any,
    RecipientAddress: String,
    RecipientCode: String,
    RecipientGender: WdSalutationGender,
    RecipientName: String,
    RecipientReference: String,
    ReturnAddress: String,
    ReturnAddressShortForm: String,
    Salutation: String,
    SalutationType: WdSalutationType,
    SenderCity: String,
    SenderCode: String,
    SenderCompany: String,
    SenderGender: WdSalutationGender,
    SenderInitials: String,
    SenderJobTitle: String,
    SenderName: String,
    SenderReference: String,
    Subject: String,
    WordDotLetterContent_typekey: LetterContent
  ): LetterContent = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttentionLine = AttentionLine.asInstanceOf[js.Any], CCList = CCList.asInstanceOf[js.Any], Closing = Closing.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DateFormat = DateFormat.asInstanceOf[js.Any], Duplicate = Duplicate.asInstanceOf[js.Any], EnclosureNumber = EnclosureNumber.asInstanceOf[js.Any], IncludeHeaderFooter = IncludeHeaderFooter.asInstanceOf[js.Any], InfoBlock = InfoBlock.asInstanceOf[js.Any], LetterStyle = LetterStyle.asInstanceOf[js.Any], Letterhead = Letterhead.asInstanceOf[js.Any], LetterheadLocation = LetterheadLocation.asInstanceOf[js.Any], LetterheadSize = LetterheadSize.asInstanceOf[js.Any], MailingInstructions = MailingInstructions.asInstanceOf[js.Any], PageDesign = PageDesign.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RecipientAddress = RecipientAddress.asInstanceOf[js.Any], RecipientCode = RecipientCode.asInstanceOf[js.Any], RecipientGender = RecipientGender.asInstanceOf[js.Any], RecipientName = RecipientName.asInstanceOf[js.Any], RecipientReference = RecipientReference.asInstanceOf[js.Any], ReturnAddress = ReturnAddress.asInstanceOf[js.Any], ReturnAddressShortForm = ReturnAddressShortForm.asInstanceOf[js.Any], Salutation = Salutation.asInstanceOf[js.Any], SalutationType = SalutationType.asInstanceOf[js.Any], SenderCity = SenderCity.asInstanceOf[js.Any], SenderCode = SenderCode.asInstanceOf[js.Any], SenderCompany = SenderCompany.asInstanceOf[js.Any], SenderGender = SenderGender.asInstanceOf[js.Any], SenderInitials = SenderInitials.asInstanceOf[js.Any], SenderJobTitle = SenderJobTitle.asInstanceOf[js.Any], SenderName = SenderName.asInstanceOf[js.Any], SenderReference = SenderReference.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.LetterContent_typekey")(WordDotLetterContent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LetterContent] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setAttentionLine(value: String): Self = StObject.set(x, "AttentionLine", value.asInstanceOf[js.Any])
    
    inline def setCCList(value: String): Self = StObject.set(x, "CCList", value.asInstanceOf[js.Any])
    
    inline def setClosing(value: String): Self = StObject.set(x, "Closing", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "DateFormat", value.asInstanceOf[js.Any])
    
    inline def setDuplicate(value: LetterContent): Self = StObject.set(x, "Duplicate", value.asInstanceOf[js.Any])
    
    inline def setEnclosureNumber(value: Double): Self = StObject.set(x, "EnclosureNumber", value.asInstanceOf[js.Any])
    
    inline def setIncludeHeaderFooter(value: Boolean): Self = StObject.set(x, "IncludeHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setInfoBlock(value: Boolean): Self = StObject.set(x, "InfoBlock", value.asInstanceOf[js.Any])
    
    inline def setLetterStyle(value: WdLetterStyle): Self = StObject.set(x, "LetterStyle", value.asInstanceOf[js.Any])
    
    inline def setLetterhead(value: Boolean): Self = StObject.set(x, "Letterhead", value.asInstanceOf[js.Any])
    
    inline def setLetterheadLocation(value: WdLetterheadLocation): Self = StObject.set(x, "LetterheadLocation", value.asInstanceOf[js.Any])
    
    inline def setLetterheadSize(value: Double): Self = StObject.set(x, "LetterheadSize", value.asInstanceOf[js.Any])
    
    inline def setMailingInstructions(value: String): Self = StObject.set(x, "MailingInstructions", value.asInstanceOf[js.Any])
    
    inline def setPageDesign(value: String): Self = StObject.set(x, "PageDesign", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRecipientAddress(value: String): Self = StObject.set(x, "RecipientAddress", value.asInstanceOf[js.Any])
    
    inline def setRecipientCode(value: String): Self = StObject.set(x, "RecipientCode", value.asInstanceOf[js.Any])
    
    inline def setRecipientGender(value: WdSalutationGender): Self = StObject.set(x, "RecipientGender", value.asInstanceOf[js.Any])
    
    inline def setRecipientName(value: String): Self = StObject.set(x, "RecipientName", value.asInstanceOf[js.Any])
    
    inline def setRecipientReference(value: String): Self = StObject.set(x, "RecipientReference", value.asInstanceOf[js.Any])
    
    inline def setReturnAddress(value: String): Self = StObject.set(x, "ReturnAddress", value.asInstanceOf[js.Any])
    
    inline def setReturnAddressShortForm(value: String): Self = StObject.set(x, "ReturnAddressShortForm", value.asInstanceOf[js.Any])
    
    inline def setSalutation(value: String): Self = StObject.set(x, "Salutation", value.asInstanceOf[js.Any])
    
    inline def setSalutationType(value: WdSalutationType): Self = StObject.set(x, "SalutationType", value.asInstanceOf[js.Any])
    
    inline def setSenderCity(value: String): Self = StObject.set(x, "SenderCity", value.asInstanceOf[js.Any])
    
    inline def setSenderCode(value: String): Self = StObject.set(x, "SenderCode", value.asInstanceOf[js.Any])
    
    inline def setSenderCompany(value: String): Self = StObject.set(x, "SenderCompany", value.asInstanceOf[js.Any])
    
    inline def setSenderGender(value: WdSalutationGender): Self = StObject.set(x, "SenderGender", value.asInstanceOf[js.Any])
    
    inline def setSenderInitials(value: String): Self = StObject.set(x, "SenderInitials", value.asInstanceOf[js.Any])
    
    inline def setSenderJobTitle(value: String): Self = StObject.set(x, "SenderJobTitle", value.asInstanceOf[js.Any])
    
    inline def setSenderName(value: String): Self = StObject.set(x, "SenderName", value.asInstanceOf[js.Any])
    
    inline def setSenderReference(value: String): Self = StObject.set(x, "SenderReference", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setWordDotLetterContent_typekey(value: LetterContent): Self = StObject.set(x, "Word.LetterContent_typekey", value.asInstanceOf[js.Any])
  }
}
