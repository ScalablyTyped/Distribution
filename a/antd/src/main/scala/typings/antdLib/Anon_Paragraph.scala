package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Paragraph extends js.Object {
  var Paragraph: reactLib.reactMod.SFC[antdLib.libTypographyParagraphMod.ParagraphProps]
  var Text: reactLib.reactMod.SFC[antdLib.libTypographyTextMod.TextProps]
  var Title: reactLib.reactMod.SFC[antdLib.libTypographyTitleMod.TitleProps]
}

object Anon_Paragraph {
  @scala.inline
  def apply(
    Paragraph: reactLib.reactMod.SFC[antdLib.libTypographyParagraphMod.ParagraphProps],
    Text: reactLib.reactMod.SFC[antdLib.libTypographyTextMod.TextProps],
    Title: reactLib.reactMod.SFC[antdLib.libTypographyTitleMod.TitleProps]
  ): Anon_Paragraph = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph, Text = Text, Title = Title)
  
    __obj.asInstanceOf[Anon_Paragraph]
  }
}

