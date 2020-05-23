package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterContent extends js.Object {
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
  val Parent: js.Any
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
  @JSName("Word.LetterContent_typekey")
  var WordDotLetterContent_typekey: LetterContent
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
}

