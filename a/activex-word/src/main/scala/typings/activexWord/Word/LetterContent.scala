package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LetterContent extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  var AttentionLine: String = js.native
  
  var CCList: String = js.native
  
  var Closing: String = js.native
  
  val Creator: Double = js.native
  
  var DateFormat: String = js.native
  
  val Duplicate: LetterContent = js.native
  
  var EnclosureNumber: Double = js.native
  
  var IncludeHeaderFooter: Boolean = js.native
  
  var InfoBlock: Boolean = js.native
  
  var LetterStyle: WdLetterStyle = js.native
  
  var Letterhead: Boolean = js.native
  
  var LetterheadLocation: WdLetterheadLocation = js.native
  
  var LetterheadSize: Double = js.native
  
  var MailingInstructions: String = js.native
  
  var PageDesign: String = js.native
  
  val Parent: js.Any = js.native
  
  var RecipientAddress: String = js.native
  
  var RecipientCode: String = js.native
  
  var RecipientGender: WdSalutationGender = js.native
  
  var RecipientName: String = js.native
  
  var RecipientReference: String = js.native
  
  var ReturnAddress: String = js.native
  
  var ReturnAddressShortForm: String = js.native
  
  var Salutation: String = js.native
  
  var SalutationType: WdSalutationType = js.native
  
  var SenderCity: String = js.native
  
  var SenderCode: String = js.native
  
  var SenderCompany: String = js.native
  
  var SenderGender: WdSalutationGender = js.native
  
  var SenderInitials: String = js.native
  
  var SenderJobTitle: String = js.native
  
  var SenderName: String = js.native
  
  var SenderReference: String = js.native
  
  var Subject: String = js.native
  
  @JSName("Word.LetterContent_typekey")
  var WordDotLetterContent_typekey: LetterContent = js.native
}
object LetterContent {
  
  @scala.inline
  def apply(
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
    Parent: js.Any,
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
  implicit class LetterContentOps[Self <: LetterContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttentionLine(value: String): Self = this.set("AttentionLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCCList(value: String): Self = this.set("CCList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosing(value: String): Self = this.set("Closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("DateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicate(value: LetterContent): Self = this.set("Duplicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnclosureNumber(value: Double): Self = this.set("EnclosureNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHeaderFooter(value: Boolean): Self = this.set("IncludeHeaderFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoBlock(value: Boolean): Self = this.set("InfoBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterStyle(value: WdLetterStyle): Self = this.set("LetterStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterhead(value: Boolean): Self = this.set("Letterhead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterheadLocation(value: WdLetterheadLocation): Self = this.set("LetterheadLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterheadSize(value: Double): Self = this.set("LetterheadSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailingInstructions(value: String): Self = this.set("MailingInstructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDesign(value: String): Self = this.set("PageDesign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAddress(value: String): Self = this.set("RecipientAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientCode(value: String): Self = this.set("RecipientCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientGender(value: WdSalutationGender): Self = this.set("RecipientGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientName(value: String): Self = this.set("RecipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientReference(value: String): Self = this.set("RecipientReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAddress(value: String): Self = this.set("ReturnAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnAddressShortForm(value: String): Self = this.set("ReturnAddressShortForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalutation(value: String): Self = this.set("Salutation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalutationType(value: WdSalutationType): Self = this.set("SalutationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderCity(value: String): Self = this.set("SenderCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderCode(value: String): Self = this.set("SenderCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderCompany(value: String): Self = this.set("SenderCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderGender(value: WdSalutationGender): Self = this.set("SenderGender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderInitials(value: String): Self = this.set("SenderInitials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderJobTitle(value: String): Self = this.set("SenderJobTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderName(value: String): Self = this.set("SenderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderReference(value: String): Self = this.set("SenderReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotLetterContent_typekey(value: LetterContent): Self = this.set("Word.LetterContent_typekey", value.asInstanceOf[js.Any])
  }
}
