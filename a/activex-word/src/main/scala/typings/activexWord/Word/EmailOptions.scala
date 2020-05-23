package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  var AutoFormatAsYouTypeApplyBorders: Boolean
  var AutoFormatAsYouTypeApplyBulletedLists: Boolean
  var AutoFormatAsYouTypeApplyClosings: Boolean
  var AutoFormatAsYouTypeApplyDates: Boolean
  var AutoFormatAsYouTypeApplyFirstIndents: Boolean
  var AutoFormatAsYouTypeApplyHeadings: Boolean
  var AutoFormatAsYouTypeApplyNumberedLists: Boolean
  var AutoFormatAsYouTypeApplyTables: Boolean
  var AutoFormatAsYouTypeAutoLetterWizard: Boolean
  var AutoFormatAsYouTypeDefineStyles: Boolean
  var AutoFormatAsYouTypeDeleteAutoSpaces: Boolean
  var AutoFormatAsYouTypeFormatListItemBeginning: Boolean
  var AutoFormatAsYouTypeInsertClosings: Boolean
  var AutoFormatAsYouTypeInsertOvers: Boolean
  var AutoFormatAsYouTypeMatchParentheses: Boolean
  var AutoFormatAsYouTypeReplaceFarEastDashes: Boolean
  var AutoFormatAsYouTypeReplaceFractions: Boolean
  var AutoFormatAsYouTypeReplaceHyperlinks: Boolean
  var AutoFormatAsYouTypeReplaceOrdinals: Boolean
  var AutoFormatAsYouTypeReplacePlainTextEmphasis: Boolean
  var AutoFormatAsYouTypeReplaceQuotes: Boolean
  var AutoFormatAsYouTypeReplaceSymbols: Boolean
  val ComposeStyle: Style
  val Creator: Double
  val Dummy1: Boolean
  val Dummy2: Boolean
  val EmailSignature: typings.activexWord.Word.EmailSignature
  var EmbedSmartTag: Boolean
  var HTMLFidelity: WdEmailHTMLFidelity
  var MarkComments: Boolean
  var MarkCommentsWith: String
  var NewColorOnReply: Boolean
  val Parent: js.Any
  val PlainTextStyle: Style
  var RelyOnCSS: Boolean
  val ReplyStyle: Style
  var TabIndentKey: Boolean
  var ThemeName: String
  var UseThemeStyle: Boolean
  var UseThemeStyleOnReply: Boolean
  @JSName("Word.EmailOptions_typekey")
  var WordDotEmailOptions_typekey: EmailOptions
  def Dummy3(): Unit
}

object EmailOptions {
  @scala.inline
  def apply(
    Application: Application,
    AutoFormatAsYouTypeApplyBorders: Boolean,
    AutoFormatAsYouTypeApplyBulletedLists: Boolean,
    AutoFormatAsYouTypeApplyClosings: Boolean,
    AutoFormatAsYouTypeApplyDates: Boolean,
    AutoFormatAsYouTypeApplyFirstIndents: Boolean,
    AutoFormatAsYouTypeApplyHeadings: Boolean,
    AutoFormatAsYouTypeApplyNumberedLists: Boolean,
    AutoFormatAsYouTypeApplyTables: Boolean,
    AutoFormatAsYouTypeAutoLetterWizard: Boolean,
    AutoFormatAsYouTypeDefineStyles: Boolean,
    AutoFormatAsYouTypeDeleteAutoSpaces: Boolean,
    AutoFormatAsYouTypeFormatListItemBeginning: Boolean,
    AutoFormatAsYouTypeInsertClosings: Boolean,
    AutoFormatAsYouTypeInsertOvers: Boolean,
    AutoFormatAsYouTypeMatchParentheses: Boolean,
    AutoFormatAsYouTypeReplaceFarEastDashes: Boolean,
    AutoFormatAsYouTypeReplaceFractions: Boolean,
    AutoFormatAsYouTypeReplaceHyperlinks: Boolean,
    AutoFormatAsYouTypeReplaceOrdinals: Boolean,
    AutoFormatAsYouTypeReplacePlainTextEmphasis: Boolean,
    AutoFormatAsYouTypeReplaceQuotes: Boolean,
    AutoFormatAsYouTypeReplaceSymbols: Boolean,
    ComposeStyle: Style,
    Creator: Double,
    Dummy1: Boolean,
    Dummy2: Boolean,
    Dummy3: () => Unit,
    EmailSignature: EmailSignature,
    EmbedSmartTag: Boolean,
    HTMLFidelity: WdEmailHTMLFidelity,
    MarkComments: Boolean,
    MarkCommentsWith: String,
    NewColorOnReply: Boolean,
    Parent: js.Any,
    PlainTextStyle: Style,
    RelyOnCSS: Boolean,
    ReplyStyle: Style,
    TabIndentKey: Boolean,
    ThemeName: String,
    UseThemeStyle: Boolean,
    UseThemeStyleOnReply: Boolean,
    WordDotEmailOptions_typekey: EmailOptions
  ): EmailOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyBorders = AutoFormatAsYouTypeApplyBorders.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyBulletedLists = AutoFormatAsYouTypeApplyBulletedLists.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyClosings = AutoFormatAsYouTypeApplyClosings.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyDates = AutoFormatAsYouTypeApplyDates.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyFirstIndents = AutoFormatAsYouTypeApplyFirstIndents.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyHeadings = AutoFormatAsYouTypeApplyHeadings.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyNumberedLists = AutoFormatAsYouTypeApplyNumberedLists.asInstanceOf[js.Any], AutoFormatAsYouTypeApplyTables = AutoFormatAsYouTypeApplyTables.asInstanceOf[js.Any], AutoFormatAsYouTypeAutoLetterWizard = AutoFormatAsYouTypeAutoLetterWizard.asInstanceOf[js.Any], AutoFormatAsYouTypeDefineStyles = AutoFormatAsYouTypeDefineStyles.asInstanceOf[js.Any], AutoFormatAsYouTypeDeleteAutoSpaces = AutoFormatAsYouTypeDeleteAutoSpaces.asInstanceOf[js.Any], AutoFormatAsYouTypeFormatListItemBeginning = AutoFormatAsYouTypeFormatListItemBeginning.asInstanceOf[js.Any], AutoFormatAsYouTypeInsertClosings = AutoFormatAsYouTypeInsertClosings.asInstanceOf[js.Any], AutoFormatAsYouTypeInsertOvers = AutoFormatAsYouTypeInsertOvers.asInstanceOf[js.Any], AutoFormatAsYouTypeMatchParentheses = AutoFormatAsYouTypeMatchParentheses.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceFarEastDashes = AutoFormatAsYouTypeReplaceFarEastDashes.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceFractions = AutoFormatAsYouTypeReplaceFractions.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceHyperlinks = AutoFormatAsYouTypeReplaceHyperlinks.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceOrdinals = AutoFormatAsYouTypeReplaceOrdinals.asInstanceOf[js.Any], AutoFormatAsYouTypeReplacePlainTextEmphasis = AutoFormatAsYouTypeReplacePlainTextEmphasis.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceQuotes = AutoFormatAsYouTypeReplaceQuotes.asInstanceOf[js.Any], AutoFormatAsYouTypeReplaceSymbols = AutoFormatAsYouTypeReplaceSymbols.asInstanceOf[js.Any], ComposeStyle = ComposeStyle.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Dummy1 = Dummy1.asInstanceOf[js.Any], Dummy2 = Dummy2.asInstanceOf[js.Any], Dummy3 = js.Any.fromFunction0(Dummy3), EmailSignature = EmailSignature.asInstanceOf[js.Any], EmbedSmartTag = EmbedSmartTag.asInstanceOf[js.Any], HTMLFidelity = HTMLFidelity.asInstanceOf[js.Any], MarkComments = MarkComments.asInstanceOf[js.Any], MarkCommentsWith = MarkCommentsWith.asInstanceOf[js.Any], NewColorOnReply = NewColorOnReply.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlainTextStyle = PlainTextStyle.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], ReplyStyle = ReplyStyle.asInstanceOf[js.Any], TabIndentKey = TabIndentKey.asInstanceOf[js.Any], ThemeName = ThemeName.asInstanceOf[js.Any], UseThemeStyle = UseThemeStyle.asInstanceOf[js.Any], UseThemeStyleOnReply = UseThemeStyleOnReply.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EmailOptions_typekey")(WordDotEmailOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
}

